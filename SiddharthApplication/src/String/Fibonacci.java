package String;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of fibo : ");
		int len = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		boolean flag = false;
		
		if(len != 0) {
			System.out.println(num1);
			for(int i = 0;i < len;i++) {
				if (len == 1) {
					System.out.println(num1);
					break;
				}
				else {
					if(flag == false) {
						num3 = num1 + num2;
						flag = true;
						System.out.println(num2);
					}
					else {
						num1 = num2;
						num2 = num3;
						flag = false;
					}
				}
			}

			System.out.println(num3);
		}
	}
}
