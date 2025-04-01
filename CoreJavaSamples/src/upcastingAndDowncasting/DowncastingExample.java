package upcastingAndDowncasting;


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting (implicitly allowed)
        
        // Downcasting (explicitly needed)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Safe downcasting
            dog.makeSound(); // Calls Dog's version
            dog.wagTail();   // Calls Dog-specific method
        } else {
            System.out.println("Downcasting is not possible.");
        }
    }
}



