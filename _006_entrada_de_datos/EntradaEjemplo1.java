package _006_entrada_de_datos;
import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre, por favor: ");
		String nombreUsuario = entrada.nextLine();

		System.out.println("Por favor, introduce tu edad: ");
		int edadUsuario = entrada.nextInt();

		System.out.println("Hola " + nombreUsuario + ". " + "El a�o que viene tendr�s " + (edadUsuario + 1) + " a�os.");
		/*
		 * Interesante: para sumarle un a�o a la edad necesito
		 * las par�ntesis, ya que sino se concatenar�a.
		 * 
		 */
		
		entrada.close(); // No lo dice la lecci�n, pero hay que hacerlo.

	}

}
