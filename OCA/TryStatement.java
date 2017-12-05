// Reconstruindo a queda da garota
// Page 306

public class TryStatement {

	void girl(){
		try{
			fall();
		} catch (RuntimeException e) {
			getUp();
		} 
		// Reversing the catchs will cause a compilation error.
		// error: exception RuntimeException has already been caught.
		catch (Exception ex) { 
			System.out.println("Exception");
		} finally {
			System.out.println("The girl is already up.");
		}
	} // fim girl()

	void fall(){
		System.out.println("Shit, the girl fell.");
		throw new RuntimeException();
	}

	void getUp(){
		System.out.println("Come on girl, get up.");
	}

	public static void main(String[] args) {
		TryStatement _try = new TryStatement();
		_try.girl();
	}
}
