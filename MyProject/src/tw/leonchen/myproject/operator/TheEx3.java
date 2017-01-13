package tw.leonchen.myproject.operator;

public class TheEx3 {

	public static void main(String[] args) {
		int i=1,j=2,k;
		//k=i+++++j; syntax error ++旁需有變數
		k=(i++)+(++j);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);

	}

}
