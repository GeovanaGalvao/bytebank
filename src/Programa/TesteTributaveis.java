package programa;

import entidades.*;
import util.*;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(222,333);
		contaCorrente.deposita(1000.00);
		
		Tributavel seguroDeVida = new SeguroDeVida();
		CalculadorDeImposto.registraTributavel(contaCorrente);
		System.out.println(CalculadorDeImposto.getTotalImposto() + "\n----");
		CalculadorDeImposto.registraTributavel(seguroDeVida);
		System.out.println(CalculadorDeImposto.getTotalImposto() + "\n");
		
	}
}