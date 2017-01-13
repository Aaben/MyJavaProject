package tw.leonchen.myproject.exception;

class MyOwnException extends Exception {
	// 要大寫
	private static final long serialVersionUID = 1L;
	// 點左邊產生Serial number
	private String server = "deepblue";
	private int port = 12345;
	private String msg = "no message";
	
	public MyOwnException(String server,int port,String msg){
		this.server=server;
		this.port=port;
		this.msg=msg;
	}
	
	public void showMsg(){
		System.out.println("server:" + server);
		System.out.println("port:" + port);
		System.out.println("msg:" + msg);
	}
}

public class TheEx6UerDefinedException {

	public static void main(String[] args) {
		int statuscode = 002;
		if(statuscode%2==0){
        	System.out.println("System error.");
        	try {
				throw new MyOwnException("firstBk",80,"unUsual withdraw");
				//throw出來 須有trycatch來接 
				//後面為new 一個自訂Exception
			} catch (MyOwnException e) {
				//接到此Exception後 才看要做如何處理
				e.showMsg();
			}
        }

	}

}
