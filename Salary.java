package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 4/3/14                                              *
*                                                                    *
*Purpose: Calculate and display earnings of employee                 *
*                                                                    *
*Source: JHTP Ch 3 Fig 3.20                                          *
*                                                                    *   
*********************************************************************/
import java.util.Scanner;// program uses class scanner 

public class Salary// class

{

      // begins the execution of java application
     public static void main( String [] args )
   
   {
      Scanner input = new Scanner( System.in );
   
      int employee1;
      int employee2;
      int employee3;
      double pay1 = 10.00;// pay rate
      double pay2 = 10.00;// pay rate
      double pay3 = 10.00;// pay rate
      double overtime1 = 1.5 * pay1;// overtime pay rate
      double overtime2 = 1.5 * pay2;// overtime pay rate
      double overtime3 = 1.5 * pay3;// overtime pay rate
      double otpay1;
      double otpay2;
      double otpay3;
   
   System.out.print("Employee 1 hours: "); // prompt
      employee1 = input.nextInt(); // number of hours worked
      
   System.out.print("Employee 2 hours: "); //prompt
      employee2 = input.nextInt(); // number of hours worked
   
   System.out.print("Employee 3 hours: "); // prompt
      employee3 = input.nextInt(); // number of hours worked

      otpay1 = 40 * pay1;// calculate normal pay rate of 40 hours
      otpay2 = 40 * pay2;// calculate normal pay rate of 40 hours
      otpay3 = 40 * pay3;// calculate normal pay rate of 40 hours
      
    if ( employee1 <= 40 )
     // if statement that prints amount earned at 40 hours or less   
      System.out.printf("\nEmployee 1 Earned : %s" , employee1 * pay1 );
    
        else 
         // else statement that calculate pay based on hours above 40
      System.out.printf("\nEmployee 1 Earned : %s" , ( (employee1 - 40) * overtime1 ) + otpay1);
    
    if ( employee2 <= 40 )
     // if statement that prints amount earned at 40 hours or less   
      System.out.printf("\nEmployee 2 Earned : %s" , employee2 * pay2 );

         else 
         // else statement that calculate pay based on hours above 40
      System.out.printf("\nEmployee 2 Earned : %s" , ( (employee2 - 40) * overtime2 ) + otpay2);

    if ( employee3 <= 40 )
     // if statement that prints amount earned at 40 hours or less  
      System.out.printf("\nEmployee 3 Earned : %s" , employee3 * pay3 );

         else 
         // else statement that calculate pay based on hours above 40
      System.out.printf("\nEmployee 3 Earned : %s" , ( (employee3 - 40) * overtime3 ) + otpay3);

    
    input.close();
   }// end method main
   
}// end class Salary


/******************************
*Sample output                *
* Employee 1 hours: 55        *
* Employee 2 hours: 65        *
* Employee 3 hours: 85        *
*                             *
* Employee 1 Earned : 625.0   *
* Employee 2 Earned : 775.0   *
* Employee 3 Earned : 1075.0  *
*                             *
*                             *
*                             *
*                             *
*******************************/   