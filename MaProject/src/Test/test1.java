package Test;


 class testv {
	  String test="test1";
	  
	  public String test2(){
		  return test;
	  }
	  
	  public void test3(String test3){
		 this.test=test3;
		  
	  }
	  public testv(String test1){
		  this.test=test1;
		  System.out.println(this.test);
	  }
 }


 public class test1 {


	public static void main(String[] args) {
		
		testv two =new testv("constructor");

		two.test3("answer1");
		
		System.out.println(two.test2());
		
		

	}

}
