package _000_ejercicios_enviados_por_rosa;

import java.util.Scanner;

/* Ejercicios enviados por Rosa, correspondientes
 * a la Figura3.png
 */

public class Logicas3 {

	public static void main(String[] args) {

		// El triple de un número N

		double n = 0;
		double triple = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Número: ");
		n = entrada.nextInt();
		triple = n * 3;
		System.out.println("el triple de " + n + " es: " + triple);

		// La suma de los digitos de un número entero N de 3 cifras

		int n2, suma = 0;

		System.out.println("Introduce un número de 3 cifas: ");
		n2 = entrada.nextInt();

		/*
		 * Luego de varios intentos, hice trampa y encontré esta solución:
		 * 
		 * https://tazasdejava.blogspot.com/2016/10/sumar-los-digitos-de-un-numero-como.
		 * html 
		 * 
		 * Me gustaría entender la explicación: 
		 * 
		 * "La variable resultado pasa a
		 * valer el resultado de sumar el valor de resultado al resultado de sacar el
		 * residuo del número entre 10 (con esta operación, por ejemplo, si tenemos 456
		 * al aplicar el residuo entre 10 el resto valdrá 6 que es el último dígito del
		 * número) Después el número se divide entre 10 para repetir el proceso en el
		 * bucle y dividir todos los dígitos mientras se almacena el valor en la
		 * variable resultado"
		 * 
		 */
		
		System.out.println("La suma de los digitos de "+n2+" es: ");
		
		while (n2 > 0) {
			suma += n2 % 10;
			n2 = n2 / 10;
		}
		
		System.out.println(suma);
		
		// Aún no conseguí limitar la entrada del número a 3 cifras.
		
		
		// Comprobar si un númeo entero N es múltiplo de 2 y de 3
	}
}
