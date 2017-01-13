package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testio {

	public static void main(String[] args) throws IOException {
		File fil1=new File("C:/temp/test/ttest.txt");
		FileInputStream fis1 = new FileInputStream(fil1);
		FileOutputStream fos1= new FileOutputStream(new File("c:/temp/test/ttest2.txt"));
		
        int data;
		while((data=fis1.read())!=-1){
			
			System.out.print((char)data+" ");
			fos1.write(data);
		}
		fos1.close();
		fis1.close();
		
		
//		if(fil1.exists()){
//			System.out.println("File Name:"+fil1.getName());
//			System.out.println("File Size:"+fil1.length()+"bytes");
//			System.out.println("File Parent:"+fil1.getParent());
//			System.out.println("File Path:"+fil1.getPath());
		
			
		}

	}


