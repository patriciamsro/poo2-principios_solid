package violacaoPrincipioLSP;

public class Retangulo1 {

	private double base;
	private double altura;
	
	public Retangulo1(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}
	
}
