package tw.leonchen.myproject.arrays;

public class TheEx42D {

	public static void main(String[] args) {
		int[][] data=new int[2][3];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		// 值從0開始且用length表達可避免邊界計算錯誤
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				System.out.printf("data[%d][%d]=%d\n",i,j,data[i][j]);	
			}
			
		}

	}

}
