package String;

public class FindCharCount {

	public static void main(String[] args) {
		String reverse = "siddharth";
		
		char a = 'd';
		
		int count = 0;
		
		for(int i = 0;i < reverse.length();i++) {
			char ans = reverse.charAt(i);
			
			if (ans == a) {
				count++;
			}
		}
		System.out.println(count);
	}
}
