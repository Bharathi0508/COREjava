package collectionFramework.set;

import java.util.HashSet;

public class HashsetConcept {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		
		hSet.add(10);
		hSet.add(70);
		hSet.add(80);
		hSet.add(90);
		hSet.add(10); // doesn't allowed duplicate
		System.out.println(hSet);
		
		hSet.remove(70);
		System.out.println(hSet);

	}

}
