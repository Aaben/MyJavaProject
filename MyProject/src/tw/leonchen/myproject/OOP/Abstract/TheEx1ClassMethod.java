package tw.leonchen.myproject.OOP.Abstract;
abstract class company {
	abstract void calFuel();
	        //忘記
	abstract void calDistance();
}
	
   class Truck extends company{

	@Override
	void calFuel() {
		System.out.println("Truck calculates Fuel.");
		
	}

	@Override
	void calDistance() {
		System.out.println("Truck calculates Distance.");
	 }
	}
	
	class Ship extends company{

		@Override
		void calFuel() {
			System.out.println("Ship calculates Fuel.");
			
		}

		@Override
		void calDistance() {
			System.out.println("Ship calculates Distance.");
			
		}
		
	}
	   
   

public class TheEx1ClassMethod {
	
	public void processAction(company corp){
		corp.calFuel();
		corp.calDistance();
	}
	//建立共同使用 只要是company的subclass皆可帶入
	//多型的應用
	

	public static void main(String[] args) {
		TheEx1ClassMethod test1 = new TheEx1ClassMethod();
		test1.processAction(new Truck());
		//Truck toyota = new Truck()
		//company corp =Truck toyota 所以直接帶new Truck()
		test1.processAction(new Ship());
		
//		Truck toyota = new Truck();
//		toyota.calFuel();
//		toyota.calDistance();
//		
//		Ship cargoShip = new Ship();
//		cargoShip.calFuel();
//		cargoShip.calDistance();
//---------------------------------------		
//		Company corp;
//		
//		corp = new Truck();
//		corp.calFuel();
//		corp.calDistance();
//		
//		corp = new Ship();
//		corp.calFuel();
//		corp.calDistance();
		

	}

}
