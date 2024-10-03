package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	
		
	public CajaDeAhorro() {
		super(); //preguntar
	}

	public  boolean puedeExtraer(double monto) {
		if(this.getSaldo() >= monto) {
			return true;
		}
		return false;
	}
	
	public boolean extraer(double monto) {
		monto = monto + ((monto / 100) * 2);
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		monto = monto + ((monto / 100) * 2);
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	public void depositar (double monto) {
		monto -= ((monto / 100) * 2);
		super.depositar(monto);
	}
	
	public static void main(String[] args) {
		CajaDeAhorro caja = new CajaDeAhorro(); //Funciona
		
		caja.depositar(200);
		System.out.println(caja.getSaldo());
		
		System.out.println(caja.extraer(400));
		System.out.println(caja.extraer(150));
		System.out.println(caja.transferirACuenta(30, caja));
		System.out.println(caja.transferirACuenta(350, caja));
	}
}
