package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	
	list.add(0, 20);
	list.add(1, 30);
	list.add(2, 70);
	list.add(3, 50);
	list.add(4,30);
	list.forEach(list1 -> System.out.println("The value ranges from " + list1));
	System.out.println(list.listIterator(1).nextIndex());

	
	list.remove(0);
	list.set(0, 40);
	System.out.println(list);
   
	
	list.add(0, 20);
	

	Collections.sort(list);
	System.out.println(list);
      
      
	for (int i = 0; i< list.size(); i++) {
	System.out.println(list.get(i)); 
	}
	
	
 list.clear();
	System.out.println(list.isEmpty());
}}
