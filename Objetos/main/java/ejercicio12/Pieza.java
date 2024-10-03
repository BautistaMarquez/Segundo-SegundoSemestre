package ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String m, String c) {
		this.material = m;
		this.color = c;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie();

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
		
}
