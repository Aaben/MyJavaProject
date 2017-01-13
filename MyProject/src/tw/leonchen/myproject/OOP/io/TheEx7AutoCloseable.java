package tw.leonchen.myproject.OOP.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CallCloseableEx1 implements AutoCloseable { //可以直接TRY CATCH 這為老師講解
	public void processResource() {
		System.out.println("Resource Used.");
	}

	@Override 
	public void close() throws Exception {
		System.out.println("Resource Closed.");
	}
}

public class TheEx7AutoCloseable { //抽象不能實作

	public static void main(String[] args) {
		try (CallCloseableEx1 test1 = new CallCloseableEx1()) {
			test1.processResource();
		} catch (Exception e) {
			System.out.println("error message.");

		}

		// 進階前例改寫
		try (FileInputStream fis1 = new FileInputStream("c:/temp/test/source.txt")) {
			int data;
			while ((data = fis1.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
