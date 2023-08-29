package org;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		
		try {
			queue.offer(1);
			queue.offer(2);
			queue.offer(3);
			queue.offer(4);
			queue.offer(5);
			queue.offer(6);
		} catch (IllegalStateException e) {
			System.out.println("Queue is full");
		}
		
		
		for(Integer i: queue) {
			System.out.println(i);
		}
		
		System.out.println("Element Method - "+queue.element());
		System.out.println("Poll Method - "+queue.poll());
		
		for(Integer i: queue) {
			System.out.println(i);
		}
	}

}
