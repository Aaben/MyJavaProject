package tw.leonchen.myproject.OOP.properties;
class fish{
	String name = "shark";
	
	public fish(){
	}//預設建構子不帶參數 若沒加則下面this跟 super無法共存 
	 //*****還沒看******
	
	public fish(String name){
		this.name = name;
		System.out.println(name);
	}
	public void swim(){
		System.out.println("swim");
	}
	
	public void eat(){
		System.out.println("eat meat.");
	 }
	
	
	
}

class marlin extends fish{
	         // 易忘
	public marlin(){//預設建構子
		
		super();         //預設呼叫父類別
//		super("marlin"); //呼叫有參數的
	}
	
	public void invokeFishMembers(){
		super.eat();
	}
	
	
}
public class TheEx4InheritanceSuper {

	public static void main(String[] args) {
		marlin call =new marlin();
		call.invokeFishMembers();
		

	}

}
