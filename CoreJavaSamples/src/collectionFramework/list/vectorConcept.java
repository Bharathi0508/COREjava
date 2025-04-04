package collectionFramework.list;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class vectorConcept {

	public static void main(String[] args) {
		Vector <Integer> vectorList = new Vector<>();
		vectorList.add(10);
		vectorList.add(0, 30);
		vectorList.add(1, 50);
		vectorList.add(2, 40);
		vectorList.add(3, 60);
		
		System.out.println("The List of vector as follows "+vectorList);
		
		System.out.println(vectorList.contains(10));
		
		System.out.println(vectorList.get(2));
		
		vectorList.set(0, 90);
		
		vectorList.remove(3);
		
		System.out.println(vectorList.firstElement());
		
		
				System.out.println(vectorList);
		}

}
