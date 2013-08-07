public class Funcionario {

	// atributos
	private int id;
	protected String nome;
	protected String cpf;
	private double salario;
	private String departamento;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	private String cargo = "Comum";

	// construtores
	public Funcionario() {
	}

	public Funcionario(int id, String nome, String departamento,
			double salario, String dataEntrada, String rg, boolean estaNaEmpresa) {
		this.id = id;
		this.nome = nome;

	}

	// metodos
	public double getBonificacao() {
		return this.salario * 0.10;
	}

	public void recebeAumento(double aumento) {

		aumento = salario + aumento;
	}

	public double getGanhoAnual() {

		return this.salario * 12;

	}

	public void demite() {

	}

	public void mostra() {
		System.out.println("Nome" + this.nome);
		System.out.println("Salario Anual" + this.getGanhoAnual());
		System.out.println("Data de Entrada" + this.dataEntrada);

	}

	// GET
	public double getSalario() {
		return this.salario;
	}

	public String getNome() {
		return this.nome;
	}

}
