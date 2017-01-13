package tw.leonchen.myproject.overload;

public class TheEx1Overload {
	
	public void add(int x ,int y){
		System.out.println("x+y="+(x+y));
	}
	
	public void add(double x, double y){
		System.out.println("x+y="+(x+y));
	}

	public static void main(String[] args) {
		TheEx1Overload play =new TheEx1Overload();
		//call method not class
		play.add(5,6);
		play.add(5.6,6.5);
		//ASCII auto-change depend on value
		play.add('a',6);
		play.add('A',6.2);

	}

}
