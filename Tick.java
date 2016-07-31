package BasicPrograms;
import java.util.Scanner;

public class Tick 
{
	// method main
	public static void main (String [] args)
	{
		char[] board = new char[9];
		boolean firstPlayerTurn= true;
		
		for(int i = 0; i < 9; i++) board[i]= ' ';
			System.out.println(checkWinner(board));	
		
		while(!checkWinner(board))
	{
		displayBoard(board);
		int location = getValidSpace(board, firstPlayerTurn);
		
		if(firstPlayerTurn) board[location-1] ='X';
			
		else board[location-1]= 'O';
		
		firstPlayerTurn =!firstPlayerTurn;
	}		
	boolean tie = true;
	
	for(int i=0; i<9; i++)
	{
		if (board[i]== ' ') tie = false;
	}
	
	if (tie) 
		System.out.println("There Was a tie");
	else
	{
		if (firstPlayerTurn)
			System.out.println("Player O Wins");
		else 
			System.out.println("Player X Wins");
		
	}
		
	}// end method main
	
	public static void displayBoard(char[] brd)
	{
		 for(int i=0; i< 3; i++) 
		 {
			 System.out.println(" "+(3*i+1)+" | "+(3*i+2)+" | "+(3*i+3));
		 
			 System.out.println(" "+brd[3*i]+" | "+brd[3*i+1]+" | "+
				 brd[3*i+2]);
		 if(i!=2)
			 System.out.println("---+---+---");

		 }
	 }//end method displayBoard
	 
	public static int getValidSpace(char[] brd, boolean firstPlay)
	{
		Scanner reader = new Scanner(System.in);
		
		if(firstPlay) 
			System.out.println("Player X’s Turn:");
		
		else 
			System.out.println("Player O’s Turn:");
		
		System.out.println("Enter a Space [1-9]:");
	    int space = reader.nextInt();
		
	    reader.close();
		while(space<0 || space>9 || brd[space-1] != ' ')
		{
			System.out.println("Please Enter a Valid Space:");
			space = reader.nextInt();
		}
		  return space;
		 
	}//end getvalidspace
	
	 public static boolean checkWinner(char[] brd)
	 {
		for(int i=0; i<3; i++)
		{
			if(brd[3*i] == brd[3*i+1] && brd[3*i+1] == brd[3*i+2] && brd[3*i]!= ' ')
				return true; //horizontal
			if(brd[i] == brd[3+i] && brd[3+i] == brd[6+i] && brd[3*i]!= ' ')
				return true; //vertical
		}
		 //diagonal
		 if(brd[0] == brd[4] && brd[4] == brd[8] && brd[4] != ' ') 
			 return true;
		 
		 if(brd[6] == brd[4] && brd[4] == brd[2] && brd[4] != ' ') 
			 return true;
		 //ties
		 boolean tie=true;
		 
		 for(int i=0; i<9; i++)
		 {
			 
			if(brd[i] == ' ') tie = false;
		 }
		 
		 
		 return tie;
	 }// end checkwinner
	
}// end class tick

