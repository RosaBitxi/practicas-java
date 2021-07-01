package _014_poo_herencia_extends;

import java.util.Date;
import java.util.GregorianCalendar;

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
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		this.fechaAltaContrato = calendario.getTime();

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

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

}