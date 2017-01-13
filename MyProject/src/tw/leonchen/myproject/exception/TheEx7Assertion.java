package tw.leonchen.myproject.exception;

public class TheEx7Assertion {

	public static void main(String[] args) {
		int a=6,b=0;
		assert b!=0:"b="+b;
		//啟用後就不會計算直接跳出 斷言錯誤
		//開啟方法為>右鍵>properties>Run/De>classname>Argu>
		//VM Argu裡打 -ea 設定完成
		System.out.println((a/b));

	}

}
