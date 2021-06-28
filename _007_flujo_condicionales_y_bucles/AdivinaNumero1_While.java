package _007_flujo_condicionales_y_bucles;
import java.util.Scanner;

public class AdivinaNumero1_While {

	/*
	 * La persona usuaria tendrá que adivinar el programa que ha "pensado" el
	 * ordenador. En cada intento nos dirá si el número es más alto, más bajo o
	 * correcto en el caso en que hayamos acertado.
	 * 
	 */

	public static void main(String[] args) {

		int random = (int) (Math.random() * 100);
		Scanner input = new Scanner(System.in);
		int num = 0;
		int attemps = 0; // intentos

		while (num != random) {

			/*
			 * Podría ocurrir que Math.ramdom() devuelva por ejemplo un 0.00000058 con lo
			 * que al multiplicar por 100 y convertir en entero, el resultado sería = 0 y el
			 * programa no se ejecutaría ni una vez. Esto se solucionará en el ejercicio
			 * siguiente, con la sentencia "do".
			 * 
			 */

			attemps++;
			System.out.println("Introduce un número, por favor");
			num = input.nextInt();
			if (random < num) {
				System.out.println("Más bajo");
			} else if (random > num) {
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto. Lo has conseguido en " + attemps + " intentos.");
		input.close();
	}

}
