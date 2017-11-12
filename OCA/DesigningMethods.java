// Number 18.0
// Page 169

public class DesigningMethods{
	public static void main(String[] args) {
		
		int number = 1;
		String letters = "abc";

		number  = number(number);
		letters(letters);
		System.out.println(number + letters);

	}

	public static int number(int number) {
		number++;
		return number;
	}

	public static String letters(String letters) {
		letters += "d";
		return letters;
	}
}