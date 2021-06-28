package _003_constantes_y_operadores;

public class DeclaradoresOperadores {

	public static void main(String[] args) {

		int a = 5;
		int b;
		b = 7;

		int c = b + a;

		System.out.println(c);

		c++;

		System.out.println(c);

		c += 6;

		System.out.println(c);

		// Los comentarios también se utilizan
		// Para invalidar código sin borrarlo.

		c = b / a; // 7 / 5

		// Ignora la parte decimal
		// y se queda con la entera.

		/**
		 * Para trabajar con decimales tendríamos que usar un float o un double.
		 * 
		 */

		System.out.println(c);

		c = 5;

		System.out.println(c);

		final int C = 5; // No podemos cambiarla

		System.out.println(C);

		// Declarar varias variables de una vez:

		int operador1, operador2, resultado;

		operador1 = 8;
		operador2 = 7;
		resultado = operador1 + operador2;

		System.out.println(resultado);

	}

}
