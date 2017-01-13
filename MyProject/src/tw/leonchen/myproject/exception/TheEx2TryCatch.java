package tw.leonchen.myproject.exception;

public class TheEx2TryCatch {

	public static void main(String[] args) {
		int a = 6, b = 0;
		try {
			@SuppressWarnings("unused")
			int c= a / b;//若b=0.0就可 c=無窮大
		} catch (ArrayIndexOutOfBoundsException e) {//e可自訂
			System.out.println("e1:" + e);
		}catch(ClassCastException e){
			System.out.println("e2:" + e);
		}catch(Exception e){
			System.out.println("e3:" + e);
			//e.printStackTrace();堆疊 把前面e非目標都印出來 
			//                    沒有的話只有e3
			System.exit(-1);
		}
		
		finally{
			
		}
		

	}
}
