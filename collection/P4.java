package collection;

import java.util.*;

public class P4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("hii");
		list.add("hello");
		list.add("yash");
		list.add("hii");
		list.add("technology");
		list.add("hello");
		list.add("yash");
		list.add("technology");
		
		Set<String> set=new HashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		list.sort(Collections.reverseOrder());
		System.out.println(list);
		
	}
	
}
