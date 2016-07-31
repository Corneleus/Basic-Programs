package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 4/16/14                                             *
*                                                                    *
*Purpose: Display whether or not 3 sides could make a triangle       *
*                                                                    *
*Source: JHTP CH 3.35                                                *
*                                                                    *   
*********************************************************************/
import java.util.Scanner; // program uses class Scanner

public class Triangle
{
   //main method begins execution of Java application
   public static void main(String [] args)
   {
      //create Scanner to obtain input from command window
      Scanner scan = new Scanner(System.in);
      
      int a;// setting a as a variable
      int b;// setting b as a variable
      int c;// setting c as a variable
     
      
      System.out.print("Enter Side 1: "); //prompt
         a = scan.nextInt();
     
      System.out.print("Enter Side 2: "); //prompt
         b = scan.nextInt();
     
      System.out.print("Enter Side 3: "); //prompt
         c = scan.nextInt();
         scan.close();
    if (a + b <= c)//  if sides input is not a triangle
   
    {
    System.out.print("This is not a triangle.");// prints statement
    }
    
    else if (a + c <= b)//  if sides input is not a triangle
    
    {
    System.out.print("This is not a triangle.");// prints statement
    }
    
    else if (c + b <= a)// if sides input is not a triangle
    
    {
    System.out.print("This is not a triangle.");// prints statement
    }
     
    else System.out.print("This is a triangle."); // prints statement
        
    }// end method main
}// end class Triangle
    
/******************************
*Sample output                *
*                             *
*  Enter Side 1: 3            *
*  Enter Side 2: 4            *
*  Enter Side 3: 5            *
*   This is a triangle!       *
*                             *
*  Enter Side 1: 2            *           
*  Enter Side 2: 4            *
*  Enter Side 3: 6            *
*   This is not a triangle!   *
*                             *
*                             *
*******************************/   