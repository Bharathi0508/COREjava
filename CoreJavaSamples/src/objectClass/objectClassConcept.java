package objectClass;

public class objectClassConcept {
	
	public void objectMethod() {
		
		int objectNo = 3456798;
		String objectName = "MIET College";
		
		System.out.println("The Best College award goes to " +objectName +" with the cash amount of Rupees" + objectNo);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		objectClassConcept obj = new objectClassConcept();
		obj.objectMethod();
		
		
		
		
	}

}
