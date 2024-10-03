package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> historialDeProductos = new ArrayList<Producto>(); //BalanzaMejorada Punto4
	
	public Balanza() {
		
	}
	
	//BalanzaMejorada Punto4 No seria necesario almacenar los totales en la balanza ya que podriamos obtener estos valores recorriendo la lista de productos
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.historialDeProductos.clear(); //BalanzaMejorada Punto4
	}
	
	public void agregarProducto(Producto prod) {
		this.historialDeProductos.add(prod); //BalanzaMejorada Punto4
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
		 t.setListaDeProductos(historialDeProductos); //Punto4 BalanzaMejorada
		 return t;
	}
	
	public List<Producto> getProductos(){
		return this.historialDeProductos;
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
