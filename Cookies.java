package BasicPrograms;
/**
 * @author Cory Caswell
 */
import java.util.*;

public class Cookies 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
		int b5 = 0;
		
		System.out.printf("Please Enter Total # of Girls ");
		int [] girls = new int[scan.nextInt()];
				
		for(int i = 0; i < girls.length; i++)
		{
			System.out.printf("Enter Number of Boxes ");
			int boxNum = scan.nextInt();
			
			if(boxNum <= 10)
			{
				b1++;
			}
		
			if(boxNum > 10 && boxNum <= 20)
			{
				b2++;
			}
			
			if(boxNum > 20 && boxNum <= 30 )
			{
				b3++;
			}
			
			if(boxNum > 30 && boxNum <= 40)
			{
				b4++;
			}
			
			if(boxNum >= 41 )
			{
				b5++;
			}
		
		}
		scan.close();
		
		System.out.printf("0 to 10      %d   \n11 to 20     %d   \n"
				+ "21 to 30     %d   \n31 to 40     %d   \n41 or more   %d", b1, b2 ,
				b3,b4 ,b5); 
		
	}

}

