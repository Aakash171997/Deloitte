import java.util.*;
class arrays
{
	public static void main(String args[])
	{
		int array[] = new int[10];
		for(int loop_index = 9; loop_index > 0; loop_index--)
			array[loop_index] = -loop_index;
		for(int loop_index = 0; loop_index < array.length; loop_index++)
			System.out.print(array[loop_index] + " ");
		System.out.println();
		Arrays.sort(array);
		for(int loop_index = 0; loop_index < array.length; loop_index++)
			System.out.print(array[loop_index] + " ");
		System.out.println();
		System.out.print("Found -5 at position " +
				Arrays.binarySearch(array, -5));
	}
}
