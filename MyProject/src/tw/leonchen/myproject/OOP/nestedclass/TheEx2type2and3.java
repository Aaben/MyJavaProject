package tw.leonchen.myproject.OOP.nestedclass;
/*
  Static Nested Class 又稱 top-level class，
  或static inner class，但事實上它並不是 inner class，
  因為 outer class 和 static nested class 的 instance
  之間並不存在任何關係。
  可以想成 static nested class 只是多了一層 name-space。
 * 
 *type2 若變數不為Static則抓不到 可同static方法一樣直接乎叫
 *type3 local variable 只存在方法內 所以無法由外部class乎叫 
 * 
 * 
 */

class c {
	public static int grade = 100;
//	private String name = "judy"; 

	static class d {
		public void print() {// 忘記打方法 方法才可執行
			System.out.println(grade);
//			System.out.println(name); 無法辨識因為外部非static

		}
	}

}
class E{
	public void processLocalInner(){
		int series = 100;
		class F{
			public void execAction(){//容易忘記
				System.out.println("series:" + series);
			}
		}
		F f1 = new F();
		f1.execAction();
	}
}

public class TheEx2type2and3 {

	public static void main(String[] args) {
		c.d call = new c.d(); //透過c叫d 因為是static
		                      //所以當成方法可直接乎叫
		call.print();
		
		E call2 = new E();     // local方法裡 所以只能呼叫E
		call2.processLocalInner();
		

	}

}
