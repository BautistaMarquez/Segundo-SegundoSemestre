 package ejercicio13;

public class Archivo {
	private String nombre;
	
	public Archivo(String n) {
		this.nombre = n;
	}
	
	public int tamaño() {
		int tamaño = this.nombre.length();
		return tamaño;	
	}
}
