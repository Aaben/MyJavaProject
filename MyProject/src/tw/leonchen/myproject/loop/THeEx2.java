package tw.leonchen.myproject.loop;

public class THeEx2 {

	public static void main(String[] args) {
		int i=1,sum=0;
		while(i<=10){
			System.out.println("i="+i+" "+"sum="+(sum+i));
			sum+=i;
			//sum=sum+i
			i++;
		}
		
		

	}

}
