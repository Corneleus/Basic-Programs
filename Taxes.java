package BasicPrograms;
// Cory Caswell 2/14/15 Csc 200 Taxes Project #1 
// adding new methods to do other taxes later
import java.util.Scanner;
// imported scanner
public class Taxes
// class
{
   public static void main (String [] args)
   // main method
   {
   // constructor that makes new scanner
   Scanner scan = new Scanner (System.in);
   // variables
   double income;
   double tax = 0;
   // print statements
   System.out.print("Enter Annual Income: ");
      income = scan.nextDouble(); 
   
   // if statements with hard coded math  
    if (income < 9075)
    {
      System.out.printf("You Owe $%.2f in income Tax ",
         income*.10);
    		tax = income*.10;
    }
   
    else if(income < 36900)
   {
      System.out.printf("You Owe $%.2f in income Tax ",
          9075*.10 + (income - 9075)*.15);
      	tax = 9075*.10 + (income - 9075)*.15;
   }
   
   else if(income < 89351)
   {
      System.out.printf("You Owe $%.2f in income Tax ",
          9075*.10 + (36900 - 9075)*.15 + (income - 36900)*.25);
      	tax = 9075*.10 + (36900 - 9075)*.15 + (income - 36900)*.25;
   }
   
   else if(income < 186350)
   {
      System.out.printf("You Owe $%.2f in income Tax ",
          9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
           (income - 89350)*.28);
      tax =  9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
              (income - 89350)*.28;
   }
      
   else if(income < 405100)
   {
      System.out.printf("You Owe $%.2f in income Tax ",
           9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
           (186350 - 89350)*.28 + (income - 186351)*.33);
      	tax = 9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
                (186350 - 89350)*.28 + (income - 186351)*.33;
   }

   else if(income < 406750)
   {
      System.out.printf("You Owe $%.2f in income Tax ",
           9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
           (186350 - 89350)*.28 + (405100 - 186351)*.33 +
            (income - 405101)*.35);
      	tax = 9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
                (186350 - 89350)*.28 + (405100 - 186351)*.33 +
                (income - 405101)*.35;
   }
  
   
   else if (income > 406750)
   {
      System.out.printf("You Owe $%.2f in income Tax ",
         9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
           (186350 - 89350)*.28 + (405100 - 186351)*.33 +
            (406750 - 405101)*.35 + (income - 406750)*.396);
      	
      	tax = 9075*.10 + (36900 - 9075)*.15 + (89350 - 36900)*.25 +
                (186350 - 89350)*.28 + (405100 - 186351)*.33 +
                (406750 - 405101)*.35 + (income - 406750)*.396;
   }
    
    	System.out.printf("\nAfter Taxes you make %.2f a year", (income - tax));
    	System.out.printf("\nYou make %.2f per month ", ((income - tax) / 12) );
    	//add  new print statement or method that will take all information taken and take the rest of medicare and state income tax out for full picture.
    scan.close();
   }// end main method



}// end class Taxes
