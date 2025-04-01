package oopsConcept_Inheritance;

public class MultilevelInheritance extends SingleInheritance {
	public  static String OwnerName = "Bharathi";
	
	public void AudiCars() {
		int car_no = 6789;
		String car_model = "Audi";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
		
	}

	public static void main(String[] args) {
		MultilevelInheritance Bought = new MultilevelInheritance();
		Bought.AudiCars();
		LamborghiniCar();
		Bought.Ferraricar();
		
		

	}

}
