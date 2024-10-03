package ar.edu.unlp.info.oo1.redAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
		boolean encendido = false;
		List<Farola> vecinos = new ArrayList<Farola>();
		
	public Farola () {
		
	}
	
	public void encenderVecinos() {
		int i;
		for(i=0 ; i<this.vecinos.size(); i++) {
			this.vecinos.get(i).encendido = true;
		}
	}
	
	public void apagarVecinos() {
		int i;
		for(i=0 ; i<this.vecinos.size(); i++) {
			this.vecinos.get(i).encendido = false;
		}
	}

	public void pairWithNeighbor( Farola otraFarola ) {
		this.vecinos.add(otraFarola);
		otraFarola.vecinos.add(this);
	}

	public List<Farola> getNeighbors (){
		return this.vecinos;
	}

	public void turnOn() {
		if(this.encendido == false) {
			this.encendido = true;
			System.out.print("Farola Encendida");
			this.encenderVecinos();
		}
	}

	public void turnOff() {
		if(this.encendido == true) {
			this.encendido = false;
			System.out.print("Farola Apagada");
			this.apagarVecinos();
		}
	}

	public boolean isOn() {
		return this.encendido;
	}
	
	public boolean isOff() {
		if(this.encendido == true) {
			return false;
		}else return true;
	}
	
}
