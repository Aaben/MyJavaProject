package tw.leonchen.myproject.OOP.threads;

/*建立多thread有兩種   1.繼承Thread類別  2.實作Runnable介面
 * 看該類別有沒有要繼承其他類別決定
 * 執行緒處理須寫在run()內
 */
class Ctest extends Thread{
	private String id;
   public Ctest(String str){
	   id = str;
   }
	public void run(){  // 要thread 執行的內容
		for(int i=0;i<4;i++){
			System.out.println(id+" is running");
			try {
				Thread.sleep(1000);      // 暫停1000毫秒=1秒 再進入Runnable去搶priority
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}

public class TheEx1ExtendsThread {

	public static void main(String[] args) {
	
			Ctest go =new Ctest("dog");
//			go.start();
			
			Thread t1=new Thread(go);
			t1.start();
			
			Ctest mo =new Ctest("cat");
			mo.start();

	}

}
