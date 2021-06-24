import java.util.Scanner;

public class EvaluarEdad2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		int age = input.nextInt();

		if (age < 12) {
			System.out.println("Eres niño/a.");
		}

		else if (age < 18) {
			System.out.println("Eres adolescente.");
		}

		else if (age < 40) {
			System.out.println("Eres joven.");
		}

		else if (age < 65) {
			System.out.println("Eres maduro/a.");
		}

		else {
			System.out.println("Coidate moito.");
		}
	}

}
