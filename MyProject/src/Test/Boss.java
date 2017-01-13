package Test;
/*interface 優點
 * "過共同的介面耦合不同實作，而不需要去管實作細節，達到低耦合高內聚。"
 * 
 * 
 * 
 *
 */

interface Java {
	public String coding();
}

interface Python {
	public String coding();
}

 class You implements Java, Python {
	@Override
	public  String coding() {
		System.out.println("要不然你來做啊"); // 這裡是OS
		boolean deadLineIsComing = true;
		String report = deadLineIsComing ? "快好了" : "快好了";
		return report; // 給老闆的話
	}
}

public class Boss {
	public static void main(String[] args) {
		Java javaSkillGuy = new You(); // interface不可new 但可
		Python javaSkillGuy2 = new You();
		Boss boss = new Boss();
		boss.cryNorth(javaSkillGuy);
		boss.cryNorth(javaSkillGuy2);
		
	}

	public void cryNorth(Java freshLiver) {
            String report = freshLiver.coding();
            System.out.println(report);
            
	}
	public void cryNorth(Python freshLiver) {
        String report = freshLiver.coding();
        System.out.println(report);
        
}

}
