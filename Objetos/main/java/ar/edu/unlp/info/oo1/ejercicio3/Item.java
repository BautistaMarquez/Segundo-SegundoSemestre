package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String d, int c, double cu){
		this.detalle = d;
		this.cantidad = c;
		this.costoUnitario = cu;
	}
	
	public double costo() {
		double costoTotal = this.cantidad * this.costoUnitario;
		return costoTotal;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}	
	
}
