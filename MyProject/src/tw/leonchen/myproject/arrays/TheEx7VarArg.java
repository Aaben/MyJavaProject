package tw.leonchen.myproject.arrays;

public class TheEx7VarArg {
	public void sum(int... data) {
		int total = 0;// 在for外才對
		for (int i = 0; i < data.length; i++) {

			total = total + data[i];

		}
		System.out.println("total:" + total);

	}

	public static void main(String[] args) {

		TheEx7VarArg play = new TheEx7VarArg();
		play.sum();

	}

}
