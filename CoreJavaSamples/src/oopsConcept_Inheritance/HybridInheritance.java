package oopsConcept_Inheritance;

public class HybridInheritance extends HierarchicalInheritance {
	
	public static void InnovaCar() {
		int car_no = 1234;
		String car_model = "Innova";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
	}

	public static void main(String[] args) {
	InnovaCar();
	MarutiCar();
	LamborghiniCar();
	HybridInheritance buy = new HybridInheritance();
	buy.Ferraricar();
	
	SingleInheritance buy1 = new HybridInheritance();
	buy1.Ferraricar();
	buy1.Hostel();
	MarutiCar();
	
	HierarchicalInheritance buy2 = new HybridInheritance();
	buy2.Ferraricar();
	buy2.Hostel();
	MarutiCar();
	LamborghiniCar();
	
	HybridInheritance buy3 = (HybridInheritance) new HierarchicalInheritance();
	buy3.Ferraricar();
	InnovaCar();
	MarutiCar();
	LamborghiniCar();

	}

}
