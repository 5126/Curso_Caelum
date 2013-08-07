public class TestaErros {

	public static void main(String[] args) {
		System.out.println("Entrei com o main");
		metodo1();
		System.out.println("Sai do main");

	}

	private static void metodo1() {
		System.out.println("Entrei com o metodo 1 ");
		metodo2();
		System.out.println("Sai do metodo 1");

	}

	private static void metodo2() {
		System.out.println("Entrei no metodo 2 ");

		int[] a = new int[3];

		for (int i = 0; i < 3; i++) {
			try {
				a[i] = i;
				System.out.println(i);

			} catch (Exception e) {
				System.out.println("Tentou acessar a poisicao "
						+ e.getMessage() + " mas o tamanho maximo é "
						+ (a.length - 1));
			}
		}

		System.out.println("Sai do metodo 2");
	}

}
