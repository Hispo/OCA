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
		
		
		StringBuilder _insert = new StringBuilder("edson");
		_insert.insert(0, "-");
		_insert.insert(4, "-");
		_insert.insert(7, "-");
		System.out.println(_insert);

		_insert.deleteCharAt(7);
		System.out.println(_insert);


		ManipulatingStrings t1 = new ManipulatingStrings();
		ManipulatingStrings t2 = new ManipulatingStrings();
		ManipulatingStrings t3 = t1;
		System.out.println(t1==t2); // false
		System.out.println(t1==t3); // true
	}
}
