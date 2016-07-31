package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed:3/28/14                                              *
*                                                                    *
*Purpose: Numbers-printing Program                                   *
*                                                                    *
*Source: JHTP CH 2 Fig 2.14                                          *
*                                                                    *   
*********************************************************************/

// Fig 2.14: Numbers1.java
// Text-printing program on 3 separate lines using print,ln, and f.

public class Numbers1
   {
   //main method beings execution of Java application
   public static void main(String[] args)   
   {      
      System.out.print("1 ");
      // Prints 1 and a space using print
      System.out.print("2 ");
      // Prints 2 and a space using print
      System.out.print("3 ");
      // Prints 3 and a space using print
      System.out.print("4 ");
      // Prints 4 and a space using print
      System.out.println("\n1 2 3 4");
      // Prints 1 to 4 on another line using print line
      System.out.printf("%s %s %s %s","1", "2", "3", "4");
      // prints 1 to 4 using print f statement on a new line
         
   }//end main method
}// end class Welcome1

/******************************
* Sample output               *
*                             *
*  1 2 3 4                    *
*  1 2 3 4                    *
*  1 2 3 4                    *
*                             *
*                             *
*******************************/   