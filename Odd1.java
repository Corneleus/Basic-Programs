package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed:3/28/14                                              *
*                                                                    *
*Purpose: To Display if an integer is even or odd.                   *
*                                                                    *
*Source: JHTP CH 2 Fig 2.25                                          *
*                                                                    *   
*********************************************************************/

// Fig 2.25: Odd1.java
// Program that judges if a number is even or odd.
import java.util.Scanner; // imports java scanner

public class Odd1
   {
   // main method beings Java application
   public static void main( String[] args )   
   {
     // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      
      int number;// number for judgment
      
      System.out.print( "What number shall be jugdged?: " ); // prompt
      number = input.nextInt(); // read the number
     
      if( number % 2 != 0 )
      /* use of modulus in order to determine if there is a remainder 
           or not and print the statement to match */
      {
            System.out.print( "The number has been judged to be Odd!" );
            // if statement to print odd if the number has a remainder
            
      }
      if( number % 2 == 0 )
      {
            System.out.print( "The number has been judged to be Even!" );
            // else statement for if there is no remainder
      input.close();
       }
     
     
   }//end main method
}// end class Odd1

/******************************
* Sample output               *
*                             *
*  input 57                   *
*                             *
*  The number has been        *
*  judged to be Even!         *
*                             *
*   or                        *         
*                             *
*  input 56                   *
*                             *
*  The number has been        *
*  judged to be Odd!          *
*                             *
*                             *
*******************************/   