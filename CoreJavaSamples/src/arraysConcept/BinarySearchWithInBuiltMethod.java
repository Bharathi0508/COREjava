package arraysConcept;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWithInBuiltMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements should be in an array");
		int n = sc.nextInt();
		
		
		// declaration of array and count of elements
		int array[] = new int[n];
		
		
		//User Input for Array elements
		System.out.println("Enter the "+n+" array  elements ");
		for(int i = 0; i< array.length; i++) {
			
			array[i] = sc.nextInt();
		}
		
	
		//Searching the Element using in built binary search method
		System.out.println("Enter the element to be searched ");
		int x =	sc.nextInt();
		int searchelement = Arrays.binarySearch(array, x);
		System.out.println("the element you have searched is in the index " + searchelement);
		
		
		//converting arrays to String
		
		System.out.println(Arrays.toString(array));

	}

}
