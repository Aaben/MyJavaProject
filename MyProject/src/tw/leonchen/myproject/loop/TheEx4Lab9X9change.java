package tw.leonchen.myproject.loop;

public class TheEx4Lab9X9change {

	public static void main(String[] args) {
			int i = 1;
			while (i <= 9) {
				int j = 1;
				while (j <= 9) {
	                System.out.printf("%dx%d=%2d\t",i,j,i*j);
					j++;
				}
				System.out.print("\n");
				i++;
			}

	}

}
