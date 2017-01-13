package ooo;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TryCatchClient {
	/*
	 * trycatch 第一步驟 : 全包 或 單獨包 Exception 全包前面死掉後面步驟就不執行 
	 *          第二 : 是否包含.close系列 不包的話才能正確執行關閉 
	 *          第三 : .close 用finally包住 (不管Exception與否一定要執行的code) 
	 *          第四 : 需要在外宣告close的變數名 
	 *          第五 : 補上變數名的初始值 (給空值) 
	 *          第六 : 對.close單獨包Exception 確保正確關閉 
	 *          第七 : 加上IF( 變數名 !=null ) 排除NullPointerException (對空值操作)
	 */
	public static void main(String[] args) {
		Socket socket = null;  // local 變數一定要初始化 (方法內)
		PrintStream out = null;
		BufferedReader in = null;
		try {
			System.out.print("Client start.");
			socket = new Socket("localhost", 29527);

			out = new PrintStream(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			Console console = System.console();

			String keyboardInput = console.readLine();
			while (keyboardInput != null) {
				out.println(keyboardInput);
				String data = in.readLine();
				System.out.println(data);
				keyboardInput = console.readLine();

			}

			String data = in.readLine();
			System.out.println("data=" + data);
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
