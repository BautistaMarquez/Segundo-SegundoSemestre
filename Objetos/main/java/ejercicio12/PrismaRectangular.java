package ejercicio12;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(String m, String c, int ladoMax, int ladoMin, int a) {
		super(m,c);
		this.ladoMayor = ladoMax;
		this.ladoMenor = ladoMin;
		this.altura = a;
	}
	
	public double getVolumen() {
		double volumen = this.ladoMayor * this.ladoMenor * this.altura;
		return volumen;
	}
	
	public double getSuperficie() {
		double superficie = 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.altura);
		return superficie;
	}
	
}
