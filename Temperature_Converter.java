import java.util.Scanner;

public class Temperature_Converter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double celsius,fahrenheit,kelvin;
		
		System.out.println("Enter temperatur in celsius");
		celsius = sc.nextDouble();
		
		fahrenheit = (celsius*1.8)+32;
		kelvin = celsius + 273.15;
		
		System.out.println("Temperature in Kelvin "+ kelvin);
		System.out.println("Temperature in fahrenheit "+ fahrenheit);
	}

}
