public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
		
	public void adiciona(Tributavel sv) {
		System.out.println("Adicionando tributavel:" + sv);
		
		this.total += sv.calculaTributos();
	}
	
	public double getTotal() {
		return this.total;
	}

}
