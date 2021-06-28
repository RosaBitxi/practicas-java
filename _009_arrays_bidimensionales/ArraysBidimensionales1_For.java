package _009_arrays_bidimensionales;

public class ArraysBidimensionales1_For {

	public static void main(String[] args) {

		int[][] array = new int[4][5];

		array[0][0] = 23;
		array[0][1] = 63;
		array[0][2] = 76;
		array[0][3] = 78;
		array[0][4] = 33;

		array[1][0] = 54;
		array[1][1] = 28;
		array[1][2] = 65;
		array[1][3] = 79;
		array[1][4] = 24;

		array[2][0] = 65;
		array[2][1] = 78;
		array[2][2] = 29;
		array[2][3] = 96;
		array[2][4] = 60;

		array[3][0] = 63;
		array[3][1] = 88;
		array[3][2] = 22;
		array[3][3] = 59;
		array[3][4] = 74;

		System.out.println("Valor alamacenado en la posición 2,3: " + array[2][3]);

		// El primer bucle recorre la dimensión 1

		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			
			// El bucle en su interior, recorre la dimensión 2

			for (int j = 0; j < array.length + 1; j++) {
				System.out.print("[" + array[i][j] + "] ");
			}
		}
	}

}
