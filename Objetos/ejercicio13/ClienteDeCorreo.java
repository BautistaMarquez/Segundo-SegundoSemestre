package ejercicio13;

import java.util.ArrayList;
import java.util.List;
//Para el tema de que la busqueda sea mas facil, el INBOX podria ser la Carpetas[0]?Consultar.
public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas = new ArrayList<Carpeta>();
	
	public ClienteDeCorreo() {
		
	}

	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		Email resultado;
		resultado = inbox.buscarEmail(texto);
		if(resultado.equals(null)) {
			resultado = this.carpetas.stream().map(c -> c.buscarEmail(texto)).findFirst().orElse(null);
		}
		
		return resultado;
	}
	
	public int espacioOcupado() {
		int espacio = this.inbox.retornarTamaño() + this.carpetas.stream().mapToInt(c -> c.retornarTamaño()).sum();
		return espacio;
	}
}
