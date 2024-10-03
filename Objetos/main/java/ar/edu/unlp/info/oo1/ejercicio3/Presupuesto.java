package ar.edu.unlp.info.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Presupuesto{
	private LocalDate fecha; //utilice el LocalDate pq sino daba error
	private String cliente;
	private List<Item> items = new ArrayList<Item>();
	
	public Presupuesto( String c) {
		this.cliente = c;
		this.fecha = LocalDate.now();
	}
	
	public void agregarItem (Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		int i = 0;
		double total = 0;
		while(i < items.size()) {
			total = total + items.get(i).costo();
			i = i+1;
		}
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
