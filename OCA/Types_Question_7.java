/* Working with Java Data Types - Test
 * Código compila, mas  gera um  NullPointerException  em
 * tempo de execução. Isso  porque a variável static pode
 * ser inicializada mesmo depois do main(), sem o keyword
 * static gera erro de compilaçao, porque a variável  não
 * poderia ser inicializada  depois  de main(), ela seria
 * uma variável local.
 */ 
public class Types_Question_7 {
	  static Integer i;

	public static void main(String[] args) {
		Double j = 0.25;
		Double z = j + i;
		System.out.println(z);
	}
}