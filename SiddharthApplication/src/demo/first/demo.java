package demo.first;

public class demo {

	public static void main(String[] args) {
		String strX = "Siddharth",ans = "";
		
		int len = strX.length();
		
		for(int i = 0; i < len; i++) {
			ans = strX.charAt(i) + ans;
		}
		
		System.out.println(ans);
	}

}
