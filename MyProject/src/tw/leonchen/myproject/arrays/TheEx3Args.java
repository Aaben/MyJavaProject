package tw.leonchen.myproject.arrays;

public class TheEx3Args {

	public static void main(String[] args) {
		//外部引入資料OR密技(以後直接打指令)
		//xxx.java右鍵>properties>Run/Debug Settings>
		//點XXX名稱>Edit>Arguments tab>Program Arguments內輸入資料
		//(以空格隔開)
		for (int i=0;i<args.length;i++ ){
			System.out.println("args["+i+"]="+args[i]);
			                                      
		}
		System.out.println("finished");
		

	}

}
