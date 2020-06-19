package entidades;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 150.00;
	}
}