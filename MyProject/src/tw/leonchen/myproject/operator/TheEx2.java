package tw.leonchen.myproject.operator;

public class TheEx2 {

	public static void main(String[] args) {
		int i=1,j;
		//j=i++; 對i沒差對j有差 i=2 j=1
		j=++i;
		System.out.println("i="+i);
		System.out.println("j="+j);
		

	}

}
