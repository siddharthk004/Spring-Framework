package String;

class First
{
	public void demo() {
		System.out.println("Demo1");
	}
	public void demo(int a) {
		System.out.println("Demo2");
	}
	public void demo(int a,int b) {
		System.out.println("Demo3");
	}
	public void Hello() {
		System.out.println("Hello1");
	}
}

class Second extends First
{
public void Hello() {
	System.out.println("Hello2");	
}
}

public class OverRideLoad {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s = new Second();
		s.demo();
		s.demo(0);
		s.demo(0, 0);
		
		First d = new First();
		d.Hello();
		d = new Second();
		d.Hello();
	}

}
