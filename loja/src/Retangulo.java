public class Retangulo implements AreaCalculavel {
	
	private double largura;
	private double comprimento;
	
	public Retangulo(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	/* (non-Javadoc)
	 * @see AreaCalculavel#getArea()
	 */
	@Override
	public double getArea() {
		return largura * comprimento;
		
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return largura * comprimento;
	}
	

}
