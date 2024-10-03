package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String n) {
		this.nombre = n;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarEmail(Email e) {
		this.emails.add(e);
	}
	
	public void mover(Email e, Carpeta destino) {
		this.emails.remove(e);
		destino.agregarEmail(e);
	}
	
	public Email buscarEmail(String parametro){
		Email res;
		res = this.emails.stream().filter(e -> e.getTitulo().contains(parametro) || e.getCuerpo().contains(parametro)).findFirst().orElse(null);
		return res;
	}
	
	public int retornarTamaño() {
		int tamaño = this.emails.stream().mapToInt(e -> e.retornarTamaño()).sum();
		return tamaño;
	}
	
}
