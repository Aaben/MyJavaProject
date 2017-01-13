package ooo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOpractise1207 {

	public static void main(String[] args) throws Exception{
//		//小檔案
//		File file = new File("C:/Users/Student/Desktop/cat.jpg"); //路徑雙引號易忘
//		long size = file.length();  //計算檔案長度 回傳一數值 怕爆掉用long接
//		byte [] buffer  = new byte[(int)size];//建立Byte陣列等同於size大小 但要強制轉INT  
//		FileInputStream fis = new FileInputStream(file);
//		int length=fis.read(buffer);  //把file的東西讀進buffer陣列
//		fis.close();
//		System.out.println(size+":"+length);
		
		
		//大檔案
		byte [] buffer = new byte[4*1024];
		FileInputStream  fis = new FileInputStream("C:/Users/Student/Desktop/cat.jpg");
      FileOutputStream fos = new FileOutputStream("C:/Users/Student/Desktop/cat2.jpg");
                                                             // 注意路徑別重覆
        int length = fis.read(buffer);  // 第一行把資料輸入陣列裡
        while(length!=-1){
        	System.out.println("length="+length);
        	fos.write(buffer,0,length); // 寫入陣列 ,起始位置,對應字元??
        	length = fis.read(buffer);
        	
        }
        fis.close();
        fos.close();
		
		
		
//		int data = System.in.read();
//		while(data!=-1){
//			System.out.println("data="+data); // 換行的兩個指令
//			data =System.in.read();
//		}
//   
		
		
//		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine(); //自動換行對所有系統都是
//		while(line!=null){
//			System.out.println("line="+line);
//			line = br.readLine();
//		}
//		br.close();
        
	}

}
