package tw.leonchen.myproject.exception;

public class TheEx1TryCatch {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6 };
		try{
		for(int i=0;i<=6;i++){
			System.out.println("data[" + i + "]=" + data[i]);
		 }
		}
		catch(ArrayIndexOutOfBoundsException e){
			 //用別的仍然有紅字
			 
			//手機或email通知你 讓廠商看不出錯誤自己卻知道 
			System.out.println("finished");
			
		}
		
	}

}
