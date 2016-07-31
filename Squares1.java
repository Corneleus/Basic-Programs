package BasicPrograms;
/*********************************************************************
*Program Author : Cory Alan Caswell                                  *
*                                                                    *
*Date Completed:3/28/14                                              *
*                                                                    *
*Purpose: Show a table of squares and cubes                          *
*                                                                    *
*Source: JHTP CH 2 Fig 2.31                                          *
*                                                                    *   
*********************************************************************/

// Fig 2.31: Squares1.java
// Text-printing program

public class Squares1 // class Squares1
   {
   //main method beings execution of Java application
   public static void main( String[] args )   
   {
   int a = 0;// declaring and initializing a to 0
   int b = 1;// declaring and initializing b to 1
   int c = 2;// declaring and initializing c to 2 
   int d = 3;// declaring and initializing d to 3
   int e = 4;// declaring and initializing e to 4
   int f = 5;// declaring and initializing f to 5
   int g = 6;// declaring and initializing g to 6
   int h = 7;// declaring and initializing h to 7
   int i = 8;// declaring and initializing i to 8
   int j = 9;// declaring and initializing j to 9
   int k = 10;// declaring and initializing k to 10 
   
   // Commands to print out a number, its square, and then its cube
   
      System.out.println("Number \tSquare\tCube");
      System.out.println( a + "\t" + a*a + "\t" + a*a*a );
      System.out.println( b + "\t" + b*b + "\t" + b*b*b );
      System.out.println( c + "\t" + c*c + "\t" + c*c*c );
      System.out.println( d + "\t" + d*d + "\t" + d*d*d );
      System.out.println( e + "\t" + e*e + "\t" + e*e*e );
      System.out.println( f + "\t" + f*f + "\t" + f*f*f );
      System.out.println( g + "\t" + g*g + "\t" + g*g*g );
      System.out.println( h + "\t" + h*h + "\t" + h*h*h );
      System.out.println( i + "\t" + i*i + "\t" + i*i*i );
      System.out.println( j + "\t" + j*j + "\t" + j*j*j );
      System.out.println( k + "\t" + k*k + "\t" + k*k*k );
    
   }//end main method
}// end class Squares1
/******************************
* Sample output               *
*                             *
* Number  Square  Cube        *   
* 0       0       0           *
* 1       1       1           *
* 2       4       8           *
* 3       9       27          *
* 4       16      64          *
* 5       25      125         *
* 6       36      216         *     
* 7       49      343         *
* 8       64      512         *
* 9       81      729         *
* 10      100     1000        *
*                             *
*******************************/   