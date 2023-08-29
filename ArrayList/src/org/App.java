package org;

import java.util.ArrayList;

public class App {
	
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		list.add("element 5");
		list.add("element 6");
		list.add("element 7");
		
		App app = new App();
//		app.displayList(list);
//		app.removeByIndex(0);
//		System.out.println("-----------------------------------");
//		app.displayList(list);
//		System.out.println("-----------------------------------");
//		app.removeByObject("element 3");
//		System.out.println("-----------------------------------");
//		app.displayList(list);
//		app.modifyName(0, "element 0");
//		app.displayList(list);
		int index  = app.search("element 6");
		if(index != -1) {
			app.modifyName(index, "element 06");
			app.displayList(list);
		} else {
			System.out.println("invald entry");
		}

	}

//	private void removeByObject(String string) {
//		list.remove(string);
//		
//	}
//
//	private void removeByIndex(int i) {
//		list.remove(i);
//		
//	}

	private void displayList(ArrayList<String> list) {
		for(String names: list) {
			System.out.println(names);
		}
		
	}
	
	private void modifyName(int position, String name) {
		list.set(position, name);
	}
	
	private int search(String name) {
		return list.indexOf(name);
	}
	
	

}
