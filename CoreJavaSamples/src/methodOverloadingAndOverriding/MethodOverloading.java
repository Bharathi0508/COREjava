package methodOverloadingAndOverriding;

public class MethodOverloading {
	
	// same method name with different arguments
	
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println("The Addition of both numbers are "+ c);
	}

	public void add() {
		
		int a = 10, b = 20;
		int c = a+b;
		
		System.out.println(c);
	}
	
	public static void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("The Addition of all three numbers are" + d);
	}
	
	
	public static void main(String[] args) {
		
		add(30,50);
		add(10,20,30);
		//add();

	}

}
