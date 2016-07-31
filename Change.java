package BasicPrograms;


public class Change
{
	public static void main(String [] args)
	{
		double amount = 8.79;
		
		System.out.printf(" %.2f, %.2f, %.2f", (amount % 1 / 1  ), (amount % 1), (amount
				% .01) );
		
	}
	
}
