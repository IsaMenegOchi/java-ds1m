package retangulo;

public class Area_perimetro {

	public static void main(String[] args) {
		
		int supeinfe = 8;
		int lados = 5;
		int area;
		int perimetro;
		
		
		area = lados * supeinfe;
		perimetro = (lados * 2) + (supeinfe * 2);
		
		System.out.println("Area do retangulo: " + area);
		System.out.println("Perimetro: " + perimetro);

		
	}

}
