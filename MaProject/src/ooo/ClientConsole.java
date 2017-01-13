package ooo;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientConsole {

	public static void main(String[] args) throws Exception {
		System.out.print("Client start.");
		Socket socket = new Socket("localhost",29527);
		                      // 127.0.0.1 = "localhost"
		

		PrintStream out = new PrintStream(socket.getOutputStream(),true);		
		BufferedReader in = new BufferedReader(
				                new InputStreamReader(socket.getInputStream()));
		
		 
		Console console = System.console(); // console沒建構子 在System底下
		                                    // Eclipse 無法執行只能由CMD執行
		                                    // cd 到bin 輸入 java ooo.ClientConsole
		
		String keyboardInput = console.readLine();// 1  輸出第一次
		while(keyboardInput!=null){ // 輸入為 Ctrl+z(=null) 就會停止迴圈
			out.println(keyboardInput);
			String data = in.readLine();
			System.out.println(data);
			keyboardInput = console.readLine();// 1  輸出第二次以後
			
		}
		
		
		String data = in.readLine();      
		System.out.println("data="+data);
		
		out.close();
		in.close();
		socket.close();
		
	

	}

}
