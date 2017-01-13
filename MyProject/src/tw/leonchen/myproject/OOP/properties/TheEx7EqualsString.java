package tw.leonchen.myproject.OOP.properties;

public class TheEx7EqualsString {
	///還沒全懂

	public static void main(String[] args) {
		String a = new String("hi");
		String b = "hi";
		//address are different but contents are the same
		//String b = new String("hi");
		//
		System.out.println("(str1==str2)=" + (a == b));
		System.out.println("str1.equals(str2)=" + a.equals(b));
	}

}
