package InterfaceConcept;

public interface carInterface extends interfaceInheritance,interfaceInheritance_one{
	
	@Override
	default void carStart() {
		System.out.println("The car engine is started successfully using key and accelerator");
		
	}
	
	@Override
	default void carStop() {
		System.out.println("The car is stopped Successfully using break");
		
	}
	
	@Override
	default void gearUp() {
		System.out.println("The car started and gear moved from 1 to 5");
		
	}
	
	@Override
	default void gearDown() {
		System.out.println("The car accelerated down from 5 to 1");
		
	}


}
