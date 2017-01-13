package ooo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeConsole {

	public static void main(String[] args) throws Exception {
		System.out.print("Serve start.\n");
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(29527);
		Socket socket = serverSocket.accept();

		PrintStream out = new PrintStream(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader( 
				new InputStreamReader(socket.getInputStream()));

		String data = in.readLine();  // 接資料1 第一次輸入
		while(data!=null){  //若client有while server也用while接 否則只接一個就關閉
			                //接到null就會停止迴圈
			System.out.println("data=" + data);
			out.println(data+":"+socket);
			data=in.readLine();       // 接資料1 第二次以後的輸入
			                          // 不加此行想一次????
		}
		

		

		out.close();
		in.close();
		socket.close();

	}

}
