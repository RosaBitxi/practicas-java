package _007_flujo_condicionales_y_bucles;
import java.util.Scanner;

public class AdivinaNumero2_Do_While {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 100);
		int num = 0;
		int attemps = 0;
		Scanner input = new Scanner(System.in);

		do {
			attemps++;
			System.out.println("Introduce un número, por favor");
			num = input.nextInt();
			if (random < num) {
				System.out.println("Más bajo");
			} else if (random > num) {
				System.out.println("Más alto");
			}
		} while (num != random);
		System.out.println("Correcto. Lo has conseguido en " + attemps + " intentos.");
		input.close();
	}

}
