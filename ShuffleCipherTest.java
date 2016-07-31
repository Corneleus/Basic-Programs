package BasicPrograms;

public class ShuffleCipherTest {
	public static void main(String[] args) {
		ShuffleCipher cipher = new ShuffleCipher(2);
		
		System.out.println(cipher.encode("abcdefghi"));
		
	}
}
