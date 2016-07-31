package BasicPrograms;
import java.util.*;

public class Temps {

	public static void main(String [] args){
			
		String [] month = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec", };
		int [][] high = new int[12][2];
		int [][] low = new int[12][2];
		int lowest = 0;
		int highest = 0;
		int averHigh = 0;
		int averLow = 0;
		int currentHigh = 0;
		int currentLow = 0;
		int tempHigh = 0;
		int tempLow = 0;
		
	
		inputTempForMonth(high, currentHigh, low, month);
		System.out.printf("Average high temp for the year is: %.0f",
				(calcAverHigh(high,averHigh, tempHigh)));
		System.out.printf("\n"+"Highest Temp for year is: %d " , 
				(findHighestTemp(high, highest, currentHigh)));
		System.out.printf("\n" + "Average low temp for the year is: %.0f", 
				(calcAverLow(low, averLow , tempLow)));
		System.out.printf("\n" + "Lowest Temp for year is: %d" , 
				findLowestTemp(low, lowest, currentLow));
		
	}

	public static void inputTempForMonth(int [][] high, double averHigh , int [][] low, String [] month){
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 12 ; i++){
			System.out.println("Please input High temp for " + month[i] + ": ");
			high[i][1] = scan.nextInt();
		
			System.out.println("Please input low temp for " + month[i] + ": ");
			low[i][1] = scan.nextInt();
			}
		scan.close();
		}
		
		
	public static double calcAverHigh(int [][] high, double averHigh, int tempHigh){
		
		for(int i = 0; i < 12; i++){
			tempHigh += (high[i][1]);
			}
				
		averHigh = tempHigh / 12 ;
		
		return averHigh;
	}
	
	public static double calcAverLow(int [][] low, double averLow, int tempLow){
		
		for(int i = 0; i < 12; i++){
			tempLow += (low[i][1]);
			}
				
		averLow = tempLow / 12 ;
		
		return averLow;
	}
	
	public static int  findHighestTemp(int [][] high, int highest, int currentHigh){
		
		for(int i = 0; i < 12; i++){
			currentHigh = high[i][1];
	         
	      if (currentHigh > highest) 
	        highest = currentHigh;
	      
	      }
		
		return highest;
	}
	
	public static int  findLowestTemp(int [][] low, int lowest, int currentLow){
		
		for(int i = 0; i < 12; i++){
	      currentLow = low[i][1];
	         
	      if (currentLow < lowest) 
	         lowest = currentLow;
	      
	      }
		
		return lowest;
	}
	
	
	
}	