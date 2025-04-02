package exceptionHandling;

public class HandlingException {
	
	
	private String str;


	public void Runtime_ArithmeticExcetion() {
		int a, b;
		a = 10; b = 0;
		try {
		int c = a/b;
		System.out.println(c);}
		
		catch(ArithmeticException e) {
			
			System.out.println("The Number "+e.getMessage()+" is not acceptable");
			
			System.out.println(e.fillInStackTrace());
			
		}
	}

	public void Runtime_ArrayIndexOutOfBoundException() {
		
		int a[] = new int[5];
	a[0] = 10;
	a[2] = 20;
	a[3] = 30;
	a[4] = 40;
	a[1] = 50;
	try {
	System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(e.getMessage());
	}
	}	
	
	public void RunTime_NullPointerException() {
		
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException a) {
			System.out.println(a.getMessage());
		}
	}
	
	public void RunTime_classCasting() {
	    
	        try {
	            Object obj = new String("Hello");
	            Integer num = (Integer) obj;  // Causes ClassCastException
	        } catch (ClassCastException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	

	
	public static void main(String[] args) {
		
		
	 HandlingException calledException = new HandlingException();
	  calledException.Runtime_ArithmeticExcetion();
	  calledException.Runtime_ArrayIndexOutOfBoundException();
	 
	  calledException.RunTime_NullPointerException();
	 calledException.RunTime_classCasting();

	}

}
