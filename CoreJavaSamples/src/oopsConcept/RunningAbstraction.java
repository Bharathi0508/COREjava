package oopsConcept;

import oopsConcept_Inheritance.InheritanceConcept;

public class RunningAbstraction extends AbstractionConcept{
	
	
	

	public static void main(String[] args) {
		 {
			 InheritanceConcept abstractMethod = new InheritanceConcept();		
			 
			 abstractMethod.AbstractConcept();
			 abstractMethod.Hostel();
			 
			 RunningAbstraction absmethod = new RunningAbstraction();
			 absmethod.AbstractConcept();
			 absmethod.Hostel();
			 

		 }
			
		 
	}

	@Override
	public void Hostel() {
		System.out.println("The Hostel Method ended");
		
	}

	@Override
	public void AbstractConcept() {
		System.out.println("The Abstractconcept method ended");
		
		
	}}