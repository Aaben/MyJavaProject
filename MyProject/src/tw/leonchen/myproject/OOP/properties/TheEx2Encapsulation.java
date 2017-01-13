package tw.leonchen.myproject.OOP.properties;


/*在建構方法中，只有第一個敘述可使用this呼叫其他版本的建構方法，而不能先進行其他動作。
 *this是建構式,其他方法並不是如果放在第二行之後,會造成建構順序重複了
 *
 *
 */
class ManageProfiles{
	private String name ="GG";
	private int age =18;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		                //name會忘
		this.name=name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class TheEx2Encapsulation {

	public static void main(String[] args) {
		ManageProfiles profiles =new ManageProfiles();
		profiles.setName("dude");//set 為修改
		
		String hisname = profiles.getName();
		System.out.println("his name is:" + hisname);
		

	}

}
