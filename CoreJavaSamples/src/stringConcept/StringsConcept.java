package stringConcept;

public class StringsConcept {

	public static void main(String[] args) {
		String str = "Bharathi NAZI";
		String str1 = "bharathi";
		String str2 = "Priya";
		
		System.out.println("The character at the given index "+str.charAt(3));
		System.out.println(str.chars());
		System.out.println(str.codePointAt(3));
		System.out.println(str.codePointBefore(3));
		System.out.println(str.codePointCount(0, 7));
		System.out.println("The status of comparing string with another string "+str.compareTo(str1)); // returns the unicode
		System.out.println(str.compareToIgnoreCase(str1)); // returns the unicode
		System.out.println("The two strings concatenated as "+str.concat(str2));
		System.out.println("The string contains of other string "+str.contains(str2));
		System.out.println("The string contains the word given "+str.contains("thi"));
		System.out.println("The content equals to another string "+str.contentEquals(str1));
		System.out.println("The content equals to another word "+str.contentEquals("Bharathi"));
		System.out.println("The string endswith the given word is "+str.endsWith("thi"));
		System.out.println("The string is equal to another string "+str.equals(str1));
		
		System.out.println("The strings are equal to another string ignoring case is "+str.equalsIgnoreCase(str1));
		System.out.println("The length of the string is "+str.length());
		
		System.out.println(str.indexOf("a"));
		
	char[] strArray = str.toCharArray();	
	System.out.println(strArray);
	
 System.out.println(str.toLowerCase());	
 System.out.println(str.toUpperCase());
 System.out.println(str.translateEscapes());
		

	}

}
