package _010_poo;

public class UsoCoche {

	public static void main(String[] args) {
	
		Coche miCoche = new Coche(); // Instanciar una clase: ejemplar de clase
		miCoche.definirColor("celeste");
		System.out.println(miCoche.mostrarColor());
		
		Coche otroCoche = new Coche();
		otroCoche.definirColor("blanco");
		System.out.println(otroCoche.mostrarColor());
		otroCoche.definirAsientos("si");
		System.out.println(otroCoche.mostrarAsientos());
			
	}

}
