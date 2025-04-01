package constructor;

public class ConstructorConcept {
	
	 int emp_id = 23456;
	String Emp_Name = "Bharathi";
	
	public  ConstructorConcept() {
		
		System.out.println("The Constructer is initiated");
		
		System.out.println("The Emp_id is "+emp_id+ " " +"the emp_Name is "+Emp_Name);
	}
	
	//constructor overloading
	
	public ConstructorConcept(int emp_id, String Emp_Name) {
		
		System.out.println("The Emp_id is "+emp_id+ " " +"the emp_Name is "+Emp_Name);
		
	}

	

	public static void main(String[] args) {
		
		ConstructorConcept cc_obj = new ConstructorConcept();
	
		 ConstructorConcept cc_obj1 = new ConstructorConcept(56789, "Harani");
	}

}
