package BasicPrograms;
import java.util.Scanner;

public class VendingMachine 
{	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double soda = 1.99;
		double cookie = 1.99;
		double water = .99;
		double energy = 2.99;
		double chips = .99;
		double amount = 0;
		int q;
		int d;
		int n;
		int p;
		int rem1;
 		int rem2;
 		int rem3;
 		
		
		System.out.printf("Please enter money in the form of 1's, 5's"
				+ " or any change and to end please enter 0\n");
		double input = scan.nextDouble();
		
		if (input != 0)
		{
		amount += input;
		}
		
		while(input != 0)
		{
			System.out.printf("\nPlease enter money in the form of 1's, 5's"
				+ " or any change and to end please enter 0");
			input = scan.nextDouble();
			
			amount += input;
		}
		
		System.out.printf("You have %.2f current credit \n", amount);
		
		
 		for (int i = 0; i < 5; i++)
 		{
 			System.out.println("Please make a Selection\n"
 					+ "1 for a soda, 1.99$ \n"
 					+ "2 for a cookie, 1.99$\n"
 					+ "3 for a water, .99$ \n"
 					+ "4 for energy drink, 2.99$\n"
 					+ "5 for chips, .99$ \n");
 			int loop = scan.nextInt();
 			
 			
 			
 				if (loop == 0)
 				{
 					break;
 				}
 			
 				if(loop == 1)
 				{
 					if(amount > soda)
 					{
 					amount -= soda;
 					}	
 					
 					else if (amount < soda)
 					{
 						System.out.println("Not Enough Credit");
 					}
 					
 				}
 				
 				if(loop == 2)
 				{
 					if(amount > cookie)
 					{
 						amount -= cookie;
 					}
 					
 					else if (amount < cookie)
 					{
 						System.out.println("Not Enough Credit");
 					}
				
 				}
 				
 				if(loop == 3)
 				{
 					if(amount > water)
 					{
 						amount -= water;
 					}
 					
 					else if( amount < water)
 					{
 						System.out.println("Not Enough Credit");
 					}

 				}
 				
 				if(loop == 4)
 				{
 					if (amount > energy)
 					{
 	 					amount -= energy;
 					}
 					
 					else if (amount < energy)
 					{
 						System.out.println("Not Enough Credit");
 					}
 					
 				}
 				
 				if(loop == 5)
 				{
 					if(amount > chips)
 					{
 						amount -= chips;
 					}
 					
 					else if (amount < chips)
 					{
 						System.out.println("Not Enough Credit");
 					}
 				}
 				System.out.printf("You have %.2f$ left \n",amount);
 			
 			
 			}
 	 	
 		amount = (int)(amount * 100);
 		
 		q = (int)(amount / 25); 
 		rem1 = (int)(amount % 25);
 		
 		d = (int)(rem1 / 10); 
 		rem2 = (int)(rem1 % 10);
 		
 		n = (int)(rem2 / 5); 
 		rem3 = (int)(rem2 % 5);
 		
 		p = (int)(rem3 / 1); 
 		
 		
 		System.out.println("Your Change is ");
 		System.out.printf("Quarters %d\n",q);
 		System.out.printf("Dimes %d\n",d);
 		System.out.printf("Nickles %d\n",n);
 		System.out.printf("Pennies %d", p);
 		
 	
 		
 		scan.close();	
 		}
		
 		
 		
		
}
	
	

