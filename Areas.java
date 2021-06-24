import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n"
				+ "1) Cuadrado\n"
				+ "2) Rect�ngulo\n"
				+ "3) Tri�ngulo\n"
				+ "4) C�rculo\n");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		/*
		 * IMPORTANTE:
		 * A veces la ventana JOptionPane.ShowInputDialog() aparece
		 * detras de Eclipse y parece que no est�.
		 * Para verla, basta con mover Eclipse o minimizarlo.
		 * 
		 */
		
		case 1: 
			int side=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El �rea del cuadrado es: "+Math.pow(side, 2));
			break;
			
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int height=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El �rea del rect�ngulo es: "+base*height);
			break;
			
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			height=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El �rea del tri�ngulo es: "+(base*height)/2);
			break;
			
		// Atenci�n: printf
			
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El �rea del c�rculo es: ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
		}
	}

}
