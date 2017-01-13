package tw.leonchen.myproject.operator;

public class TheEx5Casting {

	public static void main(String[] args) {
		/*
		byte b1=1,b2=2;
	    int b3=b1+b2;  設b3為int*/
		
		//或是強制轉型但要注意目標值域
		byte b1=1,b2=127,b3;
		b3=(byte)(b1+b2);
	    System.out.println(b1);
	    System.out.println(b2);
	    //溢位循環127>-128 在值域內循環
	    System.out.println(b3);

	}

}
