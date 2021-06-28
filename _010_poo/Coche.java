package _010_poo;

public class Coche {

	private int ruedas, largo, ancho, motor, pesoPlataforma;
	String color;
	int pesoTotal;
	boolean asientosCuero, aireAcondicionado;	

	// método constructor:

	/*
	 * Método especial que se encarga de dar un estado inicial a nuestro objeto.
	 * 
	 */

	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500; 
	};
	
	// Métodos getters
	
	public String mostrarMedidas() {
		
		return "El coche mide "+largo+" cm. de largo.\ny "+ancho+"cm. de ancho.";
	}
	
	public String mostrarRuedas(){
		return "El coche tiene "+ruedas+" ruedas.";
	}
	
	public String mostrarPesoPlataforma() {
		
		return "La plataforma del coche pesa: "+pesoPlataforma+" kg.";
	}
	// Método setters
	
	public void definirColor() {
		color="azul";
	}
	
	// Método setter
	
	public String mostrarColor() {
		return "El auto es de color "+color+"."; 
	}
}
