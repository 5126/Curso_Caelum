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

}
