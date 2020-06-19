package entidades;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int quantidadeDeContas;
	
	public Conta() {
		quantidadeDeContas++;
	}
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		quantidadeDeContas++;
	}
	
	public static int getQuantidadeDeContas() {
		return quantidadeDeContas;
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

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}