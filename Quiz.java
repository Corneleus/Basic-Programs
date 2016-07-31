package BasicPrograms;
import java.util.Scanner;

public class Quiz
{
   public static void main (String [] args)
  {
     
      int i;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Is Java Awesome?: ");
         String answerYes = scan.nextLine();
      
      for ( i = 1; !answerYes.equals("yes"); i++ )
      {  
       System.out.print ("Nope Try Again \nIs Java Awesome?: ");
               answerYes = scan.next();
      
      
      }    
      
      System.out.printf("You Atempted %d Times", i);
      scan.close();
  }
   
   
   
}   