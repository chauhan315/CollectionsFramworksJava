package org;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DeQueue {

	public static void main(String[] args) {
		Deque<Integer> deQueue = new LinkedBlockingDeque<>();
		
		try {
			deQueue.offerFirst(1);
			deQueue.offerLast(2);
			deQueue.offerFirst(3);
			deQueue.offerLast(4);
			deQueue.offerFirst(5);
			deQueue.offerLast(6);
			deQueue.addFirst(0);
			
		} catch (IllegalStateException e) {
			System.out.println("Queue is full");
		}
		
		
		for(Integer i: deQueue) {
			System.out.println(i);
		}
		
		System.out.println("Element Method - "+deQueue.element());
		System.out.println("Poll Method - "+deQueue.poll());
		
		for(Integer i: deQueue) {
			System.out.println(i);
		}
	}


}
