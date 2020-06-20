package programa;

import entidades.*;

public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();		
		Cliente cliente = new Cliente();
		cliente.setNome("Geovana");
		conta.setTitular(cliente);
		System.out.println("Nome do titular: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Estudante");
		System.out.println("Profissao: " + conta.getTitular().getProfissao());
	}
}