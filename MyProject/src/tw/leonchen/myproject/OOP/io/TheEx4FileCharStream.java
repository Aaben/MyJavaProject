package tw.leonchen.myproject.OOP.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TheEx4FileCharStream {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("c:/temp/test/source.txt");
		FileWriter fw1 = new FileWriter("c:/temp/test/dest.txt");
		int data;
//		@SuppressWarnings("unused")
//		char[] cbuf = new char[256];
		while ((data = fr1.read()) != -1) { //read()回傳定為byte
			System.out.print((char) data + "");
			fw1.write(data);
			
		}

		fw1.close();
		fr1.close();
	}

}
