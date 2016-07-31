package BasicPrograms;
// Cory Caswell Csc Project #3
import java.util.Scanner;

public class Loops
{// Main method
   public static void main (String [] args)
   {      
      // scanner constructor
      Scanner scan = new Scanner(System.in);
      
      // variables
      int largest,smallest, current;
      
      //prompt for number      
      System.out.print("Enter a Number: ");
      smallest = scan.nextInt();
      largest = smallest;
      
      // for loop for iteration count
      for(int i = 0; i < 9; i++)
      {
      
      System.out.println("Enter another Nummber");
      current = scan.nextInt();
      // if statement to find the largest and smallest 
      // numbers
      if (current < smallest)
         smallest = current;
      
      if (current > largest) 
         largest = current;
      
      }
      // print for largest and smallest numbers
      System.out.printf("The Largest number is: %d ", largest);
      System.out.printf("The Smallest number is: %d ", smallest);
      scan.close();
   }
   	
}