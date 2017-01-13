package tw.leonchen.myproject.OOP.properties;

class Test{
//注意public class 只能有一
	private int account=10000;
	public String name="Aben";
	
	public void showInfo(){
		System.out.println("Account:" + account);
		System.out.println("Name:" + name);
		keepSecret();
	}

	private void keepSecret() {
		System.out.println("Don't wanna know.");
	}
	

}

public class TheEx1Encapsulation {

	public static void main(String[] args) {
		Test Bank =new Test();
		System.out.println(Bank.name);
		Bank.name="Gofree";
		//Bank.account=20000 account無法呼叫 because private 只存在同一class
		Bank.showInfo();
		System.out.println("finished");
		
		
		
		

	}

}
