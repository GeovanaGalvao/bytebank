package Programa;

import Entidades.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Geovana");
		funcionario.setCpf("123.456.789-10");
		System.out.println("Funcionario\nNome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf() + 
				"\nSalario: R$" + funcionario.getSalario());
	}
}