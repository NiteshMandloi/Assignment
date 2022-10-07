package collection;

import java.util.*;

public class P6 {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("pune", 298298);
		map.put("mumbai", 83774);
		map.put("ahmednagar", 123432);
		map.put("aurangabad", 7645);
		map.put("nashik", 2133);
		map.put("sangali", 34233);
		
		TreeMap<String, Integer> map2=new TreeMap<>(map);
		System.out.println(map2);
		
	}
	
}
