
package BasicPrograms;

import java.util.*;

public class Arrays {

	static int [] intArray = new int[15];
	
	static List <Integer> num = new ArrayList<>();
	
	static Random r = new Random();
	
	public static void main(String [] args){
		
		for(int i = 0; i < 15; i++){
			intArray[i] = r.nextInt(10);
		}
		
		for(int i = 0; i < intArray.length; i++){
			System.out.println(intArray[i]);
		}
		
		
	}
	
	
	
}
