package _000_ejercicios_enviados_por_rosa;

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

	private int a_ = i + c;
	private float b_ = f - c;
	private double c_ = d + f;
	private double d_ = d + i;
	private float e_ = i / f;
	private int f_ = s + j;
	private double g_ = d + j;
	private int h_ = s * c;
	private double i_ = d + c;
	private int j_ = b + c;
	private float k_ = b / c + s;
	private int l_ = c + c; // Porque es aritmética, si pongo char concatenaría.
	private double m_ = i + ln + d;
	private long n_ = ln + c;
	private int o_ = s / j;
	private double p_ = 5.2 / j; // Porque para float sería 5.2f
	private double q_ = i * f * 2.5;
	private float r_ = ln * f * 2.5F;
	private long s_ = j - 4L;
	private float t_ = j + 4L * 2.5F;
	private double u_ = b+2.5*i*35F;
	private int v_ = 'a'+b;
	private int w_ = 'a'+c;
	private int x_ = c+2;
	private long y_ = c-ln/2;
	private double z_ = 2 / i +2.0 / j;
	
	public static void main(String[] args) {

	}

}
