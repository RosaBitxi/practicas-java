package _012_poo_sobrecarga_de_constructores;

import java.util.Date;
import java.util.GregorianCalendar;

// Modelar Figura1.PNG en un único fichero con varias clases

public class UsoEmpleadoSobregargaConstructor {

	public static void main(String[] args) {

		Empleado[] arrayEmpleados = new Empleado[5];
		arrayEmpleados[0] = new Empleado("Cosme Fulanito", 1000, 2021, 4, 2);
		arrayEmpleados[1] = new Empleado("Lalo Landa", 3000, 2014, 03, 02);
		arrayEmpleados[2] = new Empleado("Esteban Quito", 2500, 1995, 04, 10);
		arrayEmpleados[3] = new Empleado("Aquiles Canto");
		arrayEmpleados[4] = new Empleado();

		// FOR EACH:

		for (Empleado e : arrayEmpleados) {

			e.subeSueldo(5);
		}

		for (Empleado e : arrayEmpleados) {
			System.out.println("Nombre: " + e.mostrarNombre() + "\nSueldo: " + e.mostrarSueldo() + "\nFecha de alta: "
					+ e.mostrarFechaAltaContrato() + "\n");

		}

	}

}

class Empleado {

	private String nombre;
	private double sueldo;
	private Date fechaAltaContrato;

	public Empleado() {

	}

	public Empleado(String nombre) {
		this(nombre, 30000, 2000, 01, 01);
	}

	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		// mes-1 porque comienza en cero
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		// devuelve la fecha
		this.fechaAltaContrato = calendario.getTime();
		/*
		 * getTime, en la parte de la API de Class GregorianCalendar no aparece, ya que
		 * se trata de un método heredado de java.util.Calendar.
		 * 
		 */
	}

	// GETTER
	public String mostrarNombre() {
		return this.nombre;
	}

	// GETTER
	public double mostrarSueldo() {
		return this.sueldo;
	}

	// GETTER
	public Date mostrarFechaAltaContrato() {
		return this.fechaAltaContrato;
	}

	/*
	 * No es necesario poner this cuando no hay variable homónimas, sin embargo
	 * prefiero utilizarlo igual ya que me ayuda a ver con más claridad el código.
	 * 
	 */

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

}
