package decisionMaking;

public class DecisionMaking {
	
	public void simpleIf() {
		int a= 110, b= 20;
		if(a>b) {
			System.out.println("A is greater than B");
		}
	}
	
	public String ifElse(int a,int b) {
		if(a>b) {
			return "Number 1 is greater";
		}
		else
			return "Number 2 is greater";
	}
	public void nestedIfAndElseIf(int a, int b) {
		if(a!=0 && b!=0) {
			if(a>b) {
				System.out.println("A is greater");
			}
			else if(b>a) {
				System.out.println("B is greater");
			}
			else System.out.println("Not Applicable");
		}
	}
	public void Switch(int a, int b, char n) {
		switch(n) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
		}
	}
	public static void main(String args[]) 
	{
		
	  	DecisionMaking dm = new DecisionMaking();
	  	dm.simpleIf();
	  	System.out.println(dm.ifElse(10, 20));
	  	dm.nestedIfAndElseIf(38,56);
	  	dm.Switch(45,56 , '+');
	}

}
