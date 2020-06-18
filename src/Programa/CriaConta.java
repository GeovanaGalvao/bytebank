package Programa;

import Entidades.Conta;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println("Saldo da primeira conta é de R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo += 200.00;		
		System.out.println("Saldo da segunda conta é de R$" + segundaConta.saldo + "\n");
		
		primeiraConta.agencia = 146;
		segundaConta.agencia = primeiraConta.agencia;

		if (primeiraConta == segundaConta)
			System.out.println("Mesma conta!");
		else
			System.out.println("Contas diferentes!");
		
		System.out.println("Primeira conta: " + primeiraConta);
		System.out.println("Segunda conta: " + segundaConta);
	}
}