package tw.leonchen.myproject.exception;

class Insect {
	public void execise() throws RuntimeException {
		System.out.println("go slow.");
	}
}

class Ant extends Insect {

	@Override              //範圍須小於父類 且點除錯鍵快速加入
	public void execise() throws ArithmeticException {
		System.out.println("go as fast as rocket");
	}

	// public void execise(int speed){ //overload
	// System.out.println("speed:" + speed);
	// }

	// public int execise(){ //compile error
	// return 0;
	// }
}

public class TheEx5OverrideException {
	public static void main(String[] args) {
		Ant fireAnt = new Ant();
		fireAnt.execise();
	}
}
