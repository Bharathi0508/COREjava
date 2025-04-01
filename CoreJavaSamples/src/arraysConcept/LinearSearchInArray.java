package arraysConcept;

import java.util.Scanner;

public class LinearSearchInArray {
	
// Linear search is having a key element   and if key element matches the index of an array then the element is found

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the key element to search it ");
		int key = scanner.nextInt();
		
	int	array[]= {1,2,3,4,5,6,7,8,9,0};
	
	 for(int i =0; i< array.length; i++) {
		 
		 if(key == array[i]) 
		 
			 System.out.println("The element is found in the index" + i);
		 } 
	 }
	
	

	}


