package tw.leonchen.myproject.OOP;

public class TheEx1Method {
	//woker
	public int f(int x){
		return 2*x+1;
	}

	public static void main(String[] args) {
		TheEx1Method ob1 = new TheEx1Method();
		       //caller 
		int y = ob1.f(5);
		System.out.println("y="+y);
		

	}

}
