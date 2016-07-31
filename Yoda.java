package BasicPrograms;
import java.util.Scanner;
/**
 * This Class takes a phrase from the user and then prints the reversed result
 * @author Cory Caswell
 * @version 1.0
 * @since 2015-4-22
 */

public class Yoda
{
	/**
	 * This method called getMessage 
	 * 
	 * @author Cory Caswell 
	 * @param args
	 */
  
	public static void main (String [] args)
	{
	   String you = "You say: ";
	   System.out.print(you  + getMessage());	   
	}
   
	/**
	 * This method takes input from the user and then sends 
	 * to main method after reversing the order of the words.
	 * 
	 * @author Cory Caswell
	 * @param N/a
	 * @return newphrase string to main method
	 * 
	 */
   
   public static String getMessage()
   {	
	   String newphrase = " ";
	     
	   Scanner scan = new Scanner(System.in);
	      
       System.out.print("Enter a Phrase: ");
	      
	   String phrase = scan.nextLine();
	      
	   scan.close();
	      
       String [] arr = phrase.split(" ");
	      
       for (int i = arr.length-1; i >= 0; i--)
	   {      
	      
    	   newphrase += (arr[i] + " ");
	   
	   }
	    
	   
       return newphrase;
   }  
	
}// end class Yoda
   
