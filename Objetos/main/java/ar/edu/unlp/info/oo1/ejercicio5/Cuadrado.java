package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado implements Figura {
	
	private double lado;
	private double area;
	private double perimetro;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double l) {
		this.lado = l;
		this.perimetro = this.lado * 4;
		this.area = this.lado * this.lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void setPerimetro() {
		if(this.perimetro == 0 && this.lado > 0) {
			this.perimetro = this.lado * 4;
		}
	}

	public double getPerimetro() {
		
		this.setPerimetro();
		
		return this.perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void setArea() {
		if(this.area == 0 && this.lado > 0) {
			this.area = this.lado * this.lado;
		}
	}

	public double getArea() {
		
		this.setArea();
		
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	
}
