package grp3;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		//Insertion O(1)
		map.put("Ram", 88);
		map.put("Raj", 89);
		map.put("Madhav", 78);
		map.put("Rajesh", 79);
		map.put("Simram",75);
		map.put("Ram", 90);
		map.put(null, 89);
		map.put("", 76);
		System.out.println(map);
		
		//Searching O(1)
//		System.out.println(map.get(null));
//		System.out.println(map.get("Krishna"));
//		
//		//Check O(1)
//		System.out.println(map.containsKey("Ram"));
//		System.out.println(map.containsKey("Krishna"));
		
		//Deletion O(1)
//		System.out.println(map.remove("Ram"));
//		System.out.println(map.remove("Krishna"));
//		System.out.println(map);
		
		Set<String> s = map.keySet();
		System.out.println(s);
		
//		for(String k:s) {
//			System.out.println(k+" "+map.get(k));
//		}
		ArrayList<String> list = new ArrayList<>(s);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+" "+map.get(list.get(i)));
		}
		
		
		TreeMap<String,Integer> map1 = new TreeMap<>();
		
		//Insertion O(log(n))
		map1.put("Ram", 88);
		map1.put("Raj", 89);
		map1.put("Madhav", 78);
		map1.put("Rajesh", 79);
		map1.put("Simram",75);
		map1.put("Ram", 90);
		//map1.put(null, 89);
		//map1.put("", 76);
		System.out.println(map1);
		//Set<String> s1 = map1.keySet();
		
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
		
		//Insertion O(1))
		map2.put("Ram", 88);
		map2.put("Raj", 89);
		map2.put("Madhav", 78);
		map2.put("Rajesh", 79);
		map2.put("Simram",75);
		map2.put("Ram", 90);
		map2.put(null, 89);
		map2.put("", 76);
		System.out.println(map2);
	}
}
