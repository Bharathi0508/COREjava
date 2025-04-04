package collectionFramework.list;

import java.util.List;
import java.util.Stack;

public class stackConcept {

	public static void main(String[] args) {
		
		
		 Stack<String> stackList = new Stack<String>();
		 stackList.add(0, "Dog");
		 stackList.push("Snow");
		 stackList.push("Summer");
		 stackList.add(1, "spring");
		 
		 System.out.println(stackList);
		 
		 stackList.pop();
		 System.out.println(stackList);
		 
		 stackList.remove("Snow");
		 System.out.println(stackList);
		 
		 String topElement = stackList.peek();
		 System.out.println(topElement);

	}

}
