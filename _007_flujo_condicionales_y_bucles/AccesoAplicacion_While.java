package _007_flujo_condicionales_y_bucles;
import javax.swing.JOptionPane;

public class AccesoAplicacion_While {

	public static void main(String[] args) {
		
		String pass1="Charlie";
		String pass2="";
		
		while (pass1.equals(pass2)==false) {
		
			pass2=JOptionPane.showInputDialog("Introduce la contraseņa, por favor");
			
			if (pass1.equals(pass2)==false) {
				System.out.println("Contraseņa incorrecta.");
			}
		}

		System.out.println("Contraseņa correcta. Acceso permitido.");
	}

}
