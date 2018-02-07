//Author: Joyin Wong
//a b c d e f g h i j 
import java.util.Arrays;

public class ArrayMethods2 
{
	
	public static void main(String[] args)
	{

		int[] list = {4, 8, 3, 1, 0, 2, 6, 5, 7, 9};
		String[] list1 = {"a", "d", "e", "h", "j"};
		String[] list2 = {"b", "c", "f", "g", "i"};
		String[] list3 = new String[list1.length + list2.length];
		
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		merge(list1, list2, list3);
		System.out.println(Arrays.toString(list3));
	}
	
	/*
		public static int partition(int[] list)
		{
		
		}
		*/
	
		//precondition: both list1 and list2 are in alphabetical order
	//list1 is from 0 to x //list2 is from x+1 to y
		public static String[] merge(String[] list1, String[] list2, String[] list3)
		{
			int x = list1.length;
			int y = list2.length;
			int z = x + y;
			String sorted[] = new String [z];
			int a= 0;
			int b = 0;
			int c = 0;
			
			while(a < x && b < y)
			{
				if(list1[a].compareTo(list2[b]) > 0 )
				{
					sorted[c] = list1[a];
					c++;
					a++;
				} else if(list1[a].compareTo(list2[b]) < 0) {
					sorted[c] = list2[b];
					c++;
					b++;
				}
			}
			
			int e = 0;
			int d = 0;
			
			while(d < sorted.length)
			{
				sorted[d] = list3[e];
				d++;
				e++;
			}
			return list3;
		}
	
		
		public static void swapS(String[] arr, int index1, int index2)
		{
			String temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
}
