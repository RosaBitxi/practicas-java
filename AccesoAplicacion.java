import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		
		String pass1="Charlie";
		String pass2="";
		
		while (pass1.equals(pass2)==false) {
		
			pass2=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (pass1.equals(pass2)==false) {
				System.out.println("Contrase�a incorrecta.");
			}
		}

		System.out.println("Contrase�a correcta. Acceso permitido.");
	}

}
