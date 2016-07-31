package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 4/03/12                                             *
*                                                                    *
*Purpose: Calulate pay based on items sold and commision rate        *
*                                                                    *
*Source: JHTP Ch 3 Fig 3.19                                          *
*                                                                    *   
*********************************************************************/

// Fig 3.19: Sales.java
// Shows earnings of Salesperson with commission and weekly

import java.util.Scanner; // program uses class Scanner

public class Sales
{
   //main method begins execution of Java application
   public static void main(String [] args)
   {
      //create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);
      
      double item1 = 239.99;// item 1 price 
      double item2 = 129.75;// item 2 price
      double item3 = 99.95;// item 3 price
      double item4 = 350.89;// item 4 price
      int a;// number of item1
      int b;// number of item2
      int c;// number of item3
      int d;// number of item4
      double comm = .09;// commision rate
      double total;// total sales
      
      // # of item 1            
      System.out.print("Number of item 1 sold: "); //prompt
      a = input.nextInt(); 
      
      // # of item 2      
      System.out.print("Number of item 2 sold: "); //prompt
      b = input.nextInt(); 
      
      // # of item 3
      System.out.print("Number of item 3 sold: "); //prompt
      c = input.nextInt(); 
      
      // # of item 4      
      System.out.print("Number of item 4 sold: "); //prompt
      d = input.nextInt(); 
      
       // total of all items sold
       total = a * item1 + b * item2
        + c * item3 + d * item4;
          
       // displays total of sales done by sales person
       System.out.printf(" Total Sales: %.2f" , ( double ) total );
      
       // displays Earnings of Salesperson for the week
       System.out.printf( "\n Total weeks pay: %.2f " ,  ( double ) total * comm + 200 );
        
       input.close();
       }// end main method
}// end class Sales
       

/******************************
*Sample output                *
*                             *
* Number of item 1 sold: 15   *
* Number of item 2 sold: 15   *
* Number of item 3 sold: 15   *
* Number of item 4 sold: 15   *
* Total Sales: 12308.70       *
* Total weeks pay: 1307.78    *
*                             *
*******************************/   