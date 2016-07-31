package BasicPrograms;


public class CharacterArray 
{
	public static void main(String [] args)
	{
		StringBuilder scan = new StringBuilder("6901 Sudley Road Manassas VA");
		
		StringBuilder str = new StringBuilder();
		
		System.out.println(scan);

		for(int i = 0; i < scan.length(); i++)
		{
				
			char a = scan.charAt(i);
			
			if(Character.isDigit(scan.charAt(i)))
			{
				str.append("*");
			}
					
			else if(Character.isLetter(scan.charAt(i)))
			{
				
				if(Character.isUpperCase(scan.charAt(i)))
				{
					str.append(Character.toLowerCase(a));
				}
				
				else
				{
					str.append(Character.toLowerCase(a));
				}
				
				System.out.print(str);
			}
		
		
			
		}
		
		
		
	}


}
	
	

