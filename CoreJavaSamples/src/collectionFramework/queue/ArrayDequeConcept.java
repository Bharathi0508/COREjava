package collectionFramework.queue;

import java.util.ArrayDeque;

public class ArrayDequeConcept {

	public static void main(String[] args) {
		
		ArrayDeque<String> Deque = new ArrayDeque<String>();
		Deque.add("black");
		Deque.addFirst("red");
		Deque.addLast("yellow");
		Deque.add("Blue");
		Deque.add("Blue");
		Deque.add("lavendar");
		Deque.add("orange");
	
		System.out.println(Deque);
		
		Deque.removeLast();
		System.out.println(Deque);
	}

}
