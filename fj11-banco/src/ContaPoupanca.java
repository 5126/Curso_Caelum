public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) {
		this.deposita(getSaldo() * taxa * 3);

	}

	public void saca(double valor) {
		super.saca(valor);

	}

}
