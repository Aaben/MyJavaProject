package tw.leonchen.myproject.overload;

public class TheEx5This {
	int x=1;
	int y=2;
	
	public void setpostion(int x,int y){
		System.out.println("this.x2="+this.x);
		//還沒指定所以TheEx5This物件裡面仍x=1
		
		
		this.x=x;//等同於test1.x=5 把物件裡面x指定給5
		this.y=y;
		System.out.println("this.x3="+this.x);

	}

	public static void main(String[] args) {
		TheEx5This test1 = new TheEx5This();
		System.out.println("this.x1="+test1.x);
		System.out.println("test1="+test1);
		//test1指向到物件TheEx5This裡面帶有x=1,y=2
		
		
		
		test1.setpostion(5, 3);//因為用test1呼叫所以等同this
		
		System.out.println("this.x4="+test1.x);
		//因物件裡面x值已變成5 所以
		System.out.println("this.y="+test1.y);
		

	}

}
