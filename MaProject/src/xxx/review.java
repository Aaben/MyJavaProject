package xxx;
/*複習基本語法
  1.撰寫1個public類別(class)：請務必符合下列條件
     a.宣告1個屬性：public、屬性型別可以自行決定  
     b.宣告方法1  ：public、不接受參數、回傳型別與屬性型別相同，方法內部程式會將屬性值回傳
     c.宣告方法2  ：public、接受1個與屬性相同型別的參數、回傳void，方法內部程式會使用參數值設定屬性
     d.宣告建構子   ：public、接受1個與屬性相同型別的參數，建構子內部程式會使用參數值設定屬性
  2.撰寫1個測試用的、擁有main()方法的類別
     e.呼叫問題1建構子，產生1個問題1宣告的物件
     f.使用物件呼叫方法2，傳入參數設定屬性值
     g.使用物件呼叫方法1取得屬性值，將取得的屬性值印出
  3.寫出編譯與執行問題2程式的指令
    javac review.java >compile
    java  review      >run 
*/

/*宣告類別(class)
    [modifiers] class ClassName {

     宣告屬性(field)
	[modifiers] type(型別) name = value;

    宣告方法(method)
	[modifiers] type name([type1 val1, type2, val2, ...]) {
		//方法的程式邏輯
		return 變數名稱或是值;}

    宣告建構子(constructor)
	 [modifiers] ClassName([type1 val1, type2, val2, ...]) {
		//建構子的程式邏輯}
}
*/

class one {
	public String test = "test1";    //a

	public String test2() {          //b
		return test;
	}

	public void test3(String test) { //c
		this.test = test;
	}

	public one(String n) {           //d 在哪沒差建立物件時成立
		test = n;
	}
}

public class review {
	//source code file裡有public class時，檔案名稱必須跟public class的名稱一樣

	public static void main(String[] args) {
		one first = new one("GG");// 因為建構子有參數 所以需代入才會過
		System.out.println(first.test);
		first.test3("solution");
		System.out.println(first.test2());

	}

}
