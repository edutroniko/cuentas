package ar.edu.unlam.basica2;

public class CajaDeAhorro extends Cuenta {
	
	private final Double COMISION_EXTRACCION_EXTRA = 6.0;
	private final Integer MAXIMO_EXTRACCIONES = 5;
	private Integer cantidadExtracciones = 0;
	
	public CajaDeAhorro(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	public CajaDeAhorro(String titular, Double saldo) {
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
			if(cantidadExtracciones < MAXIMO_EXTRACCIONES) {
				this.saldo -= cantidad;
				cantidadExtracciones++;
			}else if(cantidad <= (this.saldo + COMISION_EXTRACCION_EXTRA)){
				this.saldo -= (cantidad + COMISION_EXTRACCION_EXTRA);
				cantidadExtracciones++;
			}
			
		}
	}
}
