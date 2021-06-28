package _007_flujo_condicionales_y_bucles;
import java.util.Scanner;

public class AdivinaNumero1_While {

	/*
	 * La persona usuaria tendr� que adivinar el programa que ha "pensado" el
	 * ordenador. En cada intento nos dir� si el n�mero es m�s alto, m�s bajo o
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
			 * Podr�a ocurrir que Math.ramdom() devuelva por ejemplo un 0.00000058 con lo
			 * que al multiplicar por 100 y convertir en entero, el resultado ser�a = 0 y el
			 * programa no se ejecutar�a ni una vez. Esto se solucionar� en el ejercicio
			 * siguiente, con la sentencia "do".
			 * 
			 */

			attemps++;
			System.out.println("Introduce un n�mero, por favor");
			num = input.nextInt();
			if (random < num) {
				System.out.println("M�s bajo");
			} else if (random > num) {
				System.out.println("M�s alto");
			}
		}
		System.out.println("Correcto. Lo has conseguido en " + attemps + " intentos.");
		input.close();
	}

}
