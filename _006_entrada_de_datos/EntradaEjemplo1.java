package _006_entrada_de_datos;
import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre, por favor: ");
		String nombreUsuario = entrada.nextLine();

		System.out.println("Por favor, introduce tu edad: ");
		int edadUsuario = entrada.nextInt();

		System.out.println("Hola " + nombreUsuario + ". " + "El año que viene tendrás " + (edadUsuario + 1) + " años.");
		/*
		 * Interesante: para sumarle un año a la edad necesito
		 * las paréntesis, ya que sino se concatenaría.
		 * 
		 */
		
		entrada.close(); // No lo dice la lección, pero hay que hacerlo.

	}

}
