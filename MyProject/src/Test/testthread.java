package Test;

class Ctest implements Runnable {
	private String id;

	public Ctest(String name) {
		this.id = name;

	}

	@Override
	public void run() {

		for (int i = 0; i < 4; i++) {
			System.out.println(id + " is fucking");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public void print(){
		
		Ctest go = new Ctest("dog");
		Thread test1 = new Thread(go);
		test1.start();

		Thread test2 = new Thread(new Ctest("cat")); 
		test2.start();
		
	}
}

public class testthread {
	public static void main(String[] args) {
     Ctest gg = new Ctest("");
     gg.print();


	}
}
