package org;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		stack.pop();
		System.out.println(stack.search(4));
		
		System.out.println(stack.peek());
		
		Boolean flag = stack.isEmpty();
		System.out.println(flag);
		
		
		for(Integer temp: stack) {
			System.out.println(temp);
		}
		
		System.out.println(stack.search(4));
		
		

	}

}
