package tw.leonchen.myproject.OOP.nestedclass;
/*type1 宣告在class內 可存取外部類別所有member(class b)
 *內部可直接乎叫  
 *外部呼叫其他inner class有特殊寫法  
 */
class a{
	private String name = "judy";
	
	class b{
		public void sayhello(){
			System.out.println("hello," + name);
		}
		
	}
	
	public void innercall(){
		b b1=new b();
		b1.sayhello();
	}
}

public class TheEx1type1 {

	public static void main(String[] args) {
		a a1=new a();          //先建立a呼叫a方法
		a1.innercall();         
		a.b ab= a1.new b(); /*由a乎叫b 
		                        *重要寫法特別且不會提示
		                        *
		                        * 通常不會乎叫別的內部class
		                        * 
		                        */
		ab.sayhello();
		

	}

}
