package _011_poo_acceso;

public class UsoDeStatic {

	/*
	 * Los empleados nuevos entran todos al mismo departamento. Luego como el tiempo
	 * pueden cambiar a otro, pero la regla es que arrancan ahí.
	 */

	public static void main(String[] args) {

		Empleados2 trabajador1 = new Empleados2("Manolito");
		Empleados2 trabajador2 = new Empleados2("Obdulio");
		System.out.println(trabajador1.mostrarDatos());

		System.out.println(trabajador2.mostrarDatos());
		trabajador2.defineSeccion("soporte técnico");
		System.out.println(trabajador2.mostrarDatos());

	}

}

class Empleados2 {

	private final String NOMBRE;
	private String seccion;
	private int id;
	private static int idSiguiente=1;

	public Empleados2(String nombre) {
		this.NOMBRE = nombre;
		this.seccion = "administracion";
		id=idSiguiente;
		idSiguiente++;
		
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
		return "Nombre: " + NOMBRE + "\nSección: " + seccion + "\nID: "+id+"\n";
	}

}
