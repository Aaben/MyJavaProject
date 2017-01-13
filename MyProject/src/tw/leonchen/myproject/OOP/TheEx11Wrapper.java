package tw.leonchen.myproject.OOP;

public class TheEx11Wrapper {

	public static void main(String[] args) {
		String messenger="12345";
		System.out.println("messenger+1="+(messenger+1));
		
		int num1=Integer.parseInt(messenger);
		System.out.println("num1+1="+(num1+1));
		//看JAVA API 在lang integer
		
		Integer i1=new Integer(messenger);
		int num2=i1.intValue();
		System.out.println("num2+1="+(num2+2));
		
		

	}

}
