package entidades;

import util.*;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2); //Regra de ser cobrado 20 centavos por saque.
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo()*0.01;
	}
}