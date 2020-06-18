package Entidades;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta() {}
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Uma conta está sendo criada com o numero: " + numero + " e agencia: " + agencia);
	}
	
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
	
	public boolean testaAgenciaENumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode ser inserido um numero menor ou igual a zero.");
			return false;
		}
		return true;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (testaAgenciaENumero(agencia))
			this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (testaAgenciaENumero(numero))
			this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}