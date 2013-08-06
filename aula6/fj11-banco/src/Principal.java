public class Principal {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(577.37);

		System.out.println(conta.getSaldo());

		ContaCorrente contaCorrente = new ContaCorrente();

	}

}
