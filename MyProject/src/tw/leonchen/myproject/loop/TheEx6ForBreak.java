package tw.leonchen.myproject.loop;

public class TheEx6ForBreak {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			
			if(i==5){
				System.out.print("stop");
				break;//while loop can use break 
			}
			System.out.println(i);
		}

	}

}
