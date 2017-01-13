package tw.leonchen.myproject.overload;

public class TheEx4VariableScope {
	int a =1;//instance variable
	static int b =2;//static variable
	        //type 變數型態易忘記
	public void f(int c){//local variable
		         //type
		int  d=4; //local variable
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
	
	public static void F(int e){
		//System.out.println("a="+a); error 因為此方法為static
		System.out.println("b1="+b);
		//System.out.println("c="+c); compile error c.d為local
		System.out.println("e1="+e);
	}

	public static void main(String[] args) {
		//因為c沒給值需要建立物件
		TheEx4VariableScope Scope = new TheEx4VariableScope();
		Scope.f(3);
		//Scope.F(4); static通常不這樣寫 不需要另建物件
		
		TheEx4VariableScope.F(4);//直接呼叫
		
		//F(5); 也可因為進入點也為static 可互相呼叫
		
		

	}

}
