package String;

class Animal 
{
	public Animal() {
	}
}

class Cat extends Animal
{
	public void run() {
		System.out.println("Cat can run");
	}
}

class Dog extends Animal
{
	public void bark() {
		System.out.println("Dog can bark");
	}
}

class Bird extends Animal
{
	public void fly() {
		System.out.println("Bird can fly");
	}
}

public class inheritance {

	public inheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Animal obj = new Animal();
		
		obj = new Cat();
		((Cat) obj).run();
		
		obj = new Dog();
		((Dog)obj).bark();
		
		obj = new Bird();
		((Bird)obj).fly();

	}

}
