package tw.leonchen.myproject.flowcontrol;

public class TheEx5Switch {

	public static void main(String[] args) {
		int meal=0;
		switch(meal){
		case 1:
			System.out.println("hamburger");
			break;
		//沒有break會一直持續跑
		case 2:
			System.out.println("salad");
			break;
		case 3:
			System.out.println("cola");
			break;
		case 4:
			System.out.println("steak");
			break;
		default :
			System.out.println("water");
		}

	}

}
