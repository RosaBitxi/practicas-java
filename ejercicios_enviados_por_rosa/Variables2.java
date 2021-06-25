package ejercicios_enviados_por_rosa;

public class Variables2 {

	/*
	 * A partir de las siguientes declaraciones de variables:
	 */

	private byte b;
	private short s;
	private long ln;
	private int i, j;
	private float f;
	private double d;
	private char c;

	/*
	 * Determina cual es el tipo de dato del resultado de las siguientes expresiones
	 * aritméticas:
	 *
	 * (Ver figura 2)
	 * 
	 */

	private int a_ = i + c; // sii
	private float b_ = f - c; // ¿?
	private double c_ = d + f; // sii
	private double d_ = d + i; // sii
	private float e_ = i / f; // sii
	private int f_ = s + j; // sii
	private double g_ = d + j; //sii
	private int h_ = s * c; // sii
	private double i_ = d + c; // sii
	private int j_ = b + c; // sii
	private float k_ = b / c + s; // ¿?
	private int l_ = c + c; // Porque es aritmética, si pongo char concatenaría. sii
	private double m_ = i + ln + d; // sii
	private long n_ = ln + c; // sii
	private int o_ = s / j; // sii
	private double p_ = 5.2 / j; // Porque para float sería 5.2f sii
	private double q_ = i * f * 2.5; // sii
	private float r_ = ln * f * 2.5F; //sii
	private long s_ = j - 4L; // sii
	private float t_ = j + 4L * 2.5F; // sii
	private double u_ = b+2.5*i*35F; // sii
	private int v_ = 'a'+b; // sii
	private int w_ = 'a'+c; // sii
	private int x_ = c+2; // sii
	private long y_ = c-ln/2; // ¿?
	private double z_ = 2 / i +2.0 / j; // sii
	
	// Las soluciones me dice que cuando hai char, siempre son int la solución. Por eso pongo esas interrogaciones. A la tarde lo miro y te digo
	public static void main(String[] args) {

	}

}
