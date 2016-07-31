package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed:3/28/14                                              *
*                                                                    *
*Purpose: To show the int value of a Character                       *
*                                                                    *
*Source: JHTP CH 2 Fig 2.29                                          *
*                                                                    *   
*********************************************************************/

// Fig 2.29: Character1.java
// Printing program for int's and char's

public class Character1
   {
   
   //main method beings Java application
   public static void main( String[] args )   
   
   {
        
    /* These formated print statements print a letter, number or special character, 
    and then displays the unicode value for the corresponding item. */
    
    System.out.printf( "The character %c has the value %d\n", 'A', ( ( int ) 'A' ) );
    System.out.printf( "The character %c has the value %d\n", 'B', ( ( int ) 'B' ) );
    System.out.printf( "The character %c has the value %d\n", 'C', ( ( int ) 'C' ) );
    System.out.printf( "The character %c has the value %d\n", 'a', ( ( int ) 'a' ) );
    System.out.printf( "The character %c has the value %d\n", 'b', ( ( int ) 'b' ) );
    System.out.printf( "The character %c has the value %d\n", 'c', ( ( int ) 'c' ) );
    System.out.printf( "The character %c has the value %d\n", '0', ( ( int ) '0' ) );
    System.out.printf( "The character %c has the value %d\n", '1', ( ( int ) '1' ) );
    System.out.printf( "The character %c has the value %d\n", '2', ( ( int ) '2' ) );
    System.out.printf( "The character %c has the value %d\n", '$', ( ( int ) '$' ) );
    System.out.printf( "The character %c has the value %d\n", '*', ( ( int ) '*' ) );
    System.out.printf( "The character %c has the value %d\n", '+', ( ( int ) '+' ) );
    System.out.printf( "The character %c has the value %d\n", '/', ( ( int ) '/' ) );
    System.out.printf( "The character %c has the value %d\n", ' ', ( ( int ) ' ' ) );

   }//end main method
}// end class Character1

/***********************************
* Sample output                    *
*                                  *
* The character A has the value 65 *
* The character B has the value 66 *
* The character C has the value 67 *
* The character a has the value 97 *
* The character b has the value 98 *
* The character c has the value 99 *
* The character 0 has the value 48 *
* The character 1 has the value 49 *
* The character 2 has the value 50 *
* The character $ has the value 36 *
* The character * has the value 42 *
* The character + has the value 43 *
* The character / has the value 47 *
* The character   has the value 32 *
*                                  *
***********************************/   