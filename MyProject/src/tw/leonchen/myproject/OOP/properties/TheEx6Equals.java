package tw.leonchen.myproject.OOP.properties;
class clothes{
	String size = "L";
	int price = 1000;
}

public class TheEx6Equals {

	public static void main(String[] args) {
		clothes myShirt = new clothes();
		clothes yourShirt = new clothes();
		System.out.println("myShirt=" + myShirt);
		System.out.println("yourShirt=" + yourShirt);
		
		System.out.println("(myShirt==yourShirt)=" + (myShirt==yourShirt));
		System.out.println("myShirt.equals(yourShirt)=" + myShirt.equals(yourShirt));
		
		yourShirt=myShirt;
		
		System.out.println("myShirt_1=" + myShirt);
		System.out.println("yourShirt_1=" + yourShirt);
		
		System.out.println("(myShirt==yourShirt)_1=" + (myShirt==yourShirt));
		System.out.println("myShirt.equals(yourShirt)_1=" + myShirt.equals(yourShirt));
	}
		
		

	}


