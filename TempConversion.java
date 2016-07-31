package BasicPrograms;
/*
* Cody Narber & Cory Caswell
* Temperature Conversion
* TODO: Complete the 2 conversion methods, and fill in the method to verify proper choice input 
*/
import java.util.Scanner;
// NEED TO DO  change method so input is always correct
public class TempConversion
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      if(isCelsius())
      {
         System.out.print("Enter the degrees(Celsius): ");
         double celsius = input.nextDouble();
         double fahren = convertTocelcius(celsius);
         System.out.println( celsius +" degrees in Celsius is "+fahren+" degrees in Fahrenheit");
      } else {
         System.out.print("Enter the degrees(Fahrenheit): ");
         double fahren = input.nextDouble();
         double celsius = convertTofahren(fahren);
         System.out.println( fahren +" degrees in Fahrenheit is "+celsius+" degrees in Celsius");            
      }
   input.close();
   }
   // bool method that find c or f
   public static boolean isCelsius()
   {
            
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please Enter C for Celsius or F Fahrenheit: ");
      String temp = scan.next();
      scan.close();
      // while loop that keeps asking for a correct answer
      while  ((!temp.equals("C")) && (!temp.equals("F")))
      {
           
         System.out.print("Please Enter C for Celsius or F Fahrenheit: ");
         temp = scan.next();

      }
         // if statement that gives true or false return
         if (temp.equals("C"))
         {
            return true;
         }
         else 
         {
            return false;
         }      
   }
   // converter from C to F
   public static double convertTofahren(double fahren)
	   
      {
		   
         double celcius = 5.0/9.0 * (fahren - 32);
		   return celcius;
      
      }
  
    // converter from F to C
    public static double convertTocelcius(double celcius)
     
      {
      		
         double fahren = 9.0/5.0 * celcius + 32;
		   return fahren;
	   
      }
      
}
      //TODO: Ask user if they want Celsius (C) or Fahrenheit (F)
      //The user must enter either F or C. Continue to prompt them to enter one of the two letters
      //If the user enters C, then the method should return true, false otherwise.
   
   
   //TODO: write the code for convertToCelsius, using the formula: c = 5.0/9.0*(f-32)
   
   //TODO: write the code for convertToFahren, using the formula: f = 9.0/5.0*c + 32
   

