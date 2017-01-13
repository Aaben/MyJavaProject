package tw.leonchen.myproject.flowcontrol;

public class TheEx4Elseif {

	public static void main(String[] args) {
		int month=2,year=1900;
		if(month==1 ||month==3||month==5||month==7||month==8||
				month==10||month==12){
			System.out.println(month+" has 31 days.");
		}
		else if (month==4||month==6||month==9||month==11){
			System.out.println(month+" has 30 days.");
		}
		else if (month==2){//有問題!!不可被100整除
			if(year%400==0){
				System.out.println(month+" has 29 days.");
			}
			else if(year%4==0 && year%100!=0 ){
				System.out.println(month+" has 29 days.");
			}
			else{
				System.out.println(month+" has 28 days.");
				}
//          以上可濃縮成
//			if(((year%4==0) && (year%100!=0)) || (year%400==0)){
//				System.out.println(month + " has 29 days.");
//			}else{
//				System.out.println(month + " has 28 days.");
			
			
		}
		else{
			System.out.print("are you a retard?");
		}
			

	}

}
