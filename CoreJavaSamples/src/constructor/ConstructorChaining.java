package constructor;

public class ConstructorChaining extends ConstructorConcept {

	
	
	public ConstructorChaining(int emp_id , String Emp_Name) {
	
	System.out.println("The constructor chaining initiated");
	
	System.out.println("Here we have called the super class EmpName :"+ super.Emp_Name);
	
	this.emp_id = emp_id;
	this.Emp_Name = Emp_Name;
	System.out.println("The Actual EmpName is "+Emp_Name);
}
	
	public void employee() {
		 
		System.out.println("The Emp_id" +emp_id + " " + "The Empname " +Emp_Name);
	}

	public static void main(String[] args) {
		
		ConstructorChaining cc_object = new ConstructorChaining(677890, "Keerthana");
		
		cc_object.employee();

	}

}
