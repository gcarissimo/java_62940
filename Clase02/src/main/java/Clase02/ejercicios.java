package Clase02;

public class ejercicios {
	public static void main(String[] args) {
		int numero1 = 12;
		if ( numero1 > 0 ) {
			System.out.println("\nEs positivo");
		} else {
			System.out.println("\nNo es positio");
		}
		
		int edad = 19;
		if ( edad >= 18 ) {
			System.out.println("\nEs mayor de edad");
		} else {
			System.out.println("\nNo es mayor de edad");
		}
		
		int numero2 = 12;
		if ( numero2 % 2 == 0) {
			System.out.println("\nEl numero es par");
		} else {
			System.out.println("\nEl numero no es par");
		}
		
		String cadena1 = "";
		
		if ( cadena1.isEmpty() ) {
			System.out.println("\nLa cadena está vacía");
		}
		
		
	}
}
