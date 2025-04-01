package oopsConcept;

public class EncapsulationConcept {
	
	//Encapsulation is  combination of States and Behavior or Attributes and methods (getters and setters combination type)
	
	
	int Emp_ID;String Emp_Name, Org_Name;
	
	public int getEmp_ID() {
		return Emp_ID;
	}


	public void setEmp_ID(int emp_ID) {
		Emp_ID = emp_ID;
	}


	public String getEmp_Name() {
		return Emp_Name;
	}


	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}



	public String getOrg_Name() {
		return Org_Name;
	}



	public void setOrg_Name(String org_Name) {
		Org_Name = org_Name;
	}
	
	

	public static void main(String[] args) {
		
		EncapsulationConcept obj = new EncapsulationConcept();
	
		obj.setEmp_ID(234);
		obj.setEmp_Name("Harini");
		obj.setOrg_Name("HCL");
		
		EncapsulationConcept obj2 = new EncapsulationConcept();
		obj2.setEmp_ID(456);
		obj2.setEmp_Name("Kaviya");
		obj2.setOrg_Name("Wipro");
		
		int Emp2 = obj2.getEmp_ID();
		
		System.out.printf("%d, %s, %s%n",obj.getEmp_ID(),obj.getEmp_Name(),obj.getOrg_Name());
		System.out.println(Emp2);
		}

}
