package stringConcept;

public class StringBufferBuilderConcept {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");

		 StringBuffer sbf = new StringBuffer("Hello");
		
		System.out.println(sb.append('D'));
		System.out.println(sb.insert(5, ",")); 
        System.out.println(sb.append(" World"));
       System.out.println(sb.replace(6, 7, "-"));
       System.out.println(sb.delete(6, 8));
       System.out.println(sb.reverse());
		System.out.println("--------------------------------------------------------------------");
       System.out.println(sbf.append(" World"));
       System.out.println(sbf.insert(5, ","));
       System.out.println(sbf.replace(6, 7, "-"));
       System.out.println(sbf.delete(5, 7));
       System.out.println(sbf.reverse());
       String result = sbf.toString();
       System.out.println(result);
	}

}
