package _009_arrays_bidimensionales;

public class EjemploArray2D {

	/*
	 * Convertir a lenguaje Java la planilla de calculo adjunta "saldoIntereses.ods"
	 * 
	 */

	final static double CAPITAL=10000;
	static double interes = 0.10;
	static double acumulado;

	public static void main(String[] args) {
		
		double[][]saldo = new double[6][5];
		
		for (int i = 0; i < 5; i++) {
			
			saldo[i][0]=10000;
			acumulado=10000;
			
			for (int j = 0; j < 5; j++) {
				
			acumulado=acumulado+(acumulado*interes);
			saldo[i][j]=acumulado;
				
			}
			
			interes=interes+0.01;
		}
		
		for (int z = 0; z < 5; z++) {
			System.out.println();
			
			for (int h = 0; h < 5; h++) {
				System.out.printf("[%1.2f",saldo[z][h]);
				System.out.print("] ");
			}			
		}


	}

}
