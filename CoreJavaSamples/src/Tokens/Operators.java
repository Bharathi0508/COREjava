package Tokens;

public class Operators {

	public static void main(String[] args) {
		
		unary();// one operand
		Binary();// two operand
		ternary();// three operand
		
	}

	public static void unary() {
		int i = 5;
		i++;
		--i;
		i++;
		System.out.println("The og value is" +i);
		
		float f = i;
		System.out.println("The float value is" +f);
		
		char ch = (char)i;
		System.out.println("The char value is" + ch);
	}
	public static void Binary()
	{
		//Arithmetic operator
		int a, b;
		a= 10; b=20;// assignment operator
		System.out.println("Addition" + (a+b)+ " Subtraction" + (a-b)+ " Multiplication" + (a*b)+ " Division" +(b/a)+ " Modular" +(b/a));
		//Relational Operator
		if(a==b) {
			System.out.println("Both are equal ");}
			else if(a>b) {
				System.out.println("A is greater than B");}
			else if(a<b) {
					System.out.println("B is greater than A");
				}
			else System.out.println("Not Applicable");
		
		
	}
	public static void ternary()
	{
		// conditional operator
		int a=10, b =20;
		System.out.println(((a>b)? "A greater than B": "B is greater than A"));
	}
}
