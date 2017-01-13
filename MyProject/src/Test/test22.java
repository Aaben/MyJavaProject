package Test;
class parent{
	private String name = "Dada";
	@SuppressWarnings("unused")
	private int age =18;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
		
	}
}


class child extends parent{
	public void playgame(){
		System.out.println("\nplay Minecraft.");
	}
}


public class test22 {

	public static void main(String[] args) {
        @SuppressWarnings("unused")
		child gi =new child();
//        gi.name="duck";
//        gi.sayhello();
        
        


	}

}
