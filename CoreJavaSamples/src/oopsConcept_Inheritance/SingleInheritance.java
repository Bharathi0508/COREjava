package oopsConcept_Inheritance;

public class SingleInheritance extends InheritanceConcept{
	
	public void Ferraricar() {
		int car_no = 2345;
		String car_model = "Ferrari";
		System.out.println("The Car that you have selected is "+ car_no +" " + car_model);
		
	}

	public static void main(String[] args) {
		SingleInheritance buy = new SingleInheritance();
		buy.Ferraricar();
		buy.Hostel(); // used via inheritance
		LamborghiniCar();
	}

}
