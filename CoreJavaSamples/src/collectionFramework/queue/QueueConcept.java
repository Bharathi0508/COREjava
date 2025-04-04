package collectionFramework.queue;

import java.util.PriorityQueue;

public class QueueConcept {

	public static void main(String[] args) {
		
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("lion");
		queue.offer("tiger");
		queue.add("monkey");
		queue.add("monkey");
		queue.offer("lion");
		
		System.out.println(queue);
		System.out.println(queue.peek()); // returns the head of the queue
		System.out.println(queue);
		System.out.println(queue.poll());// removes the head of the queue
		System.out.println(queue);
		
		queue.remove("monkey");
		
		System.out.println(queue);
	}

}
