package programa;

import entidades.Cliente;
import entidades.Conta;

public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		/*conta.setNumero(1337);
		System.out.println("Numero da conta: " + conta.getNumero());*/
		
		Cliente cliente = new Cliente();
		cliente.setNome("Geovana");
		conta.setTitular(cliente);
		System.out.println("Nome do titular: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Estudante");
		System.out.println("Profissao: " + conta.getTitular().getProfissao());
	}
}