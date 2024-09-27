package String;

public class Recursion {

	public static void main(String[] args) {
		String reverse = "ded";
		String ans = "";

		System.out.println(reverse);
		
		int len = reverse.length();
		
		for(int i = 0;i < len;i++) {
			ans = reverse.charAt(i) + ans;
		}
		
		System.out.println(ans);
		
		if(reverse.equals(ans)) {
			System.out.println(" Palindrome ");
		}
		else {
			System.out.println(" Not Palindrome ");
		}
	}
}
