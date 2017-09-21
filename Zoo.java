// Number 3.0
// Page 7.
// Undertanding main().

public class Zoo {
	public static void main(String[] args) {
		System.out.println(args[0]); // Does not compile
		System.out.println(args[1]); // Does not compile
		// java.lang.ArrayIndexOutOfBoundsException
	}
}