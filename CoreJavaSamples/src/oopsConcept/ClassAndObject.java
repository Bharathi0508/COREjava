package oopsConcept;

import java.util.Scanner;

// Class has been Created
public class ClassAndObject {
	
	// Class is the blueprint of object
	// object is the entity  which has attributes and behaviors

	String EmpName, OrgName ;
	int EmpID;
	public void EmployeeData(int EmpID, String EmpName, String OrgName) {
		
		EmpID = this.EmpID;
		EmpName = this.EmpName;
		OrgName = this.OrgName;
		
		System.out.println("The Employee Details Stored in the Database are");
		 System.out.println("-------------------------------------------------");
	     System.out.printf("%-10s %-10s %-10s%n", "EmployeeID", "EmployeeName", "OrganisationName");
	     System.out.println("-------------------------------------------------");
	     System.out.printf("%-10d %-10s %-10s%n", EmpID, EmpName, OrgName);
	     System.out.println("-------------------------------------------------");
	}
	public static void main(String[] args) {
		
		ClassAndObject obj = new ClassAndObject();// object Creation
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of employee count");
		int n = sc.nextInt();

		for(int i =0; i< n; i++) 
		{
		System.out.println("Enter the Employee ID");
		obj.EmpID = sc.nextInt();
		System.out.println("Enter the Employee Name");
		obj.EmpName = sc.next();
		System.out.println("Enter the Employee Organization Name");
		obj.OrgName= sc.next();
		obj.EmployeeData(obj.EmpID, obj.EmpName, obj.OrgName);
		}
	
		
	}

}
/*
 * import java.util.Scanner;

public class EmployeeDetails {
    // Non-static variables
    String empName;
    int empID;
    String orgName;

    // Constructor to initialize employee details
    public EmployeeDetails(String empName, int empID, String orgName) {
        this.empName = empName;
        this.empID = empID;
        this.orgName = orgName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of employees
        System.out.print("Enter the number of employees: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of EmployeeDetails objects
        EmployeeDetails[] employees = new EmployeeDetails[count];

        // Taking input from user
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Organization Name: ");
            String org = scanner.nextLine();

            // Storing data in the array
            employees[i] = new EmployeeDetails(name, id, org);
        }

        // Displaying employee details in tabular format
        System.out.println("\n--------------------------------------------------");
        System.out.printf("%-10s %-10s %-20s%n", "Emp ID", "Emp Name", "Organization Name");
        System.out.println("--------------------------------------------------");
        
        for (EmployeeDetails emp : employees) {
            System.out.printf("%-10d %-10s %-20s%n", emp.empID, emp.empName, emp.orgName);
        }
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
*/
