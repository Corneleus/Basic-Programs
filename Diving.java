package BasicPrograms;
import java.util.*;
/**
 * 
 * @author Cory Caswell
 *
 */
public class Diving 
{
	
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		double validD = inputValidDegreeOfDifficulty();
		double[] scores = inputAllScores();
		
		System.out.printf("Degree of Difficulty: %.2f %n ", validD);
		for(int i = 0; i < scores.length; i++)
			System.out.printf("Judge #%d score %.2f%n ", i, scores[i]);
		System.out.printf("Total Score: %.2f ", calculateScore(scores, validD));
		
	scan.close();
	}
	
	public static double[] inputAllScores(){
		System.out.print("Enter number of judges: ");
		Scanner scan = new Scanner(System.in);
		double[] judges = new double[scan.nextInt()];
		
		for(int i = 0; i < judges.length; i++)
			judges[i] = inputValidScore();
		
		int lowest = 0;
		int highest = 0;
		
		scan.close();
		for(int i = 0; i < judges.length; i++)
			for(int j = i; j < judges.length; j++)
			{
				if(judges[j] < judges[lowest])
					lowest = j;
				if(judges[j] > judges[highest])
					highest = j;
					
			}
		double[] scores = new double[judges.length-2];
		for(int i = 0; i < scores.length; i++)
			if(i != highest && i != lowest)
				scores[i] = judges[i];
		return scores;
	
	}
	
	public static double inputValidScore() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter score:");
		scan.close();
		return scan.nextDouble();
	
	}
	
	public static double inputValidDegreeOfDifficulty()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter Degree between 1.2 and 3.8 ");
		double validD = scan.nextDouble();
		
		while (validD < 1.2 && validD > 3.9)
		{
			System.out.printf("Please Enter Valid Degree between 1.2 and 3.8 ");
			validD = scan.nextDouble();
		}
		
		scan.close();
		return validD;
		
	}

	public static double calculateScore(double[] arr, double diff)
	{
		double sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		return sum * diff * .6;
	}

	
}
