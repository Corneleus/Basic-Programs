package BasicPrograms;
import ObjectManipulation.MessageEncoder;

public class ShuffleCipher implements MessageEncoder {
	int numShuffles;
	
	public ShuffleCipher(int n) {
		setNumShuffles(n);
	}
	public String encode(String plainText) {
		for(int i = 0; i < getNumShuffles(); i++)
			plainText = shuffle(plainText);
		return plainText;
	}
	
	private String shuffle(String str) {
		String firstHalf = str.substring(0, str.length()/2);
		String secondHalf = str.substring(str.length()/2);
		String shuffled = "";
		
		for(int i = 0; i <= str.length()/2; i++) {
			if(i < firstHalf.length())
				shuffled += firstHalf.charAt(i);
			if(i < secondHalf.length())
				shuffled += secondHalf.charAt(i);
		}
		
		str = shuffled;
		return str;
	}
	
	public int getNumShuffles() {
		return numShuffles;
	}
	
	public void setNumShuffles(int n) {
		numShuffles = n;
	}

}
