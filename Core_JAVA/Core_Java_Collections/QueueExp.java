package onkar.Core_Java_Collections;

import java.util.PriorityQueue;

public class QueueExp {
	public static void main(String[] args) {
		// Creating a PriorityQueue
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// Adding elements to the PriorityQueue
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(5);
		pq.add(50);

		// Printing the elements of the PriorityQueue
		System.out.println("Elements of the PriorityQueue: " + pq);

		// Removing elements from the PriorityQueue
		int head = pq.poll();
		System.out.println("Removed element: " + head);
		System.out.println("Elements after removing head: " + pq);

		// Peek the head of the PriorityQueue
		int peeked = pq.peek();
		System.out.println("Peeked element: " + peeked);
		System.out.println("Elements after peek: " + pq);
		
		int head1 = pq.poll();
		System.out.println("Removed element: " + head1);
		System.out.println("Elements after removing head: " + pq);
	}

}
