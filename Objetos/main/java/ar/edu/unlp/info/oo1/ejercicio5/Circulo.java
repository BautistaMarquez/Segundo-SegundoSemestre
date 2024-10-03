package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo implements Figura { //Consultar si deberia usar un set y como deberia hacerlo, ademas de lo de la Figura
	
	private double diametro;
	private double radio;
	private double area;
	private double perimetro;
	
	
	public Circulo() {
		
	}
	
	public Circulo(double r) {
		this.radio = r;
		this.area = Math.PI * (r * r);
		this.perimetro = Math.PI * (r * r);
		this.diametro = r * 2;
	}
	
	public Circulo(double r,double a,double p,double d) {
		this.area = a;
		this.radio = r;
		this.perimetro = p;
		this.diametro = d;
	}
	
	public void setPerimetro() {
		if(this.perimetro == 0 && this.radio > 0) {
			this.perimetro = Math.PI * (this.radio * 2);
		}
	}
	
	public  double getPerimetro() {
		
		this.setPerimetro();
		
		return this.perimetro;
	}
	
	public void setArea() {
		if(this.area == 0 && this.radio > 0) {
			this.area = Math.PI * (this.radio * this.radio);
		}
	}
	
	public  double getArea() {
		
		this.setArea();
		
		return this.area;
	}
	
	public void setDiametro() {
		if(this.diametro == 0 && this.radio > 0) {
			this.diametro = this.radio * 2;
		}
	}

	public double getDiametro() {
		
		this.setDiametro();
		
		return this.diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
