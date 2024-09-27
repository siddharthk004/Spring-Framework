package String;

public class FindNumerical {

	public static void main(String[] args) {

		String abc = "Siddharth123";
		char ch = '\0';
		
		for(int i = 0;i < abc.length();i++) {
			ch = abc.charAt(i);
			int k = Character.getNumericValue(ch);
			if(k >= 0 && k <= 9) {
				System.out.println(ch);
			}
		}

	}

}
