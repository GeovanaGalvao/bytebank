package Entidades;

public class Conta {

	public double saldo;
	public int agencia;
	public int numero;
	public String titular;
	
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
}