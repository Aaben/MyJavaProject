package tw.leonchen.myproject.OOP.collections;

import java.util.HashSet;

public class TheEx1HashSet {

	

	@SuppressWarnings({  "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set1 =new HashSet();
		set1.add("mary");
		set1.add("john");
		set1.add("john");
		set1.add(new Integer(6));
		set1.add(6);
		set1.add(new Double(3.14)); //元素任何型態皆可 但不重覆 後覆蓋前

		System.out.println("set1=" + set1);

	}

}
