package ar.edu.unlam.basica2;

public class Cuenta {
	protected String titular;
	protected Double saldo;
	protected Double cantidad;
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(Double cantidad){
	    if(cantidad>0) {
	    	this.saldo += cantidad;
	    }
	}
	
	public void retirar(Double cantidad){
		if(cantidad>0 && cantidad<=this.saldo) {
	    	this.saldo -= cantidad;
	    }
	}
}
