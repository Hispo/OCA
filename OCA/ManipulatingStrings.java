// Number 14.0
// Page 107
public class ManipulatingStrings {
	public static void main(String[] args) {
		
		String name = "Hello World!";
		System.out.println(name.indexOf('o', 5));
		System.out.println(name.substring(3));
		System.out.println(name.replace("e", "E"));


		String newName = "edson";
		String changed = newName.replace('n', 'm').toUpperCase().substring(3);
		System.out.println(changed);
	}
}