package tw.leonchen.myproject.OOP.collections.generics;

/*class TestInteger {
	private Integer i1;

	public Integer getInteger() {
		return i1;
	}

	public void setInteger(Integer i1) {
		this.i1 = i1;
	}
  }
*/

/*class TestDouble {
 	private Double d1;

	public Double getDouble() {
		return d1;
	}

	public void setDouble(Double d1) {
		this.d1 = d1;
	}
  }
*/

/*class TestObject {
	private Object o1;

	public Object getObject() {
		return o1;
	}

	public void setObject(Object o1) {
		this.o1 = o1;
	}
 }
*/
//                   以下寫法總括上面


class TestGenerics<T>{ //<T> 沒特別設定就是Object 
	private T t1;      //t1為變數

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
	
}



public class TheEx1CallTestGenerics {
	

	public static void main(String[] args) {
		TestGenerics <Integer> test3 = new TestGenerics<Integer>();
		                                                //7.0UP可不寫
		test3.setT1(12);		
		System.out.println(test3.getT1()+1);
		
		TestGenerics <Double> test4 = new TestGenerics<Double>();
		              //大寫
		test4.setT1(3.6);		
		System.out.println(test4.getT1()+1);
		
		

	}

}
//TestInteger test1 = new TestInteger();
//test1.setInteger(6);
//int value1 = test1.getInteger();
//System.out.println("value1+1=" + (value1+1));
//
//TestDouble test2 = new TestDouble();
//test2.setDouble(6.0);
//double r = test2.getDouble();
//System.out.println("area=" + (3.14*r*r));
//
//TestObject obj1 = new TestObject();
//obj1.setObject(12);
////double value2 = (Double)obj1.getObject(); //ClassCastException 強制轉型失敗
//int value2 = (Integer)obj1.getObject();     // 如果不用泛型 元素原始型態不一樣就會有問題
//System.out.println("value2+2=" + (value2+2));