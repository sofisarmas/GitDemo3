package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		ls.add("Sofi");
		ls.add("Sarmas");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println(ls);
	}

}
