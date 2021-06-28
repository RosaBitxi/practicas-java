package _007_flujo_condicionales_y_bucles;
import java.util.Scanner;

public class EvaluaEdad_If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		int pass1 = entrada.nextInt();
		
		if (pass1 >= 18) {
			System.out.println("Eres mayor de edad.");
		}

		else {
			System.out.println("Eres menor de edad.");
		}
	}

}
