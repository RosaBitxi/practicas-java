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

	// altura

	private float altura;

	// nombre

	private String nombre;

	// peso

	private double peso;

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

	private byte minutos;

	// matriculaCoche

	private int matriculaCoche;

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
	
	private float talle;
	
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
