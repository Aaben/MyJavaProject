package tw.leonchen.myproject.OOP.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TheEx2FileStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("C:/temp/test/hello.txt");
		FileOutputStream fos1 = new FileOutputStream("C:/temp/test/hello_copy.txt");
		
		
		
		int data; // 因為傳輸為byte 處理為char 不設data會亂碼
		          // 要括號因為=有兩個 先處理
		while ((data =fis1.read())!=-1){ // 因為資料儲存不會有負數所以read()以-1當end
			System.out.print(fis1.read());
			System.out.print((char)data+"");//byte照順序讀取後轉字元才會一樣
			
			fos1.write(data);
			
		}
		fos1.close();
        fis1.close(); // 因為是迴圈不關閉會一直跑
	}

}
