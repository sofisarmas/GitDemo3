package abstraction;

public class Sub extends Super{

	public static void main(String[] args) {
	}
	
	public void print() {
		System.out.println("Sub");
	}
	
	public void hello() {
		System.out.println("HELLO");
	}
	
	Super supwe = new Sub(); // we can create object of concrete class and can store it in abstract class
	
}
