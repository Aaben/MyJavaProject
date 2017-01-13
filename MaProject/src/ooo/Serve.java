package ooo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {

	public static void main(String[] args) throws Exception {
		System.out.print("Serve start.\n");
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(29527);
		Socket socket = serverSocket.accept();

		// InputStream in = socket.getInputStream();  練習數字傳送
		// int data = in.read();
		// System.out.println("data="+data);
        // in.close();
         
		//以下兩個順序沒差
		PrintStream out = new PrintStream(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader( // 接client 1
				new InputStreamReader(socket.getInputStream()));

		String data = in.readLine(); // 2 讀in進來的資料換成String
		System.out.println("data=" + data);

		out.println("from:there is a code");// 3

		out.close();
		in.close();
		socket.close();

	}

}
