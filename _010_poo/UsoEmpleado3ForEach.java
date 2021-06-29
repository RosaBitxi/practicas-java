package _010_poo;

import java.util.Date;
import java.util.GregorianCalendar;

// Modelar Figura1.PNG en un único fichero con varias clases

public class UsoEmpleado3ForEach {

	public static void main(String[] args) {
		
		Empleado3[] arrayEmpleados= new Empleado3[3];
		arrayEmpleados[0]=new Empleado3("Cosme Fulanito",1000,2021,4,2);
		arrayEmpleados[1]=new Empleado3("Lalo Landa",3000,2014,03,02);
		arrayEmpleados[2]=new Empleado3("Esteban Quito",2500,1995,04,10);

	// FOR EACH:
		
	for(Empleado3 e: arrayEmpleados) {
		
		e.subeSueldo(5);
	}
		
		for (Empleado3 e: arrayEmpleados) {
			System.out.println("Nombre: "+e.mostrarNombre()+"\nSueldo: "+e.mostrarSueldo()+"\nFecha de alta: "+e.mostrarFechaAltaContrato()+"\n");
			
		}
		
	}

}

class Empleado3 {
	
	private String nombre;
	private double sueldo;
	private Date fechaAltaContrato;
	 

	public Empleado3(String nombre, double sueldo, int anio, int mes, int dia) {
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
