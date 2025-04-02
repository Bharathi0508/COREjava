package objectClass;

public class objectClassConcept {
	
	public void objectMethod() {
		
		int objectNo = 3456798;
		String objectName = "MIET College";
		
		System.out.println("The Best College award goes to " +objectName +" with the cash amount of Rupees" + objectNo);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		objectClassConcept obj = new objectClassConcept();
		objectClassConcept obj1 = new objectClassConcept();
		obj.objectMethod();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj1));
		
		
		
		
	}

}
