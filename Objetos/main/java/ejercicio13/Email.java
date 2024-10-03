package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String t, String c) {
		this.titulo = t;
		this.cuerpo = c;
		this.adjuntos = new ArrayList<Archivo>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	public int retornarTamaño() {
		int tamaño = getTitulo().length() + getCuerpo().length() + this.adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
		return tamaño;
	}
	
}
