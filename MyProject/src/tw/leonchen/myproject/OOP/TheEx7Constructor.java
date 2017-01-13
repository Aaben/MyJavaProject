package tw.leonchen.myproject.OOP;



public class TheEx7Constructor {
	        
	public TheEx7Constructor(String name){
		//建構子!!類別名稱要相同!!
		System.out.println("Hi."+name);
	}
	
	public void play(){
		System.out.println("play boy");
	}

	
	public static void main(String[] args) {
		TheEx7Constructor go =new TheEx7Constructor("Brooks");
		//成立物件同時就會建立建構子沒打就會用預設的
		//所以以前沒打也會執行
		//所以建構子的順序會在前
		go.play();
		System.out.println("eat shit!");
		
		//new TheEx7Constructor("Brooks"):anonymous object
		// call one time save memory but many time waste time
		//function is the same 
		new TheEx7Constructor("John").play();
//		int i=1;
//		i=i+1;
//		System.out.println("i=" + i);	
//		System.out.println("1+1=" + (1+1));
		
		}


	}


