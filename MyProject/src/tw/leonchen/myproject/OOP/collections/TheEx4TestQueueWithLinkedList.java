package tw.leonchen.myproject.OOP.collections;

import java.util.LinkedList;

public class TheEx4TestQueueWithLinkedList {
	
	@SuppressWarnings("rawtypes")
	private  LinkedList list1;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void processQueueStore(){
		list1 = new LinkedList();
		list1.offer(11);
		list1.offer("thunder");
		list1.offer("rainbow");
		list1.offer("sunshine");
		list1.offerFirst("dark");
		list1.offerLast("cloudy");
		
	}
	
	public void processQueueRetrieve(){
		while(list1.peek()!=null){ //peek 為查list第一個為何
			
//			String info =(String)list1.poll(); 存進去就變元素了 再拿出來就是一個物件
//			System.out.println("info:" + info); 強制轉型中若有別的型別就會錯誤 
			
			System.out.println("info:"+list1.poll());
			
		}
		
	}

	public static void main(String[] args) {
		
		TheEx4TestQueueWithLinkedList queue =new TheEx4TestQueueWithLinkedList();
		queue.processQueueStore();
		queue.processQueueRetrieve();
		
		

	}

}
