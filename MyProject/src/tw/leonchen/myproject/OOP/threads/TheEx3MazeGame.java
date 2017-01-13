package tw.leonchen.myproject.OOP.threads;

class MazeGameCore { // 進階 把座標改陣列塞劇情
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) { //多個thread執行時使用到相同變數或物件 避免資料錯亂(插隊)使用
			this.x = x;
			this.y = y;
			System.out.println("x:" + x + " y:" + y);
			this.notify(); // 告知wait()可執行了
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();// 凍結執行緒等待notify提醒  所以產生座標一次就檢查一次
				if (x == 0 && y == 0) {
					System.out.println("Game Exit");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Hero implements Runnable {

	private MazeGameCore core;      // 宣告類別變數 用意在接外面core物件

	public Hero(MazeGameCore core) { // 建構子 確保core為同一個
		 
		this.core = core;            // 設定相等 將外部物件設給本類別變數(多型)
		                             //讓此類別方法run可以使用 外部core物件
	}

	@Override
	public void run() {
		while (true) {
			int posX = (int) (Math.random() * 5);
			int posY = (int) (Math.random() * 5);
			core.move(posX, posY);
			try {
				Thread.sleep((int) (Math.random() * 600));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MazeGameCheck implements Runnable {
	private MazeGameCore core;

	public MazeGameCheck(MazeGameCore core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			core.checkExit();
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class TheEx3MazeGame {

	public static void main(String[] args) {
		MazeGameCore core = new MazeGameCore();
		Hero applePen = new Hero(core);
		Thread thread1 = new Thread(applePen);
		thread1.start();
		MazeGameCheck check=new MazeGameCheck(core);// 將物件core 傳遞到建構子
		Thread thread2 = new Thread(check);
		thread2.start();
		
		
	}

}
