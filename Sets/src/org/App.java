package org;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Plan1");
		set.add("Plan2");
		set.add("Plan3");
		set.add("Plan4");
		set.add("Plan5");
		set.add("Plan6");
		set.add("Plan7");
		set.add("Plan8");
		set.add("Plan9");
		
		for(String name: set) {
			System.out.println(name);
		}
		
//		System.out.println(set.contains("Plan3"));
		
		
	}

}
