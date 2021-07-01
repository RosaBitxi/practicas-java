package _014_poo_herencia_extends;

public class Empresa {

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