package tw.leonchen.myproject.loop;

public class TheEx3Nested {

	public static void main(String[] args) {
		int j=1;
		while(j<=3){
			int i=1;//while裡面要注意宣告變數不可外提
			while(i<=10){
				System.out.print("@");
				i++;
			}
			System.out.println();//System.out.print("/n")換行
			j++; //忘了打所以無限LOOP
		}

	}

}
