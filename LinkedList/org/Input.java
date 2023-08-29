package org;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			System.out.println("Enter element for index: " +i);
			list.add(sc.nextInt());
		}
		sc.close();
		
		for(Integer s: list) {
			System.out.println(s);
		}
		
		
	}

}
