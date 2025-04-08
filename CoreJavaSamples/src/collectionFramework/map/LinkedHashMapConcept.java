package collectionFramework.map;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> LHmap = new LinkedHashMap<String, Integer>();
		
		LHmap.put("a", 1);
		LHmap.put("b", 2);
		LHmap.put("c", 3);
		System.out.println(LHmap);
		
		System.out.println(LHmap.get("a"));// only we have give key 
		System.out.println(LHmap.get("c"));
	}

}
