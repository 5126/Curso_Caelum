public class ContaCorrente extends Conta implements Tributavel {

	public void atualiza(double taxa) {
		this.deposita(getSaldo() * taxa * 2);

	}

	public void saca(double valor) {
		super.saca(valor);

	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou depositar "
					+ "um valor negativo ");

		} else {
			this.saldo +=  valor - 0.10;

		}

	}

}
