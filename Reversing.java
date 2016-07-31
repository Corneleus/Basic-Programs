package BasicPrograms;
/*
* Cody Narber & Cory Caswell
* Reversing
* Completed: Complete the code to reverse a String
*/
import java.util.Scanner;
// class reversing
public class Reversing
{
   // main method
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
    
      System.out.print("Enter a message to reverse: ");
    
      String message = input.nextLine();
        
            
      String reversed = reverseMsg(message);
    
      System.out.printf("The Phrase Reversed is :%s ",reversed);
      input.close();
   }
   
  // method that is passed message and then reverses it
   public static String reverseMsg(String message)
   {
      String reversed = "";
      // for loop using .length
      for(int i = message.length()-1; i >= 0; i--)
      {
         // adding last char of message to a string reversed
         reversed += message.charAt(i);
      }
  
      return reversed;
   }
   //TODO: write the code for the reverseMsg method so it 
   //reverses the passed message
}