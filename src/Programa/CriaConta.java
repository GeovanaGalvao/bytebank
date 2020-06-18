package Programa;

import Entidades.Conta;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200.00);
		System.out.println("Saldo da primeira conta é de R$" + primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(200.00);
		System.out.println("Saldo da segunda conta é de R$" + segundaConta.getSaldo() + "\n");
		
		primeiraConta.setAgencia(146);
		segundaConta.setAgencia(primeiraConta.getAgencia());

		if (primeiraConta == segundaConta)
			System.out.println("Mesma conta!");
		else
			System.out.println("Contas diferentes!");
		
		System.out.println("Primeira conta: " + primeiraConta);
		System.out.println("Segunda conta: " + segundaConta);
	}
}