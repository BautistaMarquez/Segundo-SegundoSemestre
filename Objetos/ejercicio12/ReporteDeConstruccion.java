package ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {

	List<Pieza> piezasConstruidas = new ArrayList<Pieza>();
	
	public double volumenDeMaterial(String material) {
		double res;
		res = this.piezasConstruidas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(p -> p.getVolumen()).sum();
		
		
		return res;
	}
	
	public double superficieDeColor(String color) {
		double res;
		res = this.piezasConstruidas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(p -> p.getSuperficie()).sum();
		
		return res;
	}
}
