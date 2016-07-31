package BasicPrograms;
/*
 * 
 * *5.41 (Occurrence of max numbers) Write a program that reads integers, finds the largest
of them, and counts its occurrences. Assume that the input ends with number
0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
is 5 and the occurrence count for 5 is 4.
(Hint: Maintain two variables, max and count. max stores the current max number,
and count stores its occurrences. Initially, assign the first number to max
and 1 to count. Compare each subsequent number with max. If the number is
greater than max, assign it to max and reset count to 1. If the number is equal to
max, increment count by 1.)
 * 
 * 
 */


public class SolveLoops 
{
	public static void main(String [] args)
	{
		int count = 0;
		
		int [] a = {3,5,2,5,5,5,0,6}; 
		
		int max = a[0];
		
		for (int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
				count = 1;
			}
			
			else if(max == a[i])
			{
				count++;
			}
			
					
		}
		System.out.printf("Max is %d",max);
		System.out.printf("\nTimes it showed up is %d",count);
	
	}
	
	
	
	
	
	
	
}
