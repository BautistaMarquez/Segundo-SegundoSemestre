package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio9.Cuenta;
import ar.edu.unlp.info.oo1.ejercicio9.CajaDeAhorro;
import ar.edu.unlp.info.oo1.ejercicio9.CuentaCorriente;

public class CuentasTest {
	private CajaDeAhorro caja1;
	private CuentaCorriente cuenta1;
	
	@BeforeEach
	public void setUp() {
			CajaDeAhorro caja1 = new CajaDeAhorro();
			CuentaCorriente cuenta1 = new CuentaCorriente();
			cuenta1.setDescubierto(100);
			caja1.depositar(100);
			cuenta1.depositar(100);
	}

	@Test
	public void testExtraerCaja() {
		assertEquals(false,caja1.extraer(100));
		assertEquals(true,caja1.extraer(50));
	}
	
	@Test
	public void testExtraerCuenta() {
		assertEquals(false,cuenta1.extraer(300));
		assertEquals(true,cuenta1.extraer(150));
	}

	@Test
	public void testTransferenciaCaja() {
		assertEquals(false,caja1.transferirACuenta(200, cuenta1));
		assertEquals(true,caja1.transferirACuenta(20, cuenta1));
		
	}

	@Test
	public void testTransferenciaCuenta() {
		assertEquals(false,cuenta1.transferirACuenta(400, caja1));
		assertEquals(true,cuenta1.transferirACuenta(40, caja1));

	}
}
