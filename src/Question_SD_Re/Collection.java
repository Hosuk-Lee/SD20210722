package Question_SD_Re;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collection {
	
	public static void c1() {
		
		List<String> a = new ArrayList<String>();
		
		a.add("a");
		a.add("a");
		a.add("a");
		a.add("a");
		a.add("a");
		
	}
	
	public static void c2() {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("a");
		hs.add("a");
		hs.add("b");
		System.out.println(hs.size());
		
		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		c2();
	}
}
