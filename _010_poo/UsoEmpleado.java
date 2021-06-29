package _010_poo;

import java.util.Date;
import java.util.GregorianCalendar;

// Modelar Figura1.PNG en un �nico fichero con varias clases

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1=new Empleado("Cosme Fulanito",1000,2021,4,2);
		Empleado empleado2=new Empleado("Lalo Landa",3000,2014,03,02);
		Empleado empleado3=new Empleado("Esteban Quito",2500,1995,04,10);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: "+empleado1.mostrarNombre()+"\nSueldo: "+empleado1.mostrarFechaAltaContrato());
		System.out.println("Nombre: "+empleado2.mostrarNombre()+"\nSueldo: "+empleado2.mostrarFechaAltaContrato());
		System.out.println("Nombre: "+empleado3.mostrarNombre()+"\nSueldo: "+empleado3.mostrarFechaAltaContrato());

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
		 * no aparece, ya que se trata de un m�todo heredado
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
	 * variable hom�nimas, sin embargo prefiero
	 * utilizarlo igual ya que me ayuda a ver
	 * con m�s claridad el c�digo.
	 * 
	 */
	
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}

}
