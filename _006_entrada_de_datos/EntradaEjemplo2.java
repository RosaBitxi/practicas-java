package _006_entrada_de_datos;
import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {

		/*
		 * Utilizaremos el m�todo est�tico
		 * ShowInputDialog() de la clase
		 * JOptionPane
		 * 
		 */
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce un nombre por favor");

		// Esto no lo vimos en el FP, me encant�!
		// �OJO! Este m�todo no sirve para n�meros... :-(
		
		String edad = JOptionPane.showInputDialog("Por favor, introduce la edad");
		
		// Si necesito realizar operaciones num�ricas
		// Convierto el String en int
		int edadUsuario=Integer.parseInt(edad);
		
		edadUsuario++;
		
		System.out.println("Hola "+ nombreUsuario + ". El a�o que viene tendr�s "+(edadUsuario)+" a�os.");
	}

}
