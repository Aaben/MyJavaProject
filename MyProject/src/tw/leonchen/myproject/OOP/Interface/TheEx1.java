package tw.leonchen.myproject.OOP.Interface;

interface Flyer { // 只有在自己單獨存在下才有加public讓人存取(如Vehicle.java)
	              // 沒建構子不可new
	public void takeoff();

	public void fly();

	public void land();
}

class Animal {
	public void eat() {
		System.out.println("eat food.");
	}
}

class airplane implements Flyer {
	              // 少S 

	@Override
	public void takeoff() {
		System.out.println("AirPlane takes Off.");
	}

	@Override
	public void fly() {
		System.out.println("AirPlane flies.");
	}

	@Override
	public void land() {
		System.out.println("AirPlane lands.");
	}

}

class bird extends Animal implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("Bird takes off.");
	}

	@Override
	public void fly() {
		System.out.println("Bird flies.");
	}

	@Override
	public void land() {
		System.out.println("Bird lands.");
	}

}

public class TheEx1 {
	
	public void ACT(Flyer flyer){
		flyer.takeoff(); //要由設定的flyer乎叫
		flyer.fly();
		flyer.land();
	}

	public static void main(String[] args) {
		TheEx1 call = new TheEx1();
		call.ACT(new airplane());
		call.ACT(new bird());
		
		
//		bird blueBird = new bird();
//		blueBird.takeoff();
//		blueBird.fly();
//		blueBird.land();
//		blueBird.eat();
//
//		airplane jet = new airplane();
//		jet.takeoff();
//		jet.fly();
//		jet.land();
	}

}
