package _010_poo;

public class Coche {

	private int ruedas, largo, ancho, motor, pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;

	/*
	 * Constructor: Método especial que se encarga de dar un estado inicial a
	 * nuestro objeto.
	 * 
	 */

	// CONSTRUCTOR
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	};

	// GETTER
	public String mostrarDatosGenerales() {

		return "El coche mide " + largo + " cm. de largo y " + ancho + "cm. de ancho.\n" + "Tiene " + ruedas
				+ " ruedas.\n"+"Su motor es de: "+motor+".\n"
				+ "Su plataforma pesa: " + pesoPlataforma + " kg.";

	}

	// SETTER
	public void definirColor(String color) {
		this.color = color;
	}

	// SETTER
	public String mostrarColor() {
		return "El coche es de color " + color + ".";
	}

	// SETTER
	public void definirAsientos(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	// GETTER
	public String mostrarAsientos() {
		if (asientosCuero == true) {
			return "El coche tiene asientos de cuero.";
		} else {
			return "El coche tiene asientos de serie.";
		}

	}

	// SETTER
	public void defineClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else
			this.climatizador = false;
	}

	// GETTER
	public String mostrarClimatizador() {
		if (climatizador == true) {
			return "El coche incorpora climatizador.";
		} else {
			return "El coche lleva aire acondicionado.";
		}
	}

	// SETTER + GETTER (no recomendado)
	public String mostrarPesoCoche() {
		int pesoCarroceria;
		pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if (asientosCuero == true) {
			pesoTotal = pesoTotal + 50;
		}
		if (climatizador = true) {
			pesoTotal = pesoTotal + 20;
		}
		return "El peso del coche es " + pesoTotal;
	}

	//GETTER
	public int mostrarPrecio() {
		int precioFinal = 10000;
		if (asientosCuero == true) {
			precioFinal += 2000;
		}
		if (climatizador == true) {
			precioFinal += 1500;
		}
		return precioFinal;
	}
}
