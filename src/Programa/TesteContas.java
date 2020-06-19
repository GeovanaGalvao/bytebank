package programa;

import entidades.*;

public class TesteContas {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente();
		contaCorrente.deposita(1000.00);
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.deposita(500.00);
		System.out.println("Saldo conta corrente: R$" + contaCorrente.getSaldo() + "\n-------------"
				+ "-----------------" + "\nSaldo conta poupanca: R$" + contaPoupanca.getSaldo() + "\n--"
				+ "----------------------------\nPos deposito R$100.00\n------------------------------");
		
		contaCorrente.transfere(100.00,contaPoupanca); //A conta corrente deve ser cobrada 20 centavos de taxa.
		System.out.println("Saldo conta corrente: R$" + contaCorrente.getSaldo() + "\n-------------"
				+ "-----------------" + "\nSaldo conta poupanca: R$" + contaPoupanca.getSaldo());
	}
}