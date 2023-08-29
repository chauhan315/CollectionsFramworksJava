package org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> std = new HashMap<>();

		std.put(5, "S5");
		std.put(2, "S2");
		std.put(6, "S6");
		std.put(1, "S1");
		std.put(4, "S4");
		std.put(3, "S3");
		std.put(7, "S7");
		std.put(0, "S0");

		for (Map.Entry<Integer, String> entry : std.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "\tValue: " + entry.getValue());
		}
		
		System.out.println("*****************************************************");
		
		for(Integer key: std.keySet()) {
			System.out.println("Key: " + key + "\tValue: " +std.get(key));
		}
		
		System.out.println("*****************************************************");
		
		Iterator<Entry<Integer, String>> entry = std.entrySet().iterator();
		while(entry.hasNext()) {
			System.out.println(entry.next());
		}
	}

}
