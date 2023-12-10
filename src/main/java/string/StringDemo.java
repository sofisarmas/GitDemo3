package string;

public class StringDemo {
	static String name1;
	static String name2 = new String("Sarmas");
	public static void main(String args[]) {
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("HELLO");
		
		name1 = "SOFI";
		String name3= "SOFi";

		System.out.println(name1.charAt(2));
		System.out.println(name1.concat(name2));
		
		System.out.println(name1.contains("S"));
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareToIgnoreCase(name2));
		System.out.println(name1.endsWith("I"));
		
		System.out.println(name1.equals(name3));
		System.out.println(name1.equalsIgnoreCase(name3));
		System.out.println(name1.indexOf('F'));
		System.out.println(name1.isEmpty());
		System.out.println(name1.replace('F', 'P'));
		System.out.println(name1);
		System.out.println(name1.valueOf(100));
		System.out.println(name1);
		System.out.println(name2.toUpperCase());
		System.out.println(name2.toLowerCase());
		System.out.println(name2);
		String UCName2 = name2.toUpperCase();
		System.out.println(UCName2);
		
		char ch[] = name2.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String chToSt = new String(ch);
		
		System.out.println(chToSt);
		
		
		
		
		
		
		
	}
}
