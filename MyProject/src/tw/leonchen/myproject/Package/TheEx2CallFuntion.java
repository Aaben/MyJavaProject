package tw.leonchen.myproject.Package;


	import javax.swing.JButton;
	import javax.swing.JFrame;

	

	public class TheEx2CallFuntion {

		public static void main(String[] args) {
		
			
			JFrame f = new JFrame("title");
			f.add(new JButton("Press me"));
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(300, 250);
			f.setVisible(true);
		}
//JAVA輸出>project右鍵>export>Java>JAR(可跨平台)>存路徑檔名(jarzip)
//                                注意doc source.code
//測試Java命令列下( java -cp "c:/temp/Myproject.jar" tw.leonchen.myproject.Package.TheEx2CallFuntion)
//                     ^    ^             		   ^     packagename             .classname
//可去環境變數設定就可不用打-cp "c:/temp/Myproject.jar" 但要注意路徑前要加.;
	}