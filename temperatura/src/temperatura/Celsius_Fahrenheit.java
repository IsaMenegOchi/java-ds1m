package temperatura;

public class Celsius_Fahrenheit {

	public static void main(String[] args) {

		float celcius = 25f;
		float f;
		final float x = 9f;
		final float y = 160f;
		final float z = 5f; 
		
		f = (x * celcius + y) / z;
		
		System.out.println("A temperatura de 25°C convertida em Fahrenheit é " + f + "°F");
	}

}
