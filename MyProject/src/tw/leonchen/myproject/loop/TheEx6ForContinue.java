package tw.leonchen.myproject.loop;

public class TheEx6ForContinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			
			if(i==5){
				System.out.println("Time's up");
				continue;//while loop can't use  
			}
			System.out.println(i);
		}

	}

}
