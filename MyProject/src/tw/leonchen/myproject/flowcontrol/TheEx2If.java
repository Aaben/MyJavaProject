package tw.leonchen.myproject.flowcontrol;

public class TheEx2If {

	public static void main(String[] args) {
		int yournumber=6;
		int dicenumber= (int)(Math.random()*6)+1;
		if (yournumber==dicenumber){
			System.out.println("Congraduation!!");
		}
		
		else{
			System.out.println("Suck my dick!!");
		}
		
		System.out.println("dicenumber="+dicenumber);

	}

}
