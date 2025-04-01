package loopingStatements;

import Tokens.Operators;
import decisionMaking.DecisionMaking;

public class LoopStatements {
	static int i;
	
	private static void whileLoop() {
		
		String str = "Bharathi";
		int i = 0;
		while(i<=5) {
			
		System.out.println(str+" " +"exectuing while loop");
		i++;
	}
	}
	
	//static methods can only use static variables
	protected static void doWhileLoop() {
		
		do {
			
			System.out.println("Hi executing do while loop");
			i++;
		}while(i<3);
		
	}
	
	private void forLoop() {
		for(int i = 0; i<=5 ;i++) {
			
			System.out.println("Hi User , Executing for Loop");
		}
	}
	
	public static void main(String[] args) {
		
		whileLoop();// Static methods can be called without creating object
		doWhileLoop();
		LoopStatements loop = new LoopStatements(); // object creation
		loop.forLoop(); // non static method called using object

		// imported an decisionMaking package to access non static method and created object for the class and called the non static method
		DecisionMaking dm = new DecisionMaking();
		dm.ifElse(23, 45);
		
		// imported Tokens package to access the static method of the Operator Class
		
		Operators.unary();
		
	}

}
