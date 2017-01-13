package tw.leonchen.myproject.OOP.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TheEx5BufferedCharStreamIO {

	public static void main(String[] args)throws IOException {
	BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/source.txt"));
	BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/test/source_copy.txt"));
	//易拼錯
	String data;
	                //讀一行 回傳String
	while((data=br1.readLine())!=null){
		System.out.println(data);
		bw1.write(data);
		bw1.flush();// 必免資料寫入不全 因為buffer有時保留在暫存記憶體沒存在目的地 
                    // 也可寫在while外面  
		bw1.newLine();//換行
	}
	
	bw1.close();
    br1.close();
	}

}
