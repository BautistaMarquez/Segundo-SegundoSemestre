package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}
	
	public  boolean puedeExtraer(double monto) {
		if(this.getSaldo() - monto >= this.getDescubierto()) {
			return true;
		}
		return false;
	}
	
	public void setDescubierto(double descubierto) {
		this.limiteDescubierto -= descubierto;
	}
	
	public double getDescubierto() {
		return this.limiteDescubierto;
	}
	
	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente(); //Funciona
		
		cuenta.depositar(100);
		System.out.println(cuenta.getSaldo());
		cuenta.setDescubierto(100);
		System.out.println(cuenta.extraer(400));
		System.out.println(cuenta.extraer(150));
		System.out.println(cuenta.transferirACuenta(50, cuenta));
		System.out.println(cuenta.transferirACuenta(350, cuenta));
	}
	
}
