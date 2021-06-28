package _005_clase_string_manipular_cadenas;

public class ManipulaCadenas3 {

	public static void main(String[] args) {

		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "David";

		System.out.println(alumno1.equals(alumno2));

		String alumno3 = "Jorge";

		System.out.println(alumno1.equals(alumno3));

		String alumno4 = "DAVID";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno4));
	}

}
