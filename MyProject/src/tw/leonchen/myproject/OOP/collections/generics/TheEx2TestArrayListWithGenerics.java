package tw.leonchen.myproject.OOP.collections.generics;

import java.util.ArrayList;

public class TheEx2TestArrayListWithGenerics {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("larry");
		list1.add("michelle");
		list1.add("jackson");
		list1.add("kimi");
		list1.add("rockman");
		
		for(int i=0;i<list1.size();i++){
			                //易忘
			System.out.printf("list1.get(%d)=%s\n",i,list1.get(i));
			
			
		}

	}

}
