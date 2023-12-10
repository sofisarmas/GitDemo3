package selfPractice;

public class DriverOverriding {

	static final int j=100;
	public static void main(String[] args) {
		ChildOveriding co = new ChildOveriding();
		final int i;
		i=10;
//		j=100;
		System.out.println(i+" "+j);
		co.print();
	}

}
