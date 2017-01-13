package tw.leonchen.myproject.OOP.enumerated;

enum Action{
	walk, jog("judy"), sleep, run, stand;
	private String name = "jack";

	private Action(){
		System.out.println("Hi");
	}
	
	Action(String name){
		this.name=name;
	}
	
	public void play(){
		System.out.println("play with " + name);
	}
}

public class TheEx3Constructor {

	public static void main(String[] args) {
		Action myAction =Action.jog;
		Action []myAction2 =Action.values();
		
		System.out.println("myAction:" + myAction);
		myAction.play();
		for(Action value:myAction2){
			 System.out.println(value+":"+value.ordinal());
		 }



	}

}
