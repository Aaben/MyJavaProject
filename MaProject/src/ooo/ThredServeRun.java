package ooo;

import java.net.ServerSocket;
import java.net.Socket;

public class ThredServeRun {

	public static void main(String[] args) throws Exception {
		System.out.println("Server for all");
		
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(29527);
		while(true){
			Socket socket = serverSocket.accept();
			Runnable runnable = new ThredServe(socket);
			Thread thread = new Thread(runnable);
			thread.start();
			
		}

	}

}
