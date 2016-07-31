package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed: 5/1/14                                              *
*                                                                    *
*Purpose: Displaying # in collum by row format by a certain number   *
*                                                                    *                                                             *
*Source: JHTP CH 2 Fig 5.19                                          *
*                                                                    *   
*********************************************************************/
// Fig 5.19: Hashtags.java
// using string to print #'s in row by column format
import java.util.Scanner;
public class Hashtags
{// begin class
    //main method begins execution of Java application
    public static void main(String [] args)
    {// begin method main
    
    alt();
    
    }//end method main
    private static void alt( )   
       { 
        Scanner input = new Scanner( System.in );
        // uses a scanner
        
        int htags;// declaring item that will be used
            
        System.out.print("Enter number of #': "); //prompt
        htags = input.nextInt(); //read first number from user
        
        for (int rows = 0; rows < htags; rows++)// counter controlled rep
        {
             for (int collums = 0; collums < htags; collums++)// c c rep
             { 
                 System.out.print("#");// printing the item wanted  
             }
             System.out.println();// new line  
        }
        input.close();
    }// end method alt
}// end class Hashtags
/******************************
*Sample output                *
*                             *
* Enter number if #'s: 5      *
*                             *
*  #####                      *   
*  #####                      *
*  #####                      *
*  #####                      *
*  #####                      *                 
*                             *
*******************************/   