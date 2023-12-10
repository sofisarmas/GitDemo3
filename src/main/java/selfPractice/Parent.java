package selfPractice;

public class Parent {

	public void upP() {
		System.out.println("upP");
	}
	public void print()	{
		System.out.println("I am from UpcastingParent");
	}
	public static void main(String[] args) {
		Parent up = new Parent();
		up.print();
	}

}
