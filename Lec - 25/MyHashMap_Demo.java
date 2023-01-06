package grp3;

import java.util.*;

public class MyHashMap_Demo {

	public static void main(String[] args) {
		MyHashMap<String,Integer> mp = new MyHashMap<>();
		
		//Insertion O(1)
		mp.put("Ram", 89);
		mp.put("Raj", 85);
		mp.put("Madhav", 95);
		mp.put("Akash", 76);
		mp.put("Rajesh", 86);
		mp.put("Ram", 78);
		//mp.put(null, 76);
		//mp.put("", 98);
		System.out.println(mp);
		
		//Searching O(1)
		System.out.println(mp.get("Ram"));
		
		//Check O(1)
		System.out.println(mp.containsKey("Rama"));
		
		//Deletion O(1)
		System.out.println(mp.remove("Ram"));
		
		System.out.println(mp);
		
		mp.hashCode();
		
		//Set<String> st = mp.keySet();
		
//		System.out.println(st);
		
//		for(String x : st) {
//			System.out.println(x+" "+mp.get(x));
//		}
		
		
	}

}
