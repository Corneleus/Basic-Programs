package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed:4/28/14                                              *
*                                                                    *
*Purpose: reversed number printing Program                           *
*                                                                    *
*Source: JHTP CH 5 Fig 5.26                                          *
*                                                                    *   
*********************************************************************/

// Fig 5.26: Reversed.java
// Text-printing program
import java.util.Scanner;// import scanner
public class Reversed
{
   //main method beings execution of Java application
   public static void main( String [] args)  
  {  
     Scanner input = new Scanner(System.in);// uses a scanner
     
     int num;// declare num as an int
     
     String numString = "";// string to keep a space of memory open
     
     
     System.out.print("Enter a Number: "); //prompt for input
     num = input.nextInt(); // read the first number from user
          
     while ( num != 0 )// while loop  
    
     {
     
     numString += num%10;// finds last digit and saves it in numString
     
     num /= 10;// cuts off last digit and keeps loop going
     
     }
    
     System.out.print("The number reversed is: " + numString);
    input.close();
    
     // prints out the phrase as well as the reverses number
  } //end main method
}// end class Welcome1

/*********************************
* Sample output                  *
*  Enter a Number: 3698          *
*                                *
*  The number reversed is: 8963  *
*                                *
*                                *
*                                *
*********************************/   