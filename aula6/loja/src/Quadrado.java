public class Quadrado implements AreaCalculavel {

	private int lado;

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

	public double calculaArea() {
		return this.lado * this.lado;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}
