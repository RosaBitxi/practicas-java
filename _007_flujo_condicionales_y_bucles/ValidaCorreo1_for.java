package _007_flujo_condicionales_y_bucles;
import javax.swing.JOptionPane;

public class ValidaCorreo1_for {
	
	/*
	 * Este programa tiene defectos:
	 * - Podr�an introducirse m�s de una arroba.
	 * - La direcci�n podr�a carecer de punto.  
	 * Se solucionar�n en el pr�ximo ejercicio.
	 * 
	 */

	public static void main(String[] args) {

		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("Introduce direcci�n de correo electr�nico");
		for (int i = 0; i < mail.length(); i++) {

			if (mail.charAt(i) == '@') {
				arroba = true;
			}

		}
		if (arroba == true) {
			System.out.println("Correcto");
		} else {
			System.out.println("Formato incorrecto");
		}
	}

}
