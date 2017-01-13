package tw.leonchen.myproject.OOP;

public class TheEx2Void {
	public void sayhello(){
		System.out.println("Fuck off!");
	}

	public static void main(String[] args) {
		TheEx2Void obj2 = new TheEx2Void();
		 obj2.sayhello();//決定順序
		 obj2.saybye();
		 System.out.println("dick");

	}
	
	public void saybye(){
		System.out.println("YO");
	}

}
