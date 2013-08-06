public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(3, 2);
		imprimeArea(retangulo);
		
		Quadrado quadrado = new Quadrado(10);
		imprimeArea(quadrado);
	}

	private static void imprimeArea(AreaCalculavel a) {
		System.out.println(a.calculaArea());
	}

}
