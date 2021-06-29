package _010_poo;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {

		Coche miCoche = new Coche();

		miCoche.definirColor(JOptionPane.showInputDialog("Introduce color"));		
		miCoche.definirAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		miCoche.defineClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(miCoche.mostrarDatosGenerales()); 
		System.out.println(miCoche.mostrarColor());
		System.out.println(miCoche.mostrarAsientos());
		System.out.println(miCoche.mostrarClimatizador());		
		System.out.println(miCoche.mostrarPesoCoche());
		System.out.println("El precio final del coche es: " + miCoche.mostrarPrecio());
	}

}
