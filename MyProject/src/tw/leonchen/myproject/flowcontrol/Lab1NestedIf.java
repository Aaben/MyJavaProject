package tw.leonchen.myproject.flowcontrol;

public class Lab1NestedIf {

	public static void main(String[] args) {
		int number=-136;
		if(number>=0){
			System.out.println(number+"為正數");
			
			if(number%2==0){
				System.out.println(number+"為偶數");
			}
			
			else{
				System.out.println(number+"為奇數");
			}
		}
		else{
			System.out.println(number+"為負數");
			System.out.println(number+"沒有正負");
		}

	}

}
