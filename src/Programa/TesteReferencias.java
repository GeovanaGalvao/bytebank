package Programa;

import Entidades.Conta;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.00;
		System.out.println("Saldo da primeira conta é de R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta é de R$" + segundaConta.saldo);
		System.out.println();
		
		segundaConta.saldo += 100.00;
		System.out.println("Saldo da primeira conta é de R$" + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta é de R$" + segundaConta.saldo);
		System.out.println();
		
		if (primeiraConta == segundaConta)
			System.out.println("Mesma conta!");
		else
			System.out.println("Contas diferentes!");
		
		System.out.println("Primeira conta: " + primeiraConta);
		System.out.println("Segunda conta: " + segundaConta);
	}
}