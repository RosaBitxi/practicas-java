package _005_clase_string_manipular_cadenas;

public class ManipulaCadenas2 {

	public static void main(String[] args) {
		
		/* El m�todo substring sirve para extraer
		 * un determinado n�mero de caracteres
		 * dentro de una cadena, de forma tal que
		 * se crea una nueva cadena (sub-cadena).
		 */

		String frase=("Hoy es un estupendo d�a para aprender a programar en Java");
		String fraseResumen=frase.substring(0, 29)+"irnos a la playa y olvidarnos de todo..."+" en lugar de quedarnos y "+frase.substring(29,57);
		System.out.println(fraseResumen);
				
	}

}
