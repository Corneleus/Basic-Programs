package BasicPrograms;
import java.util.Scanner;
/**
 * A class that has methods for taking input from the user and then splitting up the number
 * on new lines
 * 
 * @author Cory Caswell
 * @version 1.0
 * @since 04-27-15
 *
 */

public class Digit 
{
	/**
	 * This is the main method that will set the variable to 0 then will get num
	 * from the method call then set num = to the number inputed from the user at the 
	 * console 
	 *  
	 * @param args
	 * 			  is the additional arguments provided to the program through
	 *            the console
	 */
	public static void main (String [] args)
	{
		double num = 4.76;
		
	//	num = getNum(num);
		
		System.out.printf("%f\n",num % .10);
		System.out.printf("%f\n",num / 100 % 10 );
		System.out.printf("%f\n",num / 10 % 10);
		System.out.printf("%f ", num  % 1);
		
	}
	/**
	 * 
	 * @param num is the 4 digit number for use in the main method
	 * @return the 4 digit number to be used in the main method
	 */
	public static int getNum(int num)
	{
		System.out.print("Enter a 4 digit number: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		scan.close();
		
		return num;
	}
	
}

