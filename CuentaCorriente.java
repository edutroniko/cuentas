package ar.edu.unlam.basica2;

public class CuentaCorriente extends Cuenta {
	
	private final Double COMISION_DESCUBIERTO = 0.05;
	private Double descubiertoAdmitido = 0.0;
	
	public CuentaCorriente(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	public CuentaCorriente(String titular, Double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void depositar(Double cantidad){
		if(cantidad > 0.0){
			this.saldo += cantidad;
		}
	}
	
	/*
	 *  en el caso de descontar comisión no se hace sobre la diferencia
	 *  sino sobre toda la extraccion
	 */
	
	@Override
	public void retirar(Double cantidad){
		if(cantidad <= this.saldo && cantidad > 0) {
			this.saldo -= cantidad;
		}else 
			/*if((cantidad + (cantidad*COMISION_DESCUBIERTO) + descubiertoAdmitido) <= this.saldo)*/
			this.saldo -= (cantidad + (cantidad*COMISION_DESCUBIERTO));
		}
	}

}
