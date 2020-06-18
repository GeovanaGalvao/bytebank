package Programa;

import Entidades.Conta;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia(-5);
		conta.setNumero(0);
		System.out.println("------------------------------------------------------");
		
		//Agora a "conta" vai apontar para uma nova conta, perdendo a referencia anterior.
		conta = new Conta(1337, 24226);
		System.out.println("Numero da conta: " + conta.getNumero() + " e agencia da conta: " + conta.getAgencia());
	}
}