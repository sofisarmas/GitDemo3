package exception;

public class UncheckedException {
	public static void main(String a[]) {
		String name = "Sofi Sarmas";
		for(int i=0; i<name.length()+1; i++) {
			System.out.println(name.charAt(i));
		}
	}
}