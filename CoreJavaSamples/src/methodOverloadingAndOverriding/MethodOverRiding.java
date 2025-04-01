package methodOverloadingAndOverriding;

public class MethodOverRiding extends MethodOverloading{
	
	// Here I have extended the MethodOverloading class for accessing add method which i have overrided in this class
	
	@Override
	public void add() {
		String a= "class", b= "room";
		
		String c = a+b;
		System.out.println("The Addition of given words are" + c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.add();
		
		
		MethodOverloading mr = new MethodOverRiding();// Upcasting
		mr.add();// called overridden method
	}

}
