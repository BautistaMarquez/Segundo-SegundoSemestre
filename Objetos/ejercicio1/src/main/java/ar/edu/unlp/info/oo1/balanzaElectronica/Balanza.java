package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto prod) {
		this.cantidadDeProductos = this.cantidadDeProductos +1;
		this.pesoTotal = this.pesoTotal + prod.getPeso();
		this.precioTotal = (this.precioTotal + (prod.getPrecioPorKilo() * prod.getPeso()));
	}
	
	public Ticket emitirTicket () {
		 Ticket t = new Ticket();
		 
		 t.setFecha(LocalDate.now());
		 t.setCantidadDeProductos(this.cantidadDeProductos);
		 t.setPesoTotal(this.pesoTotal);
		 t.setPrecioTotal(this.precioTotal);
		 
		 return t;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
}
