package _007_flujo_condicionales_y_bucles;
import javax.swing.JOptionPane;

public class ValidaCorreo1_for {
	
	/*
	 * Este programa tiene defectos:
	 * - Podrían introducirse más de una arroba.
	 * - La dirección podría carecer de punto.  
	 * Se solucionarán en el próximo ejercicio.
	 * 
	 */

	public static void main(String[] args) {

		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("Introduce dirección de correo electrónico");
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
