package Entidades;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (saca(valor) == true) {
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}