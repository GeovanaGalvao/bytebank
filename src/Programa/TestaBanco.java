package Programa;

import Entidades.*;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente clienteGeovana = new Cliente();
		clienteGeovana.nome = "Geovana";
		clienteGeovana.cpf = "123.456.789-10";
		clienteGeovana.profissao = "Estudante";
		
		Conta contaGeovana = new Conta();
		contaGeovana.titular = clienteGeovana;
		contaGeovana.deposita(100.00);
		System.out.println("Titular da conta: " + contaGeovana.titular.nome);
		System.out.println("Saldo atual da conta: " + contaGeovana.saldo);
		System.out.println("---------------------------");
		System.out.println(contaGeovana.titular);
		System.out.println(clienteGeovana);
	}
}