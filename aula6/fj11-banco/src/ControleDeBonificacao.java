public class ControleDeBonificacao {
	
	private double totalDeBonificacoes = 0;
	
		public void registra(Funcionario f) {
			System.out.println("Adicionando bonificaca fo do funcionário:" + f);
			this.totalDeBonificacoes += f.getBonificacao();
		}
		
		public double getTotalDeBonificacoes() {
			return this.totalDeBonificacoes;
		}
		
}
