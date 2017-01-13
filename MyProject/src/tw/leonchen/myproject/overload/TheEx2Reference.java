package tw.leonchen.myproject.overload;
class Shirt{
	int price = 2000;
	char size ='L';
}

public class TheEx2Reference {

	public static void main(String[] args) {
		Shirt myShirt=new Shirt();
		myShirt.price=3000;
		myShirt.size='L';
		System.out.println("myprice="+myShirt.price);
		System.out.println("mypsize="+myShirt.size);
		System.out.println("mypsize="+myShirt+"\n");
		
		Shirt yourShirt=new Shirt();
		yourShirt.price=5000;
		yourShirt.size='M';
		System.out.println("yourprice="+yourShirt.price);
		System.out.println("yourpsize="+yourShirt.size);
		System.out.println("mypsize="+yourShirt);
		
		yourShirt=myShirt;
		///設定共用後互相影響
		System.out.println("\nset yourShirt = myShirt\n");
		yourShirt.price=8000;
		yourShirt.size='X';
		System.out.println("mypsize="+myShirt);
		System.out.println("mypsize="+yourShirt);
		System.out.println("myprice="+myShirt.price);
		System.out.println("mypsize="+myShirt.size);
		

	}

}
