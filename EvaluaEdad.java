import java.util.Scanner;

public class EvaluaEdad {

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
