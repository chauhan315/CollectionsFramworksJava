package org;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapS {

	public static void main(String[] args) {
		Map<Integer, String> std = new TreeMap<>();
		
		std.put(3, "L3");
		std.put(5, "L5");
		std.put(2, "L7");
		std.put(1, "L1");
		std.put(4, "L4");
		std.put(2, "L2");
		
		for(Map.Entry<Integer, String> entry: std.entrySet()) {
			System.out.println("key: "+entry.getKey()+ "\tvalue: "+entry.getValue());
		}
		
		
	}

}
