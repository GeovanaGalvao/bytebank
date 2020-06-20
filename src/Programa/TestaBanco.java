package programa;

import entidades.*;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente clienteGeovana = new Cliente();
		clienteGeovana.setNome("Geovana");
		clienteGeovana.setCpf("123.456.789-10");
		clienteGeovana.setProfissao("Estudante");
		
		Conta contaGeovana = new ContaCorrente();
		contaGeovana.setTitular(clienteGeovana);
		contaGeovana.deposita(100.00);
		System.out.println("Titular da conta: " + contaGeovana.getTitular().getNome());
		System.out.println("Saldo atual da conta: " + contaGeovana.getSaldo());
		System.out.println("---------------------------");
		System.out.println(contaGeovana.getTitular());
		System.out.println(clienteGeovana);
	}
}