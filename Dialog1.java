package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 3/28/14                                             * 
*                                                                    *
*Purpose: Printing mutiple lines in a dialog box.                    *
*                                                                    *
*Source: JHTP Ch 2 Fig 2.18                                          *
*                                                                    *   
*********************************************************************/

// Fig. 2.18: Dialog1.java
// Printing mutiple lines in a dialog box.

import javax.swing.JOptionPane; // import class JOptionPane

public class Dialog1
{
   public static void main(String [] args)
   {
      //Display a dialog with a message
      JOptionPane.showMessageDialog(null, "Welcome\nTo\nJava");
   }// end main
}// end class Dialog1 

/******************************
*Sample output                *
* "In a New Window"           *
*  Welcome                    *
*  to                         *
*  Java                       *
*                             *
*******************************/           