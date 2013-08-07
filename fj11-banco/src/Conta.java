public abstract class Conta {

	public double saldo;

	public void deposita(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException();
			
		}else {
			this.saldo += valor;
			
		}
		
	}

	public abstract void atualiza(double taxa);

	public void saca(double valor) {
		this.saldo -= valor;

	}

	public double getSaldo() {
		return saldo;
	}

}
