package upcastingAndDowncasting;

//converting nonprimitive datatype to another non primitive datatype
public class upcastingconcept {
	
    public static void main(String[] args) {
       Dog dog = new Dog(); // Dog object
       
      Animal animal = new Dog();  // Upcasting (automatically done)
        
        animal.makeSound();// Calls the Dog's version of makeSound
        
        dog.makeSound();
    }
}


public class Animal{
	

	    void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    void makeSound() {
	        System.out.println("Dog barks");
	    }
	}



