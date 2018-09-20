package ar.edu.unlam.basica2;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	public CuentaSueldo(String titular, Double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void depositar(Double cantidad){
		if(cantidad > 0.0){
			this.saldo += cantidad;
		}
	}
	
	@Override
	public void retirar(Double cantidad){
		if(cantidad <= this.saldo && cantidad > 0) {
			this.saldo -= cantidad;
		}
	}

}
