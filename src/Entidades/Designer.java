package entidades;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario()*0.1 + 150.00;
	}
}