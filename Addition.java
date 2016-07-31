package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 3/28/14                                             *
*                                                                    *
*Purpose: Addition program that shows the sum of 2 numbers.          *
*                                                                    *
*Source: JHTP Ch 2 Fig 2.7                                           *
*                                                                    *   
*********************************************************************/

// Fig. 2.7: Addition.java
// Addition programm that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner

public class Addition
{
   // main method begins Java application
   public static void main(String [] args)
   {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);
      
      int number1; // First number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2
      
      System.out.print("Enter first integer: "); //prompt
      number1 = input.nextInt(); // read the first number from user
      
       System.out.print("Enter second integer: "); //prompt
      number2 = input.nextInt(); // read the second number from user
      
      sum = number1 + number2; //add numbers, then store total in sum
      input.close();
      System.out.printf("Sum is %d\n", sum); // display sum
   }// end method main
}// end class Addition

/******************************
* Sample output               *
*                             *
* Enter first integer: 15     *
* Enter second integer: 15    *
* Sum is 30                   *
*                             *
*******************************/   