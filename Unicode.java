package BasicPrograms;
import java.util.*;

public class Unicode 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a char: ");
				
		String n = scan.nextLine();
		
		int g = (int) n.charAt(0);
		
		System.out.printf("The ascii value for Entered letter is %d", g);
		
		scan.close();
	}
	
}
