package _010_poo;

import java.util.Date;
import java.util.GregorianCalendar;

// Modelar Figura1.PNG en un único fichero con varias clases

public class UsoEmpleado {

	public static void main(String[] args) {

	}

}

class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date fechaAltaContrato;
	 

	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		//mes-1 porque comienza en cero
		GregorianCalendar calendario=new GregorianCalendar(anio,mes-1,dia);
		//devuelve la fecha
		this.fechaAltaContrato=calendario.getTime();
		/* getTime, en la parte de la API de Class GregorianCalendar
		 * no aparece, ya que se trata de un método heredado
		 * de java.util.Calendar.
		 * 
		 */
	}
	
	//GETTER
	public String mostrarNombre() {
		return this.nombre;
	}
	
	//GETTER
	public double mostrarSueldo() {
		return this.sueldo;
	}
	
	//GETTER
	public Date mostrarFechaAltaContrato() {
		return this.fechaAltaContrato;
	}
	
	/*
	 * No es necesario poner this cuando no hay
	 * variable homónimas, sin embargo prefiero
	 * utilizarlo igual ya que me ayuda a ver
	 * con más claridad el código.
	 * 
	 */
	
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

}
