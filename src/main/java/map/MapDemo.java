package map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		hm.put(1, "SOFI");
		tm.put(2, "Sarmas");
		
		boolean contains = hm.containsKey(1);
		System.out.println(contains);
		String hm1 = hm.get(1);
		System.out.println(hm1);
		hm.putAll(tm);
		boolean value = hm.containsValue("Sarmas");
		System.out.println(value);
		
		Set<Integer> keys = hm.keySet();
		for(Integer key: keys) {
			System.out.println(key);
		}
		
		for(Integer key: hm.keySet()) {
			String value1 = hm.get(key);
			System.out.println("value "+value1+",  Key "+key);
		}
		
		
		
		
		
	}

}
