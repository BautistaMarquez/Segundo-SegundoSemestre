package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre = null;
	private Mamifero madre = null;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre) {
		this.identificador = nombre;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.madre != null) {
			return this.madre.getPadre();
		} else return null;
		
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.madre != null) {
			return this.madre.getMadre();
		} else return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.madre != null) {
			return this.padre.getPadre();
		} else return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.madre != null) {
			return this.padre.getMadre();
		} else return null;
	}
	
	public void agregarLista (List<Mamifero> m) {
		if(this.padre != null) {
			m.add(this.padre);
			this.padre.agregarLista(m);
		}
		
		if(this.madre != null) {
			m.add(this.madre);
			this.madre.agregarLista(m);
		}
	}
	
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		Boolean encontro = false;
		List<Mamifero> ArbolGenealogico = new ArrayList<Mamifero>();
		this.agregarLista(ArbolGenealogico);
		int i = 0;
		Mamifero ancestro = new Mamifero();
		while(!ancestro.equals(unMamifero) && i < ArbolGenealogico.size()) {
			ancestro = ArbolGenealogico.get(i);
			i = i+1;
		}
		if(ancestro.equals(unMamifero)) {
			encontro = true;
		}
		return encontro;
	}
}

