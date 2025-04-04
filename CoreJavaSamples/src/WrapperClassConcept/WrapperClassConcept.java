package WrapperClassConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		Integer a = 10, b= 30;
		
		Integer c = a +b; // Auto Boxing 
		System.out.println(c);
		
		int d = c;// auto Un-boxing
		System.out.println(d);
		
		// Boxing , Explicitly boxing 
		Integer e = new Integer(10);
		 Integer n = Integer.valueOf(d);
		 System.out.println( e + n );
		 
		int num = 25;

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
		

	}

}
