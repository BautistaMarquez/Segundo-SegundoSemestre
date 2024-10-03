package ejercicio12;

public class Esfera extends Pieza {

	private int radio;
	
	public Esfera (String m, String c, int r) {
		super(m,c);
		this.radio = r;
	}
	
	public double getVolumen() {
		double volumen = 0.75 * 3.14 * Math.pow(this.radio, 3);
		return volumen;
	}
	
	public double getSuperficie() {
		double superficie = 4 * 3.14 * Math.pow(this.radio, 2);
		return superficie;
	}
	
}
