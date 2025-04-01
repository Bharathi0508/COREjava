package arraysConcept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcept {
	

	public static void  main(String[] args) {
		
		int array[] = {1,2,3,4,5,6,7,8,9,0};
		
		char arr[] = {'a','b','c','d','e'};
		
		int array1[] = {4,5,6,7,8,9,1,3,3,5};
	
		System.out.println(Array.getLength(array)); // returns the length of the array , Here 'Array'  is a class
		System.out.println(array1.length);// simple form of the above statement
		
		System.out.println(Array.getChar(arr,3));// used for retrieving the data in particular index
		System.out.println("The index value of 3 in array is "+Array.get(array, 3));
		System.out.println("the index value of 2 in the array is "+array[2]);// simple form than the above statement
		
		System.out.println(array.equals(array1));// return the boolean value
		
		Arrays.sort(array1); //'Arrays' is a class 		
		
		System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(array1));	
	
	/*	System.out.print("[");
		for(int i =0; i< Array.getLength(array1);i++) {
		
			//System.out.println("The index value " +i+" holds the value of "+Array.getInt(array, i));
			
			//System.out.print(Array.getInt(array, i)+","); //gets the value of the array as per index
			System.out.print(array1[i]+","); //simpler form of traversing an array
			
	}
		System.out.println("]");*/
	}
}
