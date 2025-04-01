package oopsConcept;

import oopsConcept_Inheritance.InheritanceConcept;

public class superAndthisKeyword extends InheritanceConcept{
	
	public int sides = 5;
	
	public void square() {
		int sides = 4; // local
		int Area = sides * sides;
		System.out.println("The Area of the square is "+ Area );
	}
	
	public void rectangle() {
		int sides = 8; // local
		int Area = sides * super.sides ; // inherits from the super class & must to give the access modifier to use super keyword
		
		System.out.println("the Area of rectangle " + Area);
	}
	
	public double circle(int r)
	{
		
		double globalArea = sides*sides*3.14 ;// uses the global value of Side
		System.out.println("The Area of the circle with global value is " + globalArea);
		
		this.sides = r;
		double Area = sides*sides*3.14; // uses the variable passed instead of global variable
		
	    return Area;
	}

	public static void main(String[] args) {
		
		superAndthisKeyword areas = new superAndthisKeyword();
		System.out.println("The Area of the circle with given radius "+areas.circle(9));
		areas.rectangle();
		areas.square();

	}

}
