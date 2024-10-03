package ejercicio12;

public class Cilindro extends Pieza {
	
	private int radio;
	private int altura;
	
	public Cilindro (String m, String c, int r, int a) {
		super(m,c);
		this.radio = r;
		this.altura = a;
	}
	
	public double getVolumen() {
		double volumen = 3.14 * Math.pow(this.radio, 2) * this.altura;
		return volumen;
	}
	
	public double getSuperficie() {
		double superficie = 2 * 3.14 * this.radio * this.altura + 2 * 3.14 * Math.pow(this.radio, 2);
		return superficie;
	}
}
