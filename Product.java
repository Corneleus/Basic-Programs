package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 3/28/14                                             *
*                                                                    *
*Purpose: Calculate the product of three integers.                   *
*                                                                    *
*Source: JHTP Ch 2 Fig 2.6                                           *
*                                                                    *   
*********************************************************************/

// Ex. 2.6: Product.java
// Calculate the product of three integers.

import java.util.Scanner; // program uses Scanner

public class Product
{
   public static void main(String [] args)
   {
      // create Scanner  to obtain input from the command window
      Scanner input = new Scanner(System.in);
      
      int x; // first number to be input by user
      int y; // second number to be input by user
      int z; // third number to be input by user
      int result; // product of numbers
      
      System.out.print("Enter first integer: "); // prompt for input
      x = input.nextInt(); // read first integer
      
      System.out.print("Enter second integer: "); // prompt for input
      y = input.nextInt(); // read second integer
      
      System.out.print("Enter third integer: "); // prompt for input
      z = input.nextInt(); // read third integer\
      
      result =  x * y * z; // calculate product of the numbers
      System.out.printf("Product is %d\n", result);
   input.close();
   }// end method main
}// end class Product 

/******************************
* Sample output               *
*                             *
* Enter first integer: 10     *
* Enter second integer: 10    *
* Enter third integer: 10     *
* Product is 1000             *
*                             *
*******************************/     