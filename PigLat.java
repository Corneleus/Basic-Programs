package BasicPrograms;
import java.util.Scanner;

/**
 * This is the description of my class. It prints a phrase in Pig Latin
 * 
 * @author Cory Caswell
 * @version 1.0
 * @since 2015-4-22
 *
 */

public class PigLat
{
	/**
	 * This method called another method in a print statement
	 *
	 * @author Cory Caswell
	 * @param args 
	 *
	 */
   
	public static void main(String [] args)
   {
      String say = "You say: ";
      
      System.out.printf(say + pigLatin());
   
   }// end method main
  
	/**
    * This method takes input from the user and translates it to pig Latin
    *
    * @author Cory Caswell
    * @return Phrase converted to Pig Latin
    * @param1 N/a 
    * @param2 N/a
    */
   
	public static String pigLatin()
   {
	   Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter a phrase: ");
	      
	      String norm = scan.nextLine();
	      
	      scan.close();
	      
	      String [] arr = norm.split(" ");
	      
	      String pig = " ";
	      
	      for (int i = 0; i < arr.length; i++)
	      {    	    	  
	    	  pig += arr[i].substring(1) + arr[i].charAt(0) + "ay" + " ";
	      }
	      
	      return pig;
   }// end method pigLatin

}// end class PigLat