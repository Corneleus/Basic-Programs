package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 5/1/14                                              *
*                                                                    *
*Purpose: Use user input to calculate temp using converter           *
*                                                                    *
*Source: JHTP CH 5 Fig 5.22                                          *
*                                                                    *   
*********************************************************************/
// Fig 5.22: Converson.java
// Temperature converting program
import java.util.Scanner;
public class Conversion
{
	public static void main (String[] args)// method main
	{
	Scanner input = new Scanner( System.in );
		
      int option = 0;// declare option so that can be used later
		double temp = 0;// declare temp so that can be used later
      double value = 0;// declare value so that can be used later
		
		
		System.out.print("Press 1 for Celsius , Press 2 for Fahrenheit: ");
		 option = input.nextInt();// promt and reader of options
		
		 input.close();
		if(option == 1 )// second if statment converting C to F
		
      {
			System.out.print("Enter Celcius Please: ");// promt
			temp = input.nextDouble();// get temp number
			
         value =  hTOf(temp);// value for converter
			System.out.printf("Fahrenheit Temperature is: %.2f ",  value);
		}
		
		
      else if(option == 2)// first if statment converting F to C
		
      {
			System.out.print("Enter Farenheit Please: ");// promt
         temp = input.nextDouble();
			
         value = fTOh(temp);
			System.out.printf("Celcius Temperature is: %.2f " , value);
      }
		
      else
		
         System.out.print("Error Please Try Again.");
			
	   }
	   //converter of F to C
	   public static double fTOh(double temp)
	   
      {
		
         double celcius = 5.0/9.0 * (temp - 32);
		   return celcius;
      
      }
	   // converter of C to F
      public static double hTOf(double temp)
     
      {
		
         double fahrenheit = 9.0/5.0 * temp + 32;
		   return fahrenheit;
	
   }// end method main
      
}// end class Conversion

/**********************************
*Sample output                    *
*                                 *
* Press 1 for Celsius ,           *
* Press 2 for Fahrenheit:1        *
* Enter Celcius Please: 36        *
* Fahrenheit Temperature is: 96.80*  
*                                 *
*                                 *
*                                 *
*                                 *
***********************************/   