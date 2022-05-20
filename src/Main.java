import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner (System.in);
		double Fahrenheit = 0; 
		double Kelvin = 0;
		double Reaumur = 0;
		double Rankine = 0;
		
		
		System.out.println("Insira os graus Celsius :");
			int Celsius = sc.nextInt();
			
			
			sc.close();
			
			Fahrenheit = Celsius *1.8 +32;
			Kelvin = Celsius + 273.15;
			Reaumur = Celsius*0.8;
			Rankine = Celsius*1.8 + 32+ 459.67;
			
			
			System.out.println("Temperatura em Fahrenheit"+  Fahrenheit);
			System.out.println("Temperatura em Kelvin" +     Kelvin);
			System.out.println("Temperatura em Reaumur" +    Reaumur);
			System.out.println("Temperatura em Rankine" +    Rankine);
			
			
	}

}
