package _013_poo_herencia;

public class UsoVehículo {

	public static void main(String[] args) {

		Coche miCoche = new Coche();
		miCoche.definirColor("celeste");
		
		Furgoneta miFurgoneta = new Furgoneta(7,500);
		
		miFurgoneta.definirColor("blanca");;
		miFurgoneta.defineClimatizador("Si");
		miFurgoneta.definirAsientos("Si");
		
		System.out.println(miCoche.mostrarDatosGenerales()+"\n"+miCoche.mostrarColor()+"\n"+miCoche.mostrarAsientos()+"\n"+miCoche.mostrarClimatizador()+"\n"+miCoche.mostrarPesoCoche()+"\n"+miCoche.mostrarPrecio());
		
		

	}

}
