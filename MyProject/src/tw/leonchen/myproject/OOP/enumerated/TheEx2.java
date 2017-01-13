package tw.leonchen.myproject.OOP.enumerated;

public class TheEx2 {

	public static void main(String[] args) {
		PokerGame [] suit = PokerGame.values();
		;
		 for(PokerGame value:suit){
			 System.out.println(value+":"+value.ordinal());
		 }

	}

}
