package BasicPrograms;
import java.util.Scanner;

public class StringEx 
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter things:  ");
		String  str = scan.nextLine();
		
		String [] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		//System.out.println("This is the String : " + str);
	scan.close();
	}
}
