package arraysConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToList {

	public static void main(String[] args) {
		
		// Below line is important because, only by adding new ArrayList<> to the list will let you modify the list elements
		//only with Arrays.asList will not help to add or modify the list
		
		List<Integer> list = new ArrayList<>( Arrays.asList(10, 20, 30, 40, 50));
		boolean isContains = list.contains(79);
		System.out.println("the element in the list is "+isContains);
		 System.out.println(list);
	 
		 list.add(89);
		 list.add(0, 78);
		 System.out.println(list);
		 
		 
		 List<List<Integer>> List1 = Arrays.asList(list);
		 
		Object[] listAsArray = List1.toArray();
		 
		 for(int i = 0 ; i < listAsArray.length; i++) {
			 
			System.out.println(List1.get(i)); 
		 }
		
		 
		 
		 
		
	
}}