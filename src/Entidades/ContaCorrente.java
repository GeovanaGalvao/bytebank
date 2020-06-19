package entidades;

public class ContaCorrente extends Conta {

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
}