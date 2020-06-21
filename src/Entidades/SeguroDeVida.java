package entidades;

import util.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double getValorImposto() {
		return 42;//Porque sim.
	}
}