package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1 {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(0);
		l.add(6);
		l.add(32);
		l.add(23);
		l.add(78);
		l.add(66);
		
		Collections.sort(l);
		
		System.out.println(l);
	}
	
}
