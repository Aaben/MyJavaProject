package tw.leonchen.myproject.OOP;

public class TheEx6Method2 {
	               //()易漏
	public boolean battle(){
		//宣告變數須在方法下不是分類
		int yourdicenumber = 6;
		int caldicenumber =(int)(Math.random()*6+1);
		
		System.out.println("caldicenumber="+caldicenumber);
		if(yourdicenumber==caldicenumber){
			return true;
		}
		//節省行數不需再加Else因為Return底下就不運算
		return false;	
	}

	public static void main(String[] args) {
		TheEx6Method2 play = new TheEx6Method2();
		                    //call title
		boolean result=play.battle();
		
		System.out.println("result="+result);
		
		
		
		

	}

}
