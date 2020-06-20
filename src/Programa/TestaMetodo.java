package programa;

import entidades.*;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		conta.deposita(50.00);
		System.out.println("Saldo atual: " + conta.getSaldo());
		conta.saca(100.00);
		System.out.println("Conseguiu retirar 100.0? " + conta.saca(100.00));
		conta.deposita(50.00);
		System.out.println("Deposito de 50.0");
		System.out.println("Saldo atual: " + conta.getSaldo());
		System.out.println("Conseguiu retirar 100.0? " + conta.saca(100.00));
		System.out.println("Saldo atual: " + conta.getSaldo());		
		System.out.println("--------------------------------");
		
		Conta contaTeste = new ContaCorrente();
		contaTeste.deposita(1000);
		
		if(contaTeste.transfere(300,conta)) {
			System.out.println("Saldo atual da conta: " + conta.getSaldo());
			System.out.println("Saldo atual da contaTeste: " + contaTeste.getSaldo());
		} else
			System.out.println("Saldo insuficiente.");
		
		System.out.println("--------------------------------");
		
		if(conta.transfere(500,contaTeste)) {
			System.out.println("Saldo atual da conta: " + conta.getSaldo());
			System.out.println("Saldo atual da contaTeste: " + contaTeste.getSaldo());
		} else
			System.out.println("Saldo insuficiente.");
	}
}