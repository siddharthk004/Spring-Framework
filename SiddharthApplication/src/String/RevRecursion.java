package String;

public class RevRecursion {
	public static String result = "";
	public static String ans = "Siddharth";
	public static void main(String[] args) {
		String ansf = "";
		
		int len = ans.length();
		
		ansf = ansX(len);
		
		System.out.println(ansf);
	}
	public static String ansX(int len) {
		if (len == 0) {
			return result;
		}
		else {
			result = result + ans.charAt(len-1);
			return ansX(len-1);
		}
	}
}
