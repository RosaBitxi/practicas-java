package _013_poo_herencia;

public class Furgoneta extends Coche {

	private int capacidadCarga, plazasExtra;

	public Furgoneta(int plazasExtra, int capacidadCarga) {

		super(); // llamo al constructor de la clase madre
		this.plazasExtra=plazasExtra;
		this.capacidadCarga=capacidadCarga;
	}
	
	//GETTER
	
	public String mostrarDatosFurgoneta() {
		return "La capacidad de carga es: "+capacidadCarga+" y las plazas son: "+plazasExtra;
	}

}
