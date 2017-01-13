package tw.leonchen.myproject.loop;

public class TheEx4Lab9X9 {

	public static void main(String[] args) {
		int j =1;
		while (j<=9){
			int i = 1;
			while (i <= 9) {
				// 位數對齊可利用If判斷也有進階用法參change
				if(i*j<10){	
				System.out.print(j+"x"+ i + "=" +" "+(i*j)+"\t");
				}
				else{
					System.out.print(j+"x"+ i + "="+(i*j)+"\t");
					
				}
				i++;
			}
			j++;
			System.out.println();

		}
	}
}
