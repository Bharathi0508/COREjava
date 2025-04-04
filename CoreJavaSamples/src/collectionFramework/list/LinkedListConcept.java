package collectionFramework.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {
	
	public static void main(String[] args) {
		
		LinkedList<String> stringLinkedList = new LinkedList<>();
		stringLinkedList.add("lion");
		stringLinkedList.add(0, "tiger");
		stringLinkedList.add(1, "wolf");
		stringLinkedList.add(2, "lion");
		stringLinkedList.add(3, "elephant");
		System.out.println(stringLinkedList);
		
		
	List<String> subLlist = stringLinkedList.subList(1, 3);
		System.out.println(subLlist);
		
		System.out.println(stringLinkedList.get(1));//Access
		stringLinkedList.set(0, "shark"); // Update or Modify
		stringLinkedList.remove("lion");// Delete
		//stringLinkedList.replaceAll(String ::toUpperCase);

		stringLinkedList.replaceAll(str -> str.toUpperCase()); // Modify something in all the list elements

		System.out.println(stringLinkedList.peek());
		System.out.println("the First in List is " + stringLinkedList.getFirst() + " the last in List is " +stringLinkedList.getLast());
		System.out.println(stringLinkedList);

	}

}
