//Author: Joyin Wong
import java.util.Arrays;

public class ArrayMethods2 
{
	
	public static void main(String[] args)
	{

		int[] list = {4, 8, 3, 1, 0, 2, 6, 5, 7, 9};
		String[] list1 = {"a", "d", "e", "h", "j"};
		String[] list2 = {"b", "c", "f", "g", "i"};
		
		
		//Merge test
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println("--Beginning Merge Sequence-- \n beep boop");
		long start = System.nanoTime();
		String[] list3 = merge(list1,list2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge Sequence took: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(list3));
		
		System.out.println();
		System.out.println("__________");
		System.out.println();
		
		//Partition test
		System.out.println(Arrays.toString(list));
		System.out.println("--Beginning Partition Sequence-- \n beep boop");
		start = System.nanoTime();
		int pivotPosition = partition(list);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition Sequence took: " + time + " nanoseconds.");
		System.out.println("Final Pivot Position: " + pivotPosition + ".");
		System.out.println(Arrays.toString(list));
		
	}
	
		public static int partition(int[] list)
		{
			/*
			int last = list.length;
			int first = 0;
			int pivot = list[first];
			while (first < last)
			{
				while (list[first] < pivot) first++;
			    while (list[last] > pivot) last--;
			       swapI(list, first, last);
			}
	      return first;
	      */
			int pivot =list[0];
			int i=0;
			int j=list[list.length-1];
			while(pivot>list[i])
			{
				swapI(list,pivot,i);
				i++;
			}
			while(pivot<list[j])
			{
				swapI(list,pivot,j);
				j--;
			}
			return pivot;
		}
		
	
		//precondition: both list1 and list2 are in alphabetical order
	//list1 is from 0 to x //list2 is from x+1 to y
		public static String[] merge(String[] list1, String[] list2)
		{
			int x = list1.length;
			int y = list2.length;
			int z = x + y;
			String sorted[] = new String [z];
			int a= 0; //counting variable for list1
			int b = 0; //counting variable for list2
			int c = 0; //counting variable for the sorted array
			
			while(a < x && b < y) //makes sure it doesn't count out of bounds
			{
				if(list1[a].compareTo(list2[b]) <= 0 )
				{
					sorted[c] = list1[a];
					c++;
					a++;
				} else if(list1[a].compareTo(list2[b]) > 0) {
					sorted[c] = list2[b];
					c++;
					b++;
				}
			}
			
			//following two while loops is to fill in any leftover numbers
			while (a < x)
			{
				sorted[c] = list1[a];
				a++;
				c++;
			}
			
			while(b < y)
			{
				sorted[c] = list2[b];
				b++;
				c++;
			}
			
			return sorted;
			
		}
	
		//here just in case i need to swap but i dont think i do
		public static void swapS(String[] arr, int index1, int index2)
		{
			String temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		
		public static void swapI(int[] arr, int index1, int index2)
		{
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		
}
