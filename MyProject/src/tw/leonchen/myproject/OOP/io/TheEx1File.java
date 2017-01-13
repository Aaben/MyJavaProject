package tw.leonchen.myproject.OOP.io;

import java.io.File;

public class TheEx1File {

	public static void main(String[] args) {
		/*                       注意斜線
		 */
		File file1 = new File("c:/temp/test"); //設定檔案位置有沒有不知道
		boolean isExist = file1.exists();//存在與否
		System.out.println(isExist);
		if (file1.exists()) {
			String[] fileNames = file1.list(); // list() 取檔名回傳一維陣列
			
                           // 為指定陣列名稱 長度不用加()
			for (int i = 0; i < fileNames.length; i++) {
				@SuppressWarnings("unused")
				File file2= new File(file1,fileNames[i]);// (路徑,檔名)
				System.out.println("fileName:" + fileNames[i]);
//				file2.delete();  刪目錄裡檔案
			}
//			file1.delete();      刪目錄(裡面全空才可刪)
		}
		

		// if(isExist){
		// file1.delete();  小心delete
		// }                  

	}

}
