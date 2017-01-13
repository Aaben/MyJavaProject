package tw.leonchen.myproject.OOP;

public class TheEx12Wrapper {

	public static void main(String[] args) {
	      String data =args[0];
	      Integer i1=new Integer(data);//直接呼叫把字串轉成數字
	      int num=i1;// 這裡不需要呼叫了因為autoboxing
	      System.out.println("result:" + Math.sqrt(num));

	}

}
