package collectionFramework.set;

import java.util.LinkedHashSet;

public class LinkedhashSetConcept {

	public static void main(String[] args) {
	  LinkedHashSet<Integer> LHashset  = new LinkedHashSet<Integer>();
	  LHashset.add(90);
	  LHashset.add(80);
	  LHashset.add(60);
	  LHashset.add(40);
	  LHashset.add(40);// no duplicates
	  
	  System.out.println(LHashset);
	  System.out.println(LHashset.size());

	}

}
