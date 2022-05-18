package violacaoPrincipioLSP;

public class Quadrado1 extends Retangulo1 {

	public Quadrado1(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		try {
			if (getBase() != getAltura())
				throw new Exception("Não é um quadrado");
			return getAltura() * getBase();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0.0;
	}

}
