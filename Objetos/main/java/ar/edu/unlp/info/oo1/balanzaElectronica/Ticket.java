package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {

	private LocalDate fecha = LocalDate.now();
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> ListaDeProductos = new ArrayList<Producto>(); //Punto4 BalanzaMejorada
	
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
	
	public void setListaDeProductos(List<Producto> lista) { //Punto4 BalanzaMejorada
		this.ListaDeProductos.addAll(lista);
	}
	
	public List<Producto> getProductos(){ //Punto4 BalanzaMejorada
		return this.ListaDeProductos;
	}
	
	//Tengo dudas de si deberia hacer una interface o algo asi pero como no se pide, simplemente hice lo que pedia el enunciado sin modificar mucho a la balanza estandar y permitiendo que todo lo que ya funcionaba, funcione de la misma manera. 
}
