package tw.leonchen.myproject.loop;

public class TheEx7Label {

	public static void main(String[] args) {
		test:
			for(int i=1;i<=3;i++){
				for(int j=1;j<=5;j++){
					if(i==2 && j==3){
						//break test;
						continue test;
						//跳出往外找最接近Label的迴圈執行
					}
					System.out.printf("i=%d j=%d\n",i,j);
					
				}
				
			}
	System.out.println("finished");

	}

}
