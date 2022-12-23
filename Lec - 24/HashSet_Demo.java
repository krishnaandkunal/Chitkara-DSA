package grp3;

import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		//O(1)
		HashSet<Integer> set = new HashSet<>();
		
		set.add(90);
		set.add(50);
		set.add(-70);
		set.add(75);
		set.add(70);
		set.add(70);
		set.add(null);
		
		System.out.println(set);
		
		//O(logn)
		TreeSet<Integer> set1 = new TreeSet<>();
		
		set1.add(90);
		set1.add(50);
		set1.add(-70);
		set1.add(75);
		set1.add(70);
		set1.add(70);
		//set1.add(null);
		
		System.out.println(set1);
		
		//O(1)
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		
		set2.add(90);
		set2.add(50);
		set2.add(-70);
		set2.add(75);
		set2.add(70);
		set2.add(70);
		set2.add(null);
		
		System.out.println(set2);
	}

}
