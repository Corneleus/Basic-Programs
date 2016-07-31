package BasicPrograms;
// Cory Caswell Csc 200
//Project 4 Guessing game 
// 4/1/15
import java.util.Scanner;
import java.security.SecureRandom;

public class Guess
{
   // method main that makes a random number
   public static void main (String [] args)
   {
      SecureRandom sec = new SecureRandom();
      int rnum = sec.nextInt(1000);
      randomNum(rnum);    
         
   }

   // method that takes random number
   public static void randomNum(int rnum)
   {
    // keeping track of iteration of loop
    int i = 1;
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Guess a number between 1 and 1000: ");  
    int guess = scan.nextInt();
    
    // guessing the number
    while (guess != rnum)
    {
     
     if (guess > rnum )
     
     {
      System.out.println("The number is lower then your guess please try again. ");
      
     } 
     
     else 
     {
      
      System.out.println("The number is higher then your guess please try again. ");
     
     }
      
      System.out.print("Guess a number between 1 and 1000: ");  
      guess = scan.nextInt();
      // iterations
      i++;
    }
    
    System.out.printf("Congrats you Guessed the number it too you %d times to guess the number. " , i);
   scan.close(); 
   }

}// end class Guess