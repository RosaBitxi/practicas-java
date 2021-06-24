package ejercicios_enviados_por_rosa;

public class Variables {

	/*
	 * Escribe la declaración más apropiada para cada una de las siguientes
	 * variables. El nombre de cad auna indica el tipo de dato que contendrá y
	 * servirá para determinar el tipo de dato más adecuado en la declaración de la
	 * variable.
	 * 
	 */

	// edad

	private byte edad; // aunque solemos usar int
	//Rosa: mejor int, o en tal caso un short, pq el byte te llega hasta 32 creo recordar, asiq mi madre ya no entra (66 años) jajajaja
	// Charlie: 127, me llega :-)

	// altura

	private float altura;

	// nombre

	private String nombre; 

	// peso

	private double peso; //Rosa: ostia, el float te llega para el peso jajaja
	// Charlie: ¿Y si es una balanza científica supe exacta?

	// iva

	private float iva;

	// alumnoRepetidor (valores: SI/NO)

	private String repite;
	private final String NO = "NO";
	private final String SI = "SI";
	private boolean alumnoRepetidor;

	public void Repite() {

		if (alumnoRepetidor == true) {
			repite = NO;
		}

		else

		{
			repite = SI;
		}

	}

	// letra

	private char letra;

	// minutos;

	private byte minutos; // Rosa: no te llega el byte para minutos tampoco
				// Charlie: que sí, te juro jajaja

	// matriculaCoche

	private int matriculaCoche; //mejor un String, tambien tiene letras, pero no está mal

	// mayorDeEdad (valores: verdadero/falso)

	private String mayor;
	private final String VERDADERO = "verdadero";
	private final String FALSO = "falso";
	boolean mayorDeEdad;
	
	public void MayorDeEdad() {
		if (mayorDeEdad==true) {
			mayor=VERDADERO;
		}
		if (mayorDeEdad==false) {
			mayor=FALSO;
		}
	}

	// codigoPostal

	/**
	 * 
	 * Si pienso en España, pienso en un int. Aunque hay países que incluyen letras
	 * en sus códigos postales y teniendo en cuenta que no vamos a utilizar
	 * operadores lógicos con los códigos postales, opto por utilizar String en
	 * lugar de int.
	 * 
	 */

	private String codigoPostal;

	// género (valores: H: hombre, M: mujer)

	private char HOMBRE = 'H';
	private char MUJER = 'M';
	
	// numeroDeHijos
	
	private byte numeroDeHijos;
	
	// talle camisa (valores numericos)
	
	private float talle; // quien utiliza un 38.5 de talla de camisa? la 36, la 38, la 40...
				// jajja tienes razón!
	
	// precio
	
	private float precio;
	
	// mensaje
	
	private String mensaje;
	
	// mayorEdad
	
	private boolean mayorEdad;
	
	// días
	
	private int dias;
	
	// contador
	
	private int contador;
	
	// talleCamiseta (valores: S, L, XL, M);
	
	/**
	 * Opto por utilizar String para unificar y simplificar
	 * (sino hubiera elegido char en todas menos EXTRA_LARGE)
	 */
	private final String MEDIUM = "M";
	private final String LARGE = "L";
	private final String SMALL = "S";
	private final String EXTRA_LARGE = "XL";

}
