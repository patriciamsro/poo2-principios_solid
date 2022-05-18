package solucaoPrincipioLSP;

public class Quadrado implements Quadrilatero {

	Double altura;

	public Quadrado(Double altura) {
		this.altura = altura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double area() {
		return altura * altura;
	}
	
}
