package _014_poo_herencia_extends;

public class Jefatura extends Empleado {

	private double incentivo;
	
	public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre, sueldo, anio, mes, dia);
	}
	
	//SETTER
	public void fijarIncentivo(double incentivo) {
		this.incentivo=incentivo;
	}
	
	//GETTER
	public double mostrarSueldo() {
		double sueldoJefe = super.mostrarSueldo();
		return sueldoJefe+incentivo;
	}
}
