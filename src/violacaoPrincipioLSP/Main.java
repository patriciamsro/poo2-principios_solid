package violacaoPrincipioLSP;

public class Main {

	public static void main(String[] args) {

		Retangulo1 retangulo = new Retangulo1(4.0, 5.0);
		System.out.println("Área do retângulo: " + retangulo.area());
	
		Retangulo1 quadrado = new Quadrado1(4.0, 4.0);
		System.out.println("Área do quadrado: " + quadrado.area());
	}

}
