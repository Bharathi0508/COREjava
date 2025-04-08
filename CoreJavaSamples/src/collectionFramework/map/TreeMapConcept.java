package collectionFramework.map;

import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
	 
		
		TreeMap<Integer, String> TMap = new TreeMap<Integer, String>();
		TMap.put(0, "Yazhini");
		TMap.put(1, "Dharani");
		TMap.put(2,"Kaviya");
		TMap.put(0, "Bharathi");
		TMap.put(0, "Harani");
		
		
		System.out.println(TMap);
		
		System.out.println(TMap.firstKey());
		System.out.println(TMap.get(0));
		System.out.println(TMap.lowerEntry(1));
		System.out.println(TMap.pollFirstEntry());
		System.out.println(TMap.pollLastEntry());
	}

}
