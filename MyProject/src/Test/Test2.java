package Test;

public class Test2 {
	
	 public int id; 
		        

		 
	public static void change(Test2 x){
		// x.id=102; s1.id印出來結果為102
		x=new Test2();
		x.id=102;
		System.out.println(x);
		         }
		

	public static void main(String[] args) {
		Test2 s1=new Test2();
//		s1 本身不是一個 Test2 的 Object, 它是
//		Test2 的 Pointer, 它只是指向一個 Test2 的
//		Object 而已。
		         s1.id=101;
		         System.out.println(s1);
		         change(s1);
//		     change(s1) 的確是 pass-by-value。可是要記著，傳進
//		     change() 的，不是一個 Student 的 Object，而是一個
//		     Test2 的 pointer，所以，被拷貝了一份的，是 pointer
//		           而非 Test2 的 object.
		         System.out.println(s1.id);
		

	}

}
