package tw.leonchen.myproject.OOP;

public class TheEx10String {

	public static void main(String[] args) {
		String data ="Abc123";
		boolean flag1=data.matches("[a-z]{3}");
		System.out.println(flag1);
		
		boolean flag2=data.matches("[a-z]{3}[0-9]{3}");
		System.out.println(flag2);
		
		boolean flag3=data.matches("[a-zA-Z]{3}[0-9]{3}");
		System.out.println(flag3);
		
		boolean flag4=data.matches("[a-zA-z]{3}[^d]{}[0-9]{3}");
		                           //代表有3個A~Z 1個沒d 3個0~9 總共7個字元
		                           //為錯的 同型別要寫一起
		                           //[[a-zA-z]&&[^d]]{3} [a-zA-Z^d]{3}
		System.out.println(flag4);



	}

}
