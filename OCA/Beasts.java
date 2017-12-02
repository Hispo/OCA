/*
 * The code doens't compile, because the assigment operator
 * has the highst order of precedence in this expression.
 * It may be helpsul to see what the compiler is doing by
 * adding optional parantheses: 
 * Note that if the question had added explicit parantheses
 * around the expression (tiger = "is Bigger"), the output
 * will be is Bigger.
 */

class Beasts {
	public static void main(String[] args) {
	
	String tiger = "Tiger";
	String lion = "Lion";
	final String statement = 250 > 338 ? lion : tiger = "is Bigger";
	System.out.println(statement);

	}
}