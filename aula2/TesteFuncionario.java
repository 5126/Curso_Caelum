class TesteFuncionario{

	public static void main(String[] args){

		Funcionario f1 = new Funcionario();

		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);

		Funcionario f2 = new Funcionario();
		
		f2.nome = "Hugo";
		f2.salario = 100;
		f2.recebeAumento(50);

		if(f1 == f2){
		
			System.out.println("Iguais");

		}else{

			System.out.println("Diferentes");

		}


		System.out.println("Salario atual:" +f1.salario);
		System.out.println("Ganho anual:" + f1.calculaGanhoAnual());
	}

}
