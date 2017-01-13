package tw.leonchen.myproject.overload;
class clo{
	
	//TheEx3Static.grade; 這裡無法呼叫 非進入點
	//非public class 只能被呼叫使用
	
	
	public void study(){
		System.out.println("why study hard");
	}
	
}

public class TheEx3Static {
	static int grade = 80 ;
	static String name ="student";
	
	
	public static void study(){
		System.out.println("study harder");
	}

	public static void main(String[] args) {
		System.out.println(TheEx3Static.grade);
		System.out.println(TheEx3Static.name);
		
		TheEx3Static.study();
		
		TheEx3Static.grade=100;
		TheEx3Static.name="Dirk";
		
		System.out.println(TheEx3Static.grade);
		System.out.println(TheEx3Static.name);
		
		//public class 只能有一個   進入點也只能一個
		//可以從這裡呼叫class clo
		//class clo 只能被使用  無法由class clo呼叫
		//在Java裡面所有Expression只能存在method中
		//除了[static] initialization block
		//或宣告變數時，可以同時用一個 expression 當做 assignment。
		
		clo go=new clo();//class 位置有差寫在public後無法辨識
		go.study();
		

	}
	

}
