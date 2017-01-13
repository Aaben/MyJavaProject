package tw.leonchen.myproject.OOP.collections.generics;

import java.util.Enumeration;
import java.util.Properties;

/*
 * 印出電腦環境變數
 */
public class TheEx4TestEnumerationWithSystem {

	public static void main(String[] args) {
		Properties p1 = System.getProperties();// 抓出系統物件
		// 大寫
		Enumeration<?> e1 = p1.propertyNames();
		           //泛型不定
		while (e1.hasMoreElements()) {
			String key = (String) e1.nextElement();//判斷是否有物件並取得該物件
			String value = p1.getProperty(key);
			System.out.println(key + ":" + value);
		}

	}

}
