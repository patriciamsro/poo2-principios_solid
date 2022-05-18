package solucaoPrincipioLSP;

public class Main {

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(4.0, 5.0);
		System.out.println("Área do retângulo: " + retangulo.area());
	
		Quadrado quadrado = new Quadrado(4.0);
		System.out.println("Àrea do quadrado: "+ quadrado.area());
	}

}
