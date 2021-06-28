package _010_poo;

public class UsoCoche {

	public static void main(String[] args) {
	
		Coche miCoche = new Coche(); // Instanciar una clase: ejemplar de clase
		
		miCoche.definirColor();
		
		System.out.println(miCoche.mostrarColor());
		
		Coche otroCoche = new Coche();
		
		System.out.println(otroCoche.mostrarColor());
		
	}

}
