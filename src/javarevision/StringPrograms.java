package javarevision;

public class StringPrograms {
	public static void countNumeric() {

		String s = "senthil123";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (c >= 0 && c <= 9) {
				System.out.println(c);        
			}
		}

	}
	public static void main(String[] args) {
		countNumeric();
	}
}
