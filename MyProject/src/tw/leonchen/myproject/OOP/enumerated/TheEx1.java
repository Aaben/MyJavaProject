package tw.leonchen.myproject.OOP.enumerated;

enum PokerGame {

	spade, diamond, heart, club
}

public class TheEx1 {

	public static void main(String[] args) {
		PokerGame suit = PokerGame.club;
		                 //enum 是static物件可直接乎叫

		switch (suit) {
		case spade:
			System.out.println(PokerGame.spade);
			break;
		case heart:
			System.out.println(PokerGame.heart);
			break;
		case diamond:
			System.out.println(PokerGame.diamond);
			break;
		case club:
			System.out.println(PokerGame.club);
			break;
		default:
			assert false : "Never run here.";
			break;

		}

	}
}
