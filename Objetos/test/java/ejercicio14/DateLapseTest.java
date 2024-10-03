package ejercicio14;

import ejercicio14.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DateLapseTest { //Preguntar si esto que hice es lo que habia que hacer 
	DateLapseA lapsoDeTiempo1;
	DateLapseB lapsoDeTiempo2;
	
	@BeforeEach
	public void set() {
		LocalDate inicio1 = LocalDate.of(2010, 10, 10);
		LocalDate fin1 = LocalDate.of(2011, 12, 23);
		LocalDate inicio2 = LocalDate.of(2005, 11, 21);
		int dias = 30;
		this.lapsoDeTiempo1 = new DateLapseA(inicio1,fin1);
		this.lapsoDeTiempo2 = new DateLapseB(inicio2,dias);
		
	}
	
	@Test
	public void testsizeInDays() {
		assertEquals(439,this.lapsoDeTiempo1.sizeInDays());
	}
	
	@Test
	public void testincludesDate() {
		LocalDate fecha = LocalDate.of(2011, 12, 22);
		LocalDate fecha2 = LocalDate.of(2011, 12, 23);
		LocalDate fecha3 = LocalDate.of(2005, 11, 22);
		LocalDate fecha4 = LocalDate.of(2005, 11, 20);
		assertEquals(true,this.lapsoDeTiempo1.includesDate(fecha));
		assertEquals(false,this.lapsoDeTiempo1.includesDate(fecha2));
		assertEquals(true,this.lapsoDeTiempo2.includesDate(fecha3));
		assertEquals(false,this.lapsoDeTiempo2.includesDate(fecha4));
	}
}
