package tw.leonchen.myproject.OOP.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TheEx5TestMap {

	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map1 =new HashMap();
/*這設Map(interface)  \Hashtable()則不能有null 
 *可讓後面改寫(多型)   \TreeMap() 不能有null且會排序不重覆
 */
		             
		map1.put("1st", "James");
		map1.put("2nd", "John");
		map1.put("3rd", "Jones");
		map1.put("3rd", "Mike");
		map1.put(null, null);
		
		
		Set keys = map1.keySet();
		Set mapping = map1.entrySet(); // 取得key value關係
		Collection values = map1.values();
		
		System.out.println("keys="+keys);
		System.out.println("mapping="+mapping);
		System.out.println("values="+values);
		
	}

}
