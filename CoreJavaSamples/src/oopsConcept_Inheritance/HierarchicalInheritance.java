package oopsConcept_Inheritance;

public class HierarchicalInheritance extends SingleInheritance{
	
	public static void MarutiCar() {
		int car_no = 7890;
		String car_model = "Maruti Suzukui";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
	}

	public static void main(String[] args) {
		MarutiCar();
		HierarchicalInheritance buy = new HierarchicalInheritance();
		buy.Ferraricar();// method from single Inheritance
		LamborghiniCar(); // Static Method
	}

}
