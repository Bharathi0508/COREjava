package oopsConcept_Inheritance;

import oopsConcept.AbstractionConcept;

public class InheritanceConcept extends AbstractionConcept {
	
	// Acquiring the attributes and methods from other class using "extends" keyword
	
	public int sides = 6;
	
	public  void Hostel() {
		String HostelName = "Tharshini";
		System.out.println("The Name of the Hostel is "+HostelName);
	}
	
	public void AbstractConcept() {
		System.out.println(" The Method has started in a abstract way");
	}
	public static void LamborghiniCar() {
		int car_no = 4567;
		String car_model = "Lamborghini";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
	}

	public static void main(String[] args) {
		InheritanceConcept obj = new InheritanceConcept();
		obj.Hostel();

	}

}
