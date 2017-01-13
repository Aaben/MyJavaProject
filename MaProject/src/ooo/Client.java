package ooo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {


	public static void main(String[] args) throws Exception {
		System.out.print("Client start.");
		Socket socket = new Socket("localhost",29527);
		
//		OutputStream out = socket.getOutputStream();
//		out.write(65);
//		out.close();

//      BufferWriter out = new BufferWriter(
//                               new BifferOutputStream(socket.getOutputStream()));
//       out.write(there is a demo.);
//		 out.newLine();  這兩行為Windows的換行
//       out.flush();
		
/*
 * 換行符號有兩種，Cr(carriage return)、Lf(line feed)Ascii code分別是13(0d)跟10(0a)
   Cr是將指標移到最前頭（回車）
   Lf是跳到下一行的位置，但沒有跳到開頭的效果 合在一起就是把指標移到下一行的最前面
      類似我們按Enter的效果
     不巧的是，三大作業系統的換行符號定義都不一樣
   Mac只有Cr
   Linux/Unix只有Lf
   Windows則是CrLf，兩者皆有
      意思是Linux只需要Lf一個字元就可以有換行加移到前面的效果但是Windows就需要兩個
 */
		
		
/*
 * 跟Serve 互傳		
 */
		PrintStream out = new PrintStream(socket.getOutputStream(),true);		
		BufferedReader in = new BufferedReader(
				                new InputStreamReader(socket.getInputStream()));
		
		out.println("there is a code");   // 1
		
		String data = in.readLine();      // 4
		System.out.println("data="+data);
		
		out.close();
		in.close();
		socket.close();
		
		

	}

}
