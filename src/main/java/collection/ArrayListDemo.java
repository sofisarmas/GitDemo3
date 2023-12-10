package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList ls = new ArrayList();
		ArrayList ls1 = new ArrayList();
		ls1.add("123");
		ls.add("Sofi");
		ls.add("Sarmas");
		System.out.println(ls);
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		
		for(Object a: ls) {
			System.out.println(a);
		}
		
		Iterator it = ls.iterator();
		System.out.println("=============");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("123=============123");
		
		ListIterator lit = ls.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("123=============12345");
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("123=============1234500");

		ArrayList<String> str = new ArrayList<String>();
		str.add("Sofi");
		str.add(1, "OHHH");
		str.addAll(ls);
		str.addAll(1, ls1);
		Iterator it1= str.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());	
		}
		str.remove(0);
		System.out.println(str);
		str.remove("Sofi");
		System.out.println(str);
		str.removeAll(ls1);
		System.out.println(str);
		str.addAll(ls1);
		System.out.println(str);
		str.retainAll(ls1);
		System.out.println(str);
		
		
	}

}
