package tw.leonchen.myproject.OOP;
class calculator{
	public void plus(int x1, int y1){
		System.out.println("x+y="+(x1+y1));
	}
	
	public void minus(int x2,int y2){
		System.out.println("x-y="+(x2-y2));
	}
	
	public void multipul(int x3, int y3){
		System.out.println("x*y="+(x3*y3));
	}
	
	public void even(double x4,double y4){
		System.out.println("x/y="+(double)(x4/y4));
	}
}

public class TheEx4Calculator {

	public static void main(String[] args) {
		calculator cp = new calculator();
		cp.plus(5, 6);
		cp.minus(5, 6);
		cp.multipul(5, 6);
		cp.even(5, 6);

	}

}
