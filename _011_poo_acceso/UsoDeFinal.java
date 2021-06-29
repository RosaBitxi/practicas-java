package _011_poo_acceso;

public class UsoDeFinal {

	/*
	 * Los empleados nuevos entran todos al mismo departamento. Luego como el tiempo
	 * pueden cambiar a otro, pero la regla es que arrancan ahí.
	 */

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Manolito");
		Empleados trabajador2 = new Empleados("Obdulio");
		System.out.println(trabajador1.mostrarDatos());

		System.out.println(trabajador2.mostrarDatos());
		trabajador2.defineSeccion("soporte técnico");
		System.out.println(trabajador2.mostrarDatos());

	}

}

class Empleados {

	private final String NOMBRE;
	private String seccion;

	public Empleados(String nombre) {
		this.NOMBRE = nombre;
		this.seccion = "administracion";
	}
	
	/*
	 * Al fijar la constante NOMBRE, no podremos crear un metodo setter para modificarla. 
	 * El NOMBRE que pasemos como parámetro en el constructor será inalterable. 
	 */

	// SETTER
	public void defineSeccion(String seccion) {
		this.seccion = seccion;
	}

	// GETTER
	public String mostrarDatos() {
		return "Nombre: " + NOMBRE + "\nSección: " + seccion + "\n";
	}

}
