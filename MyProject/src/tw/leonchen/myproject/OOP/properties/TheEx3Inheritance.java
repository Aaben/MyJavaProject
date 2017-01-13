package tw.leonchen.myproject.OOP.properties;
/*利用存取權限修飾詞控制
 * 再利用特定getter setter存取屬性
 * 
 * 
 */

class Parents {
	String name = "Dada";// 會被繼承但子類別無法直接存取 須透過父類別提供方法來存取
	                     // 如果父類別願意提供(getter setter)
    private int blood =50;
	protected void sayhello() {
	//private 就不行無法被其他class乎叫	
		System.out.println("Hello!"+name);
		 
	}
	
	public int getBlood(){
		return blood;
	}
	
	public void setBlood(int blood){
		this.blood =blood;
		System.out.println(blood);
	}
}

class Child extends Parents{
	
	public void playgame(){
		System.out.println("\nplay Minecraft.");
	
	}
}

public class TheEx3Inheritance {

	public static void main(String[] args) {
		Child go = new Child();//因為有繼承所以子類別可以呼叫父類變數跟函數                      
		go.name="Adidas";      //可實作
		go.sayhello();
		go.playgame();
		go.setBlood(100);

	}

}
