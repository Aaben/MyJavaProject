package tw.leonchen.myproject.OOP.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TheEx5TestIterator {

	

	@SuppressWarnings({ })
	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("pineapple");
		fruit.add("lichi");
		fruit.add("jackfruit");
		
		Iterator<String> iterator2 = fruit.iterator();
		while(iterator2.hasNext()){
			
			System.out.println("Fruit:" + iterator2.next());
		}
		
		for(String name : fruit){ //忘了加泛型就會出錯
			
			System.out.println("name:" + name);
		}
	

	}

}
