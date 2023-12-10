package wrapper;

public class UnBoxing {
	public static void main(String args[]) {
		Integer I = 100;
		int i = I;
		System.out.println(i);
		
		String num = "10";
		int i2 = Integer.parseInt(num);
		System.out.println(i2);
		
		byte b = Byte.parseByte(num);
		System.out.println(b);
		
		short s = Short.parseShort(num);
		System.out.println(s);
		
		long l = Long.parseLong(num);
		System.out.println(l);
		
//		String name = "Sofi";
//		int i3 = Integer.parseInt(name);
		
		String name2 = " ";
		int i4 = Integer.parseInt(name2);
	}
}
