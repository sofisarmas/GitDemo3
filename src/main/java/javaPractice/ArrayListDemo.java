package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Grapes");
		list.add("Apple");

		
		System.out.println(list);
		System.out.println(list.get(1));
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator it = list.iterator();
		System.out.println("=========");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}
