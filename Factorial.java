import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {

		/*
		 * long es mejor que int para factoriales
		 * de numeros largos como 20... sin embargo
		 * puede quedarse corto tambi�n. 
		 * 
		 * Lo ideal ser�a usar la clase BigInteger, 
		 * aunque no parece tan sencillo de momento.
		 * 
		 */
		
		long result = 1L; 
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));

		for (int i = num; i > 0; i--) {
			result = result * i;
		}

		System.out.println("El factorial de " + num + " es " + result);

	}
}
