package _010_poo;

import java.util.Date;
import java.util.GregorianCalendar;

// Modelar Figura1.PNG en un único fichero con varias clases

public class UsoEmpleado2Arrays {

	public static void main(String[] args) {
		
		Empleado2[] arrayEmpleados= new Empleado2[3];
		arrayEmpleados[0]=new Empleado2("Cosme Fulanito",1000,2021,4,2);
		arrayEmpleados[1]=new Empleado2("Lalo Landa",3000,2014,03,02);
		arrayEmpleados[2]=new Empleado2("Esteban Quito",2500,1995,04,10);
	
		for (int i = 0; i < arrayEmpleados.length; i++) {
		
			arrayEmpleados[i].subeSueldo(5);
			
		}
		
		for (int i = 0; i < arrayEmpleados.length; i++) {
			System.out.println("Nombre: "+arrayEmpleados[i].mostrarNombre()+"\nSueldo: "+arrayEmpleados[i].mostrarSueldo()+"\nFecha de alta: "+arrayEmpleados[i].mostrarFechaAltaContrato()+"\n");
			
		}
		
	}

}

class Empleado2 {
	
	private String nombre;
	private double sueldo;
	private Date fechaAltaContrato;
	 

	public Empleado2(String nombre, double sueldo, int anio, int mes, int dia) {
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
