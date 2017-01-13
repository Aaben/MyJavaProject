package tw.leonchen.myproject.OOP.collections.generics;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class TheEx3TestDataRecordWithGenerics {
	/*以下只有一筆資料
	 * 
	 */
	Hashtable<String, String> data = new Hashtable<String, String>();
	
	public void  record(String name, String address, String phone){
		data.put("name", name);
		data.put("adress", address);
		data.put("phone", phone);
	}
	
	public void print(){
		Set<Entry<String, String>> result = data.entrySet();
		// 手動加入不用打
		System.out.println("result="+result);
	}
	
	public void retrieve(){
		System.out.println("name="+data.get("name"));
		System.out.println("adress="+data.get("adress"));
		System.out.println("phone="+data.get("phone"));  
		
	}

	public static void main(String[] args) {
		TheEx3TestDataRecordWithGenerics test1=new TheEx3TestDataRecordWithGenerics();
		test1.record("suck"," my"," 2");
		test1.print();
		test1.retrieve();

	}

}
