package tw.leonchen.myproject.OOP.properties;

class insect{
	
	public void  exercise(){
		System.out.println("go slow.");
	}
	
}

class ant extends insect{
	@Override  //標註 若打錯子類別會警示 
	public void exercise(){
		//overriding後就只會乎叫子類別
		System.out.println("go as fast as car.");
	}
	
//  1.以下因為 exercise()跟exercise(int speed)判別為不同函數
//                                         所以overload
// 前面沒寫等於有寫
//	______________________________________
//	    public void  exercise(){        
//	 	  System.out.println("go slow.");
//	____}_________________________________               
//	
//	public void exercise(int speed){       
//	System.out.println("speed:" + speed);
//  }


	
//  2.supercalass為void exercise()且subclass為同一函數卻回傳INT
//                              所以compile error
//public int execise(){  
//	return 0;
//}
	
}

public class TheEx5Overriding {

	public static void main(String[] args) {
		
		ant sub =new ant();
		sub.exercise();

	}

}
