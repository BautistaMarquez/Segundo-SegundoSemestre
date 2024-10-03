package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuerpo3D { //Funciona
	private Figura caraBasal;
	private double altura;
	private double volumen;
	private double superficieExterior;
	
	public Cuerpo3D() {
		
	}
	
	

	public Figura getCaraBasal() {
		return this.caraBasal;
	}

	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		
		if(this.volumen == 0 && this.altura > 0) {
			this.volumen = this.caraBasal.getArea() * this.altura;
		}
		
		return this.volumen;
	}
	
	public double getSuperficieExterior() {
		if(this.superficieExterior == 0 && this.altura > 0) {
			this.superficieExterior = 2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura;
		}

		return this.superficieExterior;
	}
	
}
