package _000_ejercicios_enviados_por_rosa;

public class Logicas {

	/*
	 * Si X, Y y Z son variables de tipo boolean con valores:
	 * 
	 * X = true Y = false Z = true
	 * 
	 * Determina el valor de las siguientes expresiones lógicas:
	 * 
	 * (Ver figura 3)
	 * 
	 */

	private final static boolean X = true;
	private final static boolean Y = false;
	private final static boolean Z = true;

	/*
	 * Primero lo resuelvo mentalmente, luego lo compruebo (confiar)
	 * 
	 */

	/*
	 * a) (X && Y) || (X && Z) = true porque true y false = false y false o true es
	 * igual a true.
	 * 
	 * b) (X || !Y) && (!X || Z) = true
	 * 
	 * true o noFalse(o sea true) = true y false o true = true
	 *
	 * c) X || Y && Z = true
	 * 
	 * true o (false y true = false) = true 
	 * 
	 * d) !(X || Y) && Z = true
	 * 
	 * true o false es true pero lo niega, entonces es false
	 * y true es false.
	 * 
	 * e) X || Y || X && !Z && !Y = true
	 * 
	 *  true o false es true y noFalse y noFalse es true.
	 *  
	 *  f) !X || !Y || Z && X && !Y = true 
	 *  
	 *  noTrue o noFalse es true,
	 *  o true es true
	 *  y true y noFalse es true
	 * 
	 */

	public static void main(String[] args) {

		// Comprobaciones (con salida en pantalla)
		
		System.out.println("a) (X && Y) || (X && Z)) = "+ ((X && Y) || (X && Z)));
		System.out.println("b) (X || !Y) && (!X || Z) = "+ ((X || !Y) && (!X || Z)));
		System.out.println("c) X || Y && Z = "+ (X || Y && Z));
		System.out.println("d) !(X || Y) && Z = "+(!(X || Y) && Z));
		System.out.println("e) X || Y || X && !Z && !Y = "+(X || Y || X && !Z && !Y));
		System.out.println("f) X || Y || X && !Z && !Y = "+(X || Y || X && !Z && !Y));
	}

}
