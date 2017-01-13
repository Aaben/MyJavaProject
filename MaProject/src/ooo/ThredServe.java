package ooo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/*利用thred來讓多人同時連進伺服器
 * 
 */

public class ThredServe implements Runnable {

	private Socket socket;
	public ThredServe(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		// 1.7後新版Try寫法
		try(PrintStream out = new PrintStream(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
			String data = in.readLine(); //2
			while (data != null) {
				System.out.println(data+":"+socket);
				out.println(data + ":" + socket); //3

				data = in.readLine(); //2
			}
			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}	
		}
	}

	

}
