package BasicPrograms;
import java.util.*;
import java.lang.StringBuilder;

public class Builder 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String a = "Java is fun ";
		String b;
		String c = " I love it! ";
		
		StringBuilder sb = new StringBuilder(a);
				
		System.out.printf("Enter Yes "+ "\n" );
		b = scan.nextLine();
		
		System.out.printf("Length is : %d "+ "\n", a.length());
		System.out.printf("Capacity is : %d " + "\n", sb.capacity());
		
		sb.append(c);
		
		sb.insert(a.length(), b);
		
		System.out.println(sb);
		
		scan.close();
	}
	
	
}
