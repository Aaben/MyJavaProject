package xxx;

/*身分證檢查演算法 
 *ID= D0  D1  D2  D3  D4  D5  D6  D7  D8  D9
	  9^   8   7   6   5   4   3   2   1   
   D0為英文字母：
   A=10、B=11、C=12、D=13、E=14、F=15、G=16、H=17、I=34、J=18、
   K=19、L=20、M=21、N=22、O=35、P=23、Q=24、R=25、S=26、T=27、
   U=28、V=29、W=32、X=30、Y=31、Z=32 
   
 */

public class idChecker {

	
	private int convert(char x) {
		// int result =0;
		// switch(x){ if
		// case'A':
		// result=10
		// break; }
		//
		x = Character.toUpperCase(x);// 小寫改大寫
		switch (x) {
		// 不用加char因為前面已定義
		case 'A':
			// 字元單引號
			return 10; // 就是結束後面不能有東西如break
		
		case 'B':
			return 11;
			
		case 'C':
			return 12;
				
		case 'F':
			return 15;
		
		default:
			return 0;

		}

	}

	
	private boolean isLegalFormat(String id) {
		if (id == null) {
			return false;
		} 
		else if (id.length() != 10) {
			return false;
		}

		for (int i=1; i < 10;i++) {
//			char ch = id.charAt(i);
//			if (ch<48 || ch >57){    //用ASCII判斷
//				return false;
//				}
			
			char ch = id.charAt(i);
			// boolean result = Character.isDigit(ch);
			// if(result==false){
			// return false;
			// }
			if (!Character.isDigit(ch)){
				 // 避免寫出==false 條件成立才執行
			     // Determines if the specified character is a digit.
			return false;
			}

		}

		return true;// 最外面要回傳 避免無限迴圈
	}

	// 修飾字 回傳型別 名稱 參數
	public boolean check(String code) {
		if (!isLegalFormat(code)){ //同上避免 ==false
			return false;
		}
		
		
		
		char go = code.charAt(0);

		// 帶入字元
		int D0 = this.convert(go);//this 有無都可
		

		// String sub=code.substring(1,2);// sub 是字串
//		int D1 = Integer.parseInt(code.substring(1, 2));
//		int D2 = Integer.parseInt(code.substring(2, 3));
//		int D3 = Integer.parseInt(code.substring(3, 4));
//		int D4 = Integer.parseInt(code.substring(4, 5));
//		int D5 = Integer.parseInt(code.substring(5, 6));
//		int D6 = Integer.parseInt(code.substring(6, 7));
//		int D7 = Integer.parseInt(code.substring(7, 8));
//		int D8 = Integer.parseInt(code.substring(8, 9));
//		int D9 = Integer.parseInt(code.substring(9, 10));
         int [] ary=new int [10];// 因為從i=1開始
         
		 for (int i=1;i<ary.length;i++){
		  ary[i]= Integer.parseInt(code.substring(i,i+1));
		 }

		int X1 = D0 / 10; // D0的十位數
		int X2 = D0 % 10; // D0的個位數
		int Y = X1 + 9 * X2 + 8 * ary[1] + 7 * ary[2] + 6 * ary[3] + 5 * ary[4] + 4 * ary[5] + 3 * ary[6] + 2 * ary[7] + ary[8];
		int CheckCode = (10 - (Y % 10)) % 10;
		if (CheckCode == ary[9]) {
			return true; // 則身分證字號正確

		} 
		
		else {
			return false;
		} // 有回傳型別就要return)

	}

}
