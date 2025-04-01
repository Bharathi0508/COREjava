package InterfaceConcept;

public class interfaceClass implements carInterface  {
	
	@Override
		public void carStart() {
			// TODO Auto-generated method stub
			carInterface.super.carStart();
		}
	
	 @Override
	public void carStop() {
		// TODO Auto-generated method stub
		carInterface.super.carStop();
		System.out.println("The car later parked successfully ");
	}
	
	 @Override
	public void gearUp() {
		// TODO Auto-generated method stub
		carInterface.super.gearUp();
	}
	 
	 @Override
	public void gearDown() {
			
		carInterface.super.gearDown();
	
	}
public static void main(String args[]) {
	
	interfaceClass obj = new interfaceClass();
	obj.carStart();
	obj.gearUp();
	obj.gearDown();
	obj.carStop();
	}

}
