// Number 19.0
// Page 202

/* Order of Initialization:
 * 1º superclass,
 * 2º Static variable and static initializers,
 * 3º Instance variable and instance initializers,
 * 4º constructor.
 */ 

public class OrderInitialization {

	int age = 26;
		{System.out.println(age);}

	public OrderInitialization() {
		System.out.println("This is the constructor speaking!");
	}

	static String name = "Edson";
	static {System.out.println(name);}

	boolean bool = true;
		{System.out.println(bool);}


	public static void main(String[] args) {
		OrderInitialization order = new OrderInitialization();
	}
}