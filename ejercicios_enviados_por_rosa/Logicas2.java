package ejercicios_enviados_por_rosa;

public class Logicas2 {
	
	/* Si W, X, Y y Z son variables de tipo boolean
	 * con valores: W = false, X = true, Y = true y Z = false,
	 * determina el valor de las siguientes expresiones lógicas:
	 * 
	 * (Ver figura 3)
	 * 
	 */
	
	private final static boolean W = false;
	private final static boolean X = true;
	private final static boolean Y = true;
	private final static boolean Z = false;
	
	/*
	 * a) X || Y && X && W || Z = true
	 * 
	 //es true, muy bien!
	 //OJO! PIOJO!
	 // tienen prioridad los && (AND) sobre los || (OR)
	 
	 // true || true && true && false || false = true || true && false || false = true || false || false = true || false = true
	 
	 * true o 
	 * true y true y false, o sea, false,
	 * es true,
	 * o false es true
	 * 
	 * b) X && !Y && !X || !W && Y = true
	 
	 //muy bien!
	 * 
	 * (true y noTrue y noTrue es false)
	 * o (noFalse y true es true)
	 * entonces false o true es true
	 * 
	 * 
	 * c) !(W || !Y) && X || Z = true
	 
	 //muy bien!
	 * 
	 * true o 
	 * false, porque niego:
	 * (true o (false y false, que es false) = true)
	 * entonces resulta true
	 *  
	 * d) X && Y && W || Z || X = true
	 
	 //muy bien!
	 * 
	 * (true y true y false es false)
	 * o (false) 
	 * o true es true
	 * 
	 * e) Y || !(Y || Z && W) = true
	 
	 //muy bien!
	 * 
	 * true o no(true o (false y false=false)= true
	 * 
	 * 
	 * f) !X && Y && (!Z || !X) = false
	 
	 //muy bien!
	 * 
	 * noTrue y true es false y
	 * (noFalse o noTrue es true)
	 * entonces false y true es false
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Comprobaciones, con salida en pantalla:
		
		System.out.println("a) X || Y && X && W || Z = "+(X || Y && X && W || Z));
		System.out.println("b) X && !Y && !X || !W && Y = "+(X && !Y && !X || !W && Y));
		System.out.println("c) !(W || !Y) && X || Z  = "+ (!(W || !Y) && X || Z));
		System.out.println("d) X && Y && W || Z || X = "+ (X && Y && W || Z || X));
		System.out.println("e) Y || !(Y || Z && W) = "+(Y || !(Y || Z && W)));
		System.out.println("f) !X && Y && (!Z || !X) = "+(!X && Y && (!Z || !X)));
	}

}
