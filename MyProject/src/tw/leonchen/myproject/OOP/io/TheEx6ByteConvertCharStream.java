package tw.leonchen.myproject.OOP.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TheEx6ByteConvertCharStream {

	public static void main(String[] args) throws IOException {
//		InputStream is1=System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader br1 = new BufferedReader(isr1);
		
		System.out.println("Please Input Your Name:(use Q or q to exit)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1 = 
				new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/secret.txt")));
		
		String data;
		while((data=br1.readLine())!=null){
			if(data.equalsIgnoreCase("q")){ //不論大小寫等於字串
				bw1.flush();
				bw1.close();
				br1.close(); //close 要再 exit之前 
				System.out.println("See You Next Time.");
				System.exit(-1);//要寫入Q後 才會結束程式並儲存
			}
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
		}		
			
		
		
	}

}
