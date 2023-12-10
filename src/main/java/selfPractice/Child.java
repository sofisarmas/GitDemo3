package selfPractice;

public class Child extends Parent{

	public void upC() {
		System.out.println("upC");
	}
	public void print()	{
		System.out.println("I am from UpcastingChild");
	}
	public static void main(String[] args) {
		Child uc = new Child();
		uc.print();
	}

}
