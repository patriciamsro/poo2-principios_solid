package solucaoPrincipioLSP;

public class Retangulo implements Quadrilatero {

	Double base;
	Double altura;
	
	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double area() {
		return base * altura;
	}
	
}
