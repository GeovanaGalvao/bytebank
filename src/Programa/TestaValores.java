package programa;

import entidades.*;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		System.out.println("Quantidade de contas criadas: " + Conta.getQuantidadeDeContas());
		System.out.println("---------------------------------------------------------------");
		
		//Agora a "conta" vai apontar para uma nova conta, perdendo a referencia anterior.
		conta = new ContaPoupanca(1337, 24226);
		System.out.println("Quantidade de contas criadas: " + Conta.getQuantidadeDeContas());
		System.out.println("Numero da conta: " + conta.getNumero() + " e agencia da conta: " + conta.getAgencia());
	}
}