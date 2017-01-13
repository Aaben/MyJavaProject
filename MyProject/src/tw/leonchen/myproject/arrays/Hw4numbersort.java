package tw.leonchen.myproject.arrays;

public class Hw4numbersort {
	int[] data = new int[10];
	int[] count = new int[50];

	// while 試試看

	public void number() {

		for (int i = 0; i < data.length; i++) {
			int level = (int) (Math.random() * 49) + 1;
			data[i] = level;
			// System.out.printf("data[%d]=%d\n", i, data[i]);

			for (int j = 1; j < count.length; j++) {

				if (data[i] == j) {
					count[j] = count[j] + 1;
					// System.out.println("個數=" + count[j] + "\n");
				}

			}
			while (true) {
				int stop = 0;
				for (int j = 1; j < count.length - 1; j++) {
					int temp = 0;
					int temp2 = 0;
					if (count[j] < count[j + 1]) {
						temp = count[j];
						count[j] = count[j + 1];
						count[j + 1] = temp;

						temp2 = data[i];
						data[i] = data[i + 1];
						data[i + 1] = temp2;

						stop++;

					}

				}
				if (stop == 0) {

					break;
				}

			}

		}

	}

	public static void main(String[] args) {
		Hw4numbersort call = new Hw4numbersort();
		call.number();

	}

}
