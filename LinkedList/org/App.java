package org;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		
		countries.add("India");
		countries.add("Israel");
		countries.add("Russia");
		countries.add("Bhutan");
		countries.add("Afghanistan");
		countries.add("UAE");
		
		
//		System.out.println(countries);
		
		countries.add(1, "Australia");
//		System.out.println(countries);
		
		countries.set(5, "Brazil");
//		System.out.println(countries);
		
		countries.remove("UAE");
		countries.remove(5);
//		System.out.println(countries);
		
		App app = new App();
		app.printList(countries);
		System.out.println("--------------------------------------");
		countries.sort(null);
		app.printList(countries);
		System.out.println("--------------------------------------");
		Collections.reverse(countries);
		app.printList(countries);
		
		
	}
	
	void printList(List<String> list) {
		Iterator<String> iterator = list.listIterator();		
		while(iterator.hasNext()) {
			System.out.println("element = " + iterator.next());
		}
	}

}
