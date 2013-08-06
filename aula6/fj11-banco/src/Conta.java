public abstract class Conta {

	private double saldo;

	public void deposita(double valor) {
		// TODO Auto-generated method stu
		this.saldo += valor;

	}

	public abstract void atualiza(double taxa);

	public void saca(double valor) {
		this.saldo -= valor;

	}

	public double getSaldo() {
		return saldo;
	}

}
