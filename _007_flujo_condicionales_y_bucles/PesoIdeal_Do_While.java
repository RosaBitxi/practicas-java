package _007_flujo_condicionales_y_bucles;
import javax.swing.JOptionPane;

public class PesoIdeal_Do_While {

	public static void main(String[] args) {

		String gender = "";

		do {
			gender = JOptionPane.showInputDialog("¿Género? (H/M)");

		} while (gender.equalsIgnoreCase("H") == false && (gender.equalsIgnoreCase("M")) == false);

		int height = Integer.parseInt(JOptionPane.showInputDialog("¿Altura? En cm, ejemplo: 160"));
		int idealWeight = 0;
		if (gender.equalsIgnoreCase("H")) {
			idealWeight = height - 110;
		} else if (gender.equalsIgnoreCase("M")) {
			idealWeight = height - 120;
		}
		System.out.println("Tu peso ideal es " + idealWeight);

	}

}
