package tw.leonchen.myproject.overload;

public class TheEx5ThisConstructors {
	public TheEx5ThisConstructors() {
		this("David");//this 在這裡就是TheEx5ThisConstructors
		              //在執行一次因為是字串所以先跑下面方法
		System.out.println("first.");
	}
	public TheEx5ThisConstructors(String x){
		System.out.println(x+" You got a mail.");
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TheEx5ThisConstructors obj1=new TheEx5ThisConstructors();
		//建立物件同時建立建構子 若沒有則沒有建構子執行則無法跑
		System.out.println("finished");
		
		
		

	}

}
