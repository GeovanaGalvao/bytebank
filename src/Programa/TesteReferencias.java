package programa;

import entidades.*;
import util.*;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new ContaCorrente();
		primeiraConta.deposita(300.00);
		System.out.println("Saldo da primeira conta é de R$" + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta é de R$" + segundaConta.getSaldo());
		System.out.println();
		
		segundaConta.deposita(100.00);
		System.out.println("Saldo da primeira conta é de R$" + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta é de R$" + segundaConta.getSaldo());
		System.out.println();
		
		if (primeiraConta == segundaConta)
			System.out.println("Mesma conta!");
		else
			System.out.println("Contas diferentes!");
		
		System.out.println("Primeira conta: " + primeiraConta);
		System.out.println("Segunda conta: " + segundaConta + "\n");
		
		Autenticavel cliente = new Cliente();
		SistemaInterno.autentica(cliente);
	}
}