package tw.leonchen.myproject.OOP;

public class TheEx8Hw3 {
	public static long fib(int n){
		if (n-1==0){
			return 0;
		}
		else if (n-1==1){
			return 1;
		}
		//以上可合成*** 注意項數從1開始 所以須由n-1來判斷 非n
		//if (n-1==0||n-1==1){
		//     return n;}
		else{
			return fib(n-1)+fib(n-2);
		}
		//遞迴自己呼叫自己
		//步驟假設n=4 f(4)=f(3)+f(2)  first
		//               =[f(2)+f(1)]+[f(1)+f(0)] second
		//               =     + 1       1 +  0
		// 全部拆成1計算所以越後越慢
	}

	public static void main(String[] args) {
		for(int i=1;i<=48;i++){
			System.out.printf("\nfib n=%d fib("+i+")=%d\n",i,fib(i));
		}
		

	}

}
