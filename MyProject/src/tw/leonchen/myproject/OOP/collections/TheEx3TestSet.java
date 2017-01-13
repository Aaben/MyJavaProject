package tw.leonchen.myproject.OOP.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TheEx3TestSet {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Random r = new Random(); // 物件可以直接NEW更快  Math.random為方法
		while (set1.size() < 6) {
			int sum = r.nextInt(42) + 1; //nextInt 無條件捨小數
			set1.add(sum);
		}
		
		System.out.println("set1=" +set1);
		
		TreeSet set2 = new TreeSet(set1);   //TreeSet自動排序
		System.out.println("set2=" + set2);
		
		//進階
		TreeSet set3 = new TreeSet(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1; //o1-o2則為由小到大 此為進階寫法
			}
			
		});
		set3.addAll(set1);
		System.out.println("set3=" + set3);

	}

}
