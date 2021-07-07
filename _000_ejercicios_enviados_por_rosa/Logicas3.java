package _000_ejercicios_enviados_por_rosa;

import java.util.Scanner;

/* Ejercicios enviados por Rosa, correspondientes
 * a la Figura3.png
 */

public class Logicas3 {

	public static void main(String[] args) {

		// El triple de un n�mero N

		double n = 0;
		double triple = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("N�mero: ");
		n = entrada.nextInt();
		triple = n * 3;
		System.out.println("el triple de " + n + " es: " + triple);

		// La suma de los digitos de un n�mero entero N de 3 cifras

		int n2, suma = 0;

		System.out.println("Introduce un n�mero de 3 cifas: ");
		n2 = entrada.nextInt();

		/*
		 * Luego de varios intentos, hice trampa y encontr� esta soluci�n:
		 * 
		 * https://tazasdejava.blogspot.com/2016/10/sumar-los-digitos-de-un-numero-como.
		 * html 
		 * 
		 * Me gustar�a entender la explicaci�n: 
		 * 
		 * "La variable resultado pasa a
		 * valer el resultado de sumar el valor de resultado al resultado de sacar el
		 * residuo del n�mero entre 10 (con esta operaci�n, por ejemplo, si tenemos 456
		 * al aplicar el residuo entre 10 el resto valdr� 6 que es el �ltimo d�gito del
		 * n�mero) Despu�s el n�mero se divide entre 10 para repetir el proceso en el
		 * bucle y dividir todos los d�gitos mientras se almacena el valor en la
		 * variable resultado"
		 * 
		 */
		
		System.out.println("La suma de los digitos de "+n2+" es: ");
		
		while (n2 > 0) {
			suma += n2 % 10;
			n2 = n2 / 10;
		}
		
		System.out.println(suma);
		
		// A�n no consegu� limitar la entrada del n�mero a 3 cifras.
		
		
		// Comprobar si un n�meo entero N es m�ltiplo de 2 y de 3
	}
}
