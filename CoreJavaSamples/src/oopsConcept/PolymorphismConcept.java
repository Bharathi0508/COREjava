package oopsConcept;

import oopsConcept_Inheritance.HierarchicalInheritance;
import oopsConcept_Inheritance.HybridInheritance;
import oopsConcept_Inheritance.MultilevelInheritance;

public class PolymorphismConcept extends MultilevelInheritance{
	
	// Compile time poly-morphism : method overloading, method and variable shadowing ,constructor shadowing
	//Run time Poly-morphism : method overriding
	
	//We have already seen the concepts of method overloading and Method overriding
	
	static String OwnerName = "Balasubramanian";
	
	public static void MarutiCar() {
		int car_no = 7890;
		String car_model = "Maruti Suzukui";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
	}
	
	public static void InnovaCar() {
		int car_no = 1234;
		String car_model = "Innova";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
	}
	
	public void AudiCars() {
		int car_no = 6789;
		String car_model = "Audi";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
		
	}

	public static void main(String[] args) {

   MarutiCar();
   MultilevelInheritance  buy = new MultilevelInheritance();
   buy.AudiCars();
   
   System.out.println(OwnerName);
   System.out.println("The Real Owmer name is " + MultilevelInheritance.OwnerName);
	
	}

}
