package tw.leonchen.myproject.flowcontrol;

public class TheEx3Nestedif {

	public static void main(String[] args) {
		int level= (int)(Math.random()*99)+1;
		
		if(level>1){
			System.out.println("You got a stick!!");
			if(level>5){
				System.out.println("You got a knighf");
			}
		}
		System.out.println(level);

	}
	

}
