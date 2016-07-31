package BasicPrograms;
import java.util.Scanner;
/**
 * A class that has a method that take a integer from the user and
 * then displays that integer it's square and its cube from one to that 
 * integer 
 * 
 * @author Cory Caswell
 * @version 1.0
 * @since 04-27-15
 *
 */
public class Table 
{
	/**
	 * This is the main method that asks user for an integer and then
	 * displays that integer it's square and its cube from one to that 
	 * integer 
	 * 
	 * @param args
	 * 			  is the additional arguments provided to the program through
	 *            the console
	 */
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i ++)
		{
			System.out.printf("\n%d\t%d\t%d" , i ,  i * i  , i * i * i);
			
		}
		
	scan.close();	
	}
}
