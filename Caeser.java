public class Caeser {

	private static String caesar_encrypt(String str, int n) {
		n = n % 26 + 26;
		StringBuilder encryptedString = new StringBuilder();
		char[] letters = str.toCharArray(); 
		for (char i : letters) {
			boolean isLetter = Character.isLetter(i); 
			if (isLetter) {
				if (Character.isUpperCase(i)) {
					encryptedString.append((char) ('A' + (i - 'A' + n) % 26));
				} else {
					encryptedString.append((char) ('a' + (i - 'a' + n) % 26));
				}
			} else {
				encryptedString.append(i);
			}
		}
		
		return encryptedString.toString();
	}


	public static void main(String[] args) {
		System.out.println(caesar_encrypt("ulql ;q4", 12));
		System.out.println(caesar_encrypt("a4l", 7));
		System.out.println(caesar_encrypt("XyZ", 3));
	}
}
