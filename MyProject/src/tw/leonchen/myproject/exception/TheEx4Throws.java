package tw.leonchen.myproject.exception;

public class TheEx4Throws {
	public void division(int x, int y) throws ArithmeticException, Exception {
		System.out.println("x/y=" + (x / y));
	}

	public static void main(String[] args) throws Exception{
		                                 //上面有加Exception所以就會強制檢查
		                                 //沒加trycatch 就會格式錯誤
		                                 //若只有ArithmeticException就可不加
		                                 //另外若在這宣告會throws Exception
		                                 //也可達成不用trycatch接
		                                 
		TheEx4Throws test = new TheEx4Throws();
		test.division(3, 1);
		
		try {
			test.division(3, 0); // 可能有問題用try
			                     // 沒問題就繼續 有問題就到catch 
		} catch (Exception e) {// 這裡所包範圍要比上面大
			System.out.println("no problem");

		}
		

		

	}

}
