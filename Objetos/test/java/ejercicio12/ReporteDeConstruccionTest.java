package ejercicio12;

import	ejercicio12.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {

	protected ReporteDeConstruccion reporte;
	protected Cilindro c;
	protected Esfera e;
	protected PrismaRectangular pr;
	
	@BeforeEach
	public void seteo() {
		this.c = new Cilindro("Hierro","Rojo",10,5);
		this.e = new Esfera("Madera","Verde",7);
		this.pr = new PrismaRectangular("Acero","Blanco",20,15,22);
		this.reporte = new ReporteDeConstruccion();
		
		this.reporte.piezasConstruidas.add(c);
		this.reporte.piezasConstruidas.add(e);
		this.reporte.piezasConstruidas.add(pr);
		this.reporte.piezasConstruidas.add(c);
		this.reporte.piezasConstruidas.add(e);
		this.reporte.piezasConstruidas.add(pr);
	}
	
	@Test
	public void TestvolumenDeMaterial(){
		assertEquals(1615.53,this.reporte.volumenDeMaterial("Madera"));
		assertEquals(3140,this.reporte.volumenDeMaterial("Hierro"));
		assertEquals(13200,this.reporte.volumenDeMaterial("Acero"));
	}
	
	@Test
	public void TestsuperficieDeColor() {
		assertEquals(1884,this.reporte.superficieDeColor("Rojo"));
		assertEquals(1230.88,this.reporte.superficieDeColor("Verde"));
		assertEquals(4280,this.reporte.superficieDeColor("Blanco"));
	}
}
