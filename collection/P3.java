package collection;

import java.util.*;
import java.util.Set;

public class P3 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(4);
		
		Set<Integer> set=new HashSet<>();
		set.addAll(list);
		System.out.println(set);
		
	}
	
	
}
