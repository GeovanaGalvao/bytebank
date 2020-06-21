package programa;

import entidades.*;
import util.ControleBonificacao;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Geovana");
		gerente.setCpf("123.456.789-10");
		ControleBonificacao.registra(gerente);		
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes() +
				"\n-------------------------");
		
		Funcionario editorDeVideo = new EditorDeVideo();
		editorDeVideo.setNome("Carol");
		editorDeVideo.setCpf("987.654.321-00");
		ControleBonificacao.registra(editorDeVideo);		
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes() +
				"\n-------------------------");
		
		Funcionario designer = new Designer();
		designer.setNome("Marcela");
		designer.setCpf("012.345.678-90");
		ControleBonificacao.registra(designer);		
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes());
	}
}