package String;

public class CountVowels {

	public static void main(String[] args) {
		String data = "Siddharth";
		
		int vowel = 0,character = 0;
		
		for(int i = 0;i < data.length();i++) {
			if(data.charAt(i) == 'a' || data.charAt(i) == 'e' || data.charAt(i) == 'i' || data.charAt(i) == 'o' || data.charAt(i) == 'u') {
				vowel++;
			}
			else {
				character++;
			}
		}
		System.out.println(vowel);
		System.out.println(character);
	}
}
