package String;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int mult = 1;
		if (num <= 1){
			System.out.println(num);
		}
		else {
			for(int i = num; i > 0;i--) {
				mult = mult*i;
			}
			System.out.println(mult);
		}
	}
}
