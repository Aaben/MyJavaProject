package tw.leonchen.myproject.arrays;

public class TheEx5NumberSort {
	int data[]={5,12,7,35,2};// 易忘記
	int i=0;
	public void numbersort1(){//bubble sort
//		for(int i=0;i<data.length-1;i++){
//			for (int j = i + 1; j < data.length; j++) {
//				int temp = 0;
//				if (data[i] < data[j]) {
//					temp = data[i];
//					data[i] = data[j];
//					data[j] = temp;
//				}
//	     }
//	  }
		for (int i=0;i<data.length;i++){
			int temp=0;
			if (data[i]<data[i+1]){
				temp=data[i];
				data[i] = data[i+1];
				data[i+1] = temp;
			
			}
		}
		
	}
	
public void numbersort2(){//bidirectional bubble sort
	while(true){
		//無窮迴圈第幾次停不知道 所以用while(true)
		//利用count來判斷
		int count=0;
		           //因為最後一個沒人可比所以扣一
			for (int i = 0; i < data.length - 1; i++) {
				int temp = 0;
				if (data[i] < data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
	
	}
}




	public void print(){
		for(int k=0;k<data.length;k++){
			System.out.println("data["+k+"]="+data[k]);
		
		}
		
	}
		

	public static void main(String[] args) {
		TheEx5NumberSort sort1=new TheEx5NumberSort();
		sort1.numbersort2();
		sort1.print();
		
		

	}

}
