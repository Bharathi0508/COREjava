package collectionFramework.set;

import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {

		TreeSet<Integer> Tset = new TreeSet<Integer>();
		
		Tset.add(0);
		Tset.add(1);
		Tset.add(2);
		Tset.add(3);
		Tset.add(4);
		Tset.add(5);
		Tset.add(5);
		System.out.println(Tset.first());
		
		System.out.println(Tset);
	}}