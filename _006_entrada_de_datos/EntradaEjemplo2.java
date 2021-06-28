package _006_entrada_de_datos;
import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {

		/*
		 * Utilizaremos el método estático
		 * ShowInputDialog() de la clase
		 * JOptionPane
		 * 
		 */
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce un nombre por favor");

		// Esto no lo vimos en el FP, me encantó!
		// ¡OJO! Este método no sirve para números... :-(
		
		String edad = JOptionPane.showInputDialog("Por favor, introduce la edad");
		
		// Si necesito realizar operaciones numéricas
		// Convierto el String en int
		int edadUsuario=Integer.parseInt(edad);
		
		edadUsuario++;
		
		System.out.println("Hola "+ nombreUsuario + ". El año que viene tendrás "+(edadUsuario)+" años.");
	}

}
