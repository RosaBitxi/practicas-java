package _010_poo;

public class Coche {

	private int ruedas, largo, ancho, motor, pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, aireAcondicionado;

	/*
	 * Constructor: Método especial que se encarga de dar un estado inicial a
	 * nuestro objeto.
	 * 
	 */

	public Coche() { // CONSTRUCTOR
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	};

	public String mostrarDatosGenerales() { // GETTER

		return "El coche mide " + largo + " cm. de largo y " + ancho + "cm. de ancho.\n" + "Tiene " + ruedas
				+ " ruedas.\n" + "Su plataforma pesa: " + pesoPlataforma + " kg.";

	}

	public void definirColor(String color) { // SETTER
		this.color = color;
	}

	public String mostrarColor() { // SETTER
		return "El coche es de color " + color + ".";
	}

	//SETTER
	public void definirAsientos(String asientosCuero) {
		if (asientosCuero == "si") {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}
	
	//GETTER
	public String mostrarAsientos() {
		if(asientosCuero==true) {
			return"El coche tiene asientos de cuero.";
		}
		else {
			return"El coche tiene asientos de serie.";
		}
	}
}















