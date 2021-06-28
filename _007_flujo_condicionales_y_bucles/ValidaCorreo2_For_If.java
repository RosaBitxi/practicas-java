package _007_flujo_condicionales_y_bucles;
import javax.swing.JOptionPane;

public class ValidaCorreo2_For_If {

	public static void main(String[] args) {

		int arroba = 0;
		boolean dot = false;
		String mail = JOptionPane.showInputDialog("Introduce dirección de correo electrónico");

		for (int i = 0; i < mail.length(); i++) {

			if (mail.charAt(i) == '@') {
				arroba++;
			}

			if (mail.charAt(i) == '.') {
				dot = true;
			}
		}

			if (arroba == 1 && dot == true) {
				System.out.println("Es correcto");
			}

			else {
				System.out.println("Incorrecto");
			}

		}
	}

