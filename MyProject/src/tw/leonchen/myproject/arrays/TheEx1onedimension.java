package tw.leonchen.myproject.arrays;

public class TheEx1onedimension {
	
	public void onedimen(){
		int [] data=new int [3];
		data[0]=1;
		data[1]=2;
		//data[2]=3; 若沒有則會直接給初始預設值,整數為0
		System.out.println("data[0]="+data[0]);
		System.out.println("data[1]="+data[1]);
		System.out.println("data[2]="+data[2]);
	}

	public static void main(String[] args) {
		TheEx1onedimension arrays =new TheEx1onedimension();
		arrays.onedimen();
		

	}

}
