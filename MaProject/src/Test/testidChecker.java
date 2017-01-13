package Test;

import xxx.idChecker;

public class testidChecker {

	public static void main(String[] args) {
	//type    name =	value
	idChecker test =new idChecker();
	
	//*type*** name    value
	boolean result = test.check("a127423995");//因為沒有Static 需要一變數(result)乎叫
	
	
    System.out.println("result="+result);

	}

}
