package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {

	private LocalDate fecha = LocalDate.now();
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	public Ticket() {
		
	}
	
	public double impuesto() {
		double porcentaje = this.precioTotal / 100;
		double impuesto = porcentaje * 21;
		
		return impuesto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
