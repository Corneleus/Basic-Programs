package BasicPrograms;
/**
 * This class has methods for displaying the times tables from 1 to 9
 * formated in the specified way
 * 
 * @author Cory Caswell
 * @version 1.0
 * @since 04-27-15
 *
 */
public class Tables 
{
	/**
	 * This is the main method that prints out the multiplication tables from 1 to 9
	 * 
	 * @param args
	 * 			  is the additional arguments provided to the program through
	 *            the console
	 */
	public static void main(String [] args)
	{
		System.out.print(" ");
		for (int q = 1; q <= 9; q++)
		{
			System.out.printf("%4d", q);	
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.print(i);
			
			for(int g = 1; g <= 9 ; g++)
			{
				System.out.printf("%4d", i * g);
			}
			System.out.println();
		}
	
		
	}
}
