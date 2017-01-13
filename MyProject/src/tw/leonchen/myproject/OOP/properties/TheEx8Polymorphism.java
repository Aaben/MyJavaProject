package tw.leonchen.myproject.OOP.properties;

class mammal {//多型 只能解釋大家擁有的 這裡是happy() 是用多個子類別
	public static void play(mammal m) {//父類別建立物件名稱 呼叫子類別方法
		// subclass >> dog snoopy = new dog();
		// mammal m = snoopy; -> mammal m = new dog();
		
		m.happy();//當子類別改寫可直接乎叫子類別函數(happy())
		          //snoopy 呼叫dog 類別裡的happy
		if (m instanceof dog){
			dog d1=(dog)m;   //強制轉型 父類別物件呼叫子類別函數(沒有改寫但要存取)
			//dog d1 = new dog()>>
			d1.bite();
		}
		if (m instanceof cat){ //測試物件是否與某類別或是某介面有繼承關係
			                   
			cat c1=(cat)m;
			c1.run();
		}
//		cat c2=(cat)m; runtime error classcastexception
//		c2.run();      but compile is correct
//       即為把所有mammal都變貓做貓的方法 但狗不會所以跑的時候出錯
	}

	public void happy() {
		System.out.println("happy.");
	}
}

class dog extends mammal {

	@Override
	public void happy() {
		System.out.println("wang wang happy.");
	}
	
	public void bite(){
		System.out.println("play ball");
	}
}

class cat extends mammal {//subclass所以括號要注意

	@Override
	public void happy() {
		System.out.println("nia nia happy.");
	}
	
	public void run() {
		System.out.println("sleep");
	}
}

public class TheEx8Polymorphism {

	public static void main(String[] args) {
		dog snoopy = new dog();
		// call.play("snoopy")
		mammal.play(snoopy);
		// ****snoopy 已經定義****不是字串型別

		cat king = new cat();
		//要注意類別括號
		mammal.play(king);

	}

}
