package tw.leonchen.myproject.OOP.nestedclass;

//class Car implements Vehicle{
//
//	@Override
//	public void forward() {
//        System.out.println("Car go forward.");		
//	}
//
//	@Override
//	public void backward() {
//		System.out.println("Car go backward.");	
//	}
//
//	@Override
//	public void turn() {
//		System.out.println("Car turns left or right.");
//	}
//	
//}  初級寫法 麻煩還要implement 且不能override

public class TheEx3type4 {

	public static void main(String[] args) {
//		Car ferrari = new Car();
//		ferrari.forward();
//		ferrari.backward();
//		ferrari.turn();
		
		new Vehicle(){

			@Override
			public void forward() {
				System.out.println("Vehicle go forward.");
				
			}

			@Override
			public void backward() {
				System.out.println("Vehicle go backward.");
				
			}

			@Override
			public void turn() {
				System.out.println("Vehicle go backward.");
				
			}
			
		}.backward(); //只可用一次 可覆寫且效率高 不用另外implement
		              //但用過就不見 需要多次使用則不好
		
//      把它物件話就可多次使用
//		Vehicle someVehicle = new Vehicle(){ 
//
//			@Override
//			public void forward() {
//				System.out.println("Vehicle go forward.");
//			}
//
//			@Override
//			public void backward() {
//				System.out.println("Vehicle go backward.");	
//			}
//
//			@Override
//			public void turn() {
//				System.out.println("Vehicle turns left or right.");
//			}			
//		};
//		
//		someVehicle.backward();
//		someVehicle.forward();
//		someVehicle.turn();
	}

}
