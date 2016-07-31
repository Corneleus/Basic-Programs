package BasicPrograms;
// Cory Caswell  Csc 200 Project #3
import java.util.Scanner;

public class Factorial
{ 
   
   public static void main (String [] args)
   {      
      // new scanner constructor  
      Scanner scan = new Scanner(System.in);
     
      // prompt
      System.out.print("Give me a number: ");
      int n = scan.nextInt();
     
      scan.close();
     // while loop for non positive numbers
     while (n < 0)
     {
     System.out.print("Enter Positive #: ");
     n = scan.nextInt();
     }
       
      // print statement for what factorial of number is = to
      System.out.printf(" %d! = %d ",n, factorial(n));
   
   }
   // method 
   public static int factorial(int n)
   {
   // using method call to go backwards from user entered number
    if (n <= 1)
      return 1;
      return n*factorial(n-1);
           
   }// end method factorial

}// end class Factorial