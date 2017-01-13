package tw.leonchen.myproject.OOP;

public class TheEx9String {

	public static void main(String[] args) {
		String str1 = "Oh no~";
		String data = "abcdefghijabc";

		System.out.println("str1=" + str1 + 1 + 2);
		// 強迫1變字串
		System.out.println("data.length()=" + data.length());
		System.out.println("data.charAt(3)=" + data.charAt(3));
		System.out.println("data.substring(3, 5)=" + data.substring(3, 5));
		System.out.println("data.indexOf('def')=" + data.indexOf("def"));
		System.out.println("data.replaceAll('ab', 'ba')=" + data.replaceAll("ab", "ba"));

	}

}
