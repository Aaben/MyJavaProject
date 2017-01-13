package tw.leonchen.myproject.OOP.threads;
/*   sleep(),join()都有例外要用try catch
 * 
 */

public class TheEx2InterfaceThread {

	private class TestThreadEx1 implements Runnable {// interface 實現多重繼承

		@Override
		public void run() {// 因為run的抽象定義在Runnable 所以實作出細節一定為override
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000); 
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

				// System.out.println("i="+i); thread搶到優先權(CPU資源)先做 所以排序不定
				// System.out.println(Thread.currentThread().getName());分開寫會被插隊

				System.out.println(Thread.currentThread().getName() + " i=" + i);
				// 預設 序列-0開始
			}
		}
	}

	public void process() {
		TestThreadEx1 test1 = new TestThreadEx1();// 呼叫 private class
		Thread thread1 = new Thread(test1); // 產生thread類別物件
		thread1.start(); // 呼叫由Thread類別繼承而來的star()去執行thread run()自然被呼叫
							// main()本身就是一執行緒 "finished"同時在執行

		Thread thread2 = new Thread(test1); // 執行一次就dead 要使用就要在new一次
		thread2.start();                    // 兩執行緒 執行同一方法

		try {
			thread2.join();// 等待thread2執行完 要用Try catch接 才會印finished
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("finished");// 所以有可能印在Thread thread1前 機率問題

	}

	public static void main(String[] args) {
		TheEx2InterfaceThread go = new TheEx2InterfaceThread();
		go.process();

	}

}
