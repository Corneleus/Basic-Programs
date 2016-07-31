package BasicPrograms;
/**
 * A class that has methods for swapping and displaying elements of an array, as
 * well as a main method to test those methods
 *
 * @author Cody Narber & Cory Caswell
 * @version 1.0
 * @since 04-24-15
 * 
 */
public class ArraySwapper {
	/**
	 * This is the main method that tests out our swapping and display methods
	 *
	 * @param args
	 *            is the additional arguments provided to the program through
	 *            the console
	 * 
	 */
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6 };

		printMyArray("Original Array", myArray);
		swapInArray(myArray, 0, 5);
		swapInArray(myArray, -1, 15);
		swapInArray(myArray, 2, 4);
		printMyArray("Swapped Array", myArray);
	}

	/**
	 * This method prints out the contents of an integer array on a single line
	 * with an initial bit of text describing the array's contents
	 *
	 * @param initialText
	 *            is the text describing the contents of the array
	 * @param arr
	 *            is the array to display
	 */
	public static void printMyArray(String initialText, int[] arr) {
		System.out.print(initialText + ":\t");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	/**
	 * This method will check to see if the indexes to be swapped will cause an error and 
	 * handle it or swap the indexes
	 * 
	 * @param arr
	 * 			 is the array that has indexes that will be swapped
	 * @param index1
	 * 			    index of array that will be swapped	
	 * @param index2
	 * 				second index of array to be swapped
	 */			
	public static void swapInArray(int[] arr, int index1, int index2) 
	{
		if (index1 < 0 || index1 > arr.length-1 || index2 < 0 || index2 > arr.length-1)
		{

			System.out.println("Invalid Swap between " + index1 + " and " + index2 );
		}
		else 
		{

			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;

		}

	}
	

}
