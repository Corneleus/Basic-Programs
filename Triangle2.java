package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed:3/28/14                                              *
*                                                                    *
*Purpose: Text-printing Program using asterisks                      *
*                                                                    *
*Source: JHTP CH 4 Fig 4.15                                           *
*                                                                    *   
*********************************************************************/

// Fig 4.15: Triangle2.java
// Triangle-printing program using asterisks

public class Triangle2
   {
   //main method beings execution of Java application
   public static void main( String [] args )   
   {
 
   for ( int a = 0; a < 10; a++ )/* set a to 0 and if its less then 10 
   increment a.*/ 
   {
   for ( int b = 0; b < a + 1; b++ )/* set b to 0 and if b is less then 
   a+1 increment b.*/
   System.out.print( '*' );// prints an *
   System.out.println( );// moves cursor to new line
  
   }     
  
   System.out.println( );// separator
  
   {
   
   for ( int a = 11; a > 0; a-- )/* set at to 11 and if a is greater 
   0 then decrement a.*/
   {
   for ( int b = 0; b < a - 1; b++ )/* set b to 0 and if b is less then 
   a+1 increment b.*/
   System.out.print( '*' );// prints an *
   System.out.println( );// moves cursor to new line
   }
   
   }  
   for( int a = 0; a < 10; a++ )/* sets a to 0 and if a is less then 10
   increment a.*/
   {
   for( int b = 1; b < a + 1; b++ )/* sets b to 1 and if b is less then a + 1
   increment b.*/
   System.out.print( ' ' );// prints blank spaces
 
   for( int c = 10; c > a ; c-- )/* sets c to 10 and if c is greater then
   a decrement c.*/
   System.out.print( '*' );// prints an *
   System.out.println( );// moves cursor to new line
   }
   
   System.out.println( );// separator
   
   {
   for( int a = 10; a > 0; a-- )/* sets a to 10 and if a is greater then
   0 then decrement a.*/
   {
   for( int b = 0; b < a - 1; b++ )/* sets be to 0 and if b is less then 
   a - 1 then increment b.*/
   System.out.print( ' ' );// prints blanks
             
   for( int c = 10; c > a - 1; c-- )
   System.out.print( '*' );// prints an *
             
   System.out.println();// moves cursor to  new line
   
   }
   
   }    
      
   }//end main method
   }// end class Triangle2

/******************************
* Sample output               *
*                             *     
*  *                          *
*  **                         *
*  ***                        *
*  ****                       *
*  *****                      *   
*  ******                     *
*  *******                    *
*  ********                   *
*  *********                  *
*  **********                 *
*                             *     
*  **********                 *
*  *********                  *
*  ********                   *
*  *******                    *
*  ******                     *
*  *****                      *
*  ****                       *
*  ***                        *
*  **                         *
*  *                          *
*                             *
*  **********                 *
*   *********                 *
*    ********                 *
*     *******                 *
*      ******                 *
*       *****                 *
*        ****                 *
*         ***                 *
*          **                 *
*           *                 *
*                             *
*                             *
*                 	         *
*           *                 *
*          **                 *
*         ***                 *
*        ****                 *
*       *****                 *
*      ******                 *
*     *******                 *
*    ********                 *
*   *********                 *
*  **********                 *           
*                             *
*                             *   
*                             *
*                             *
*                             *
*                             *
*******************************/   