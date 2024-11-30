package com.coderhouse;

public class Clase01 {

	public static void main(String[] args) {
		//Ejercicio 1.
		int edad = 35;

		//Ejercicio 2. 
		final int DIASSEMANA = 7;

		//Ejercicio 3. 
		double precioProducto = 15.30d;	

		//Ejercicio 4.			
		boolean aprobado = true;

		//Ejercicio 5.
		char inicialNombre = 'A';

		//Ejercicio 6. 
		int[] calificaciones = {0,1,2,3,4,5,6,7,8,9,10};

		//Ejercicio 7.		 
		String nombreApellido = "Juan Fernandez";

		//Ejercicio 8.
		float peso = 75.600f;

		//Ejercicio 9.
		final float pi = 3.14159265359f;

		//Ejercicio 10. 		
		final int MAXIMOESTUDIANTES = 50;			
		
		//Ejercicio 11.
		int valor1 = 15;
		int valor2 = 43;
		System.out.println("Suma de valor1 más valor2: "); 
		System.out.println(valor1 + valor2); 
		

		//Ejercicio 12.
		double valor3 = 74.5;
		double valor4 = 25.3;
		
		System.out.println("\nResta de valor3 menos valor4: ");			
		System.out.println(valor3 - valor4);		
		
		//Ejercicio 13.
		int valor5 = 12;
		int valor6 = 4;
		
		System.out.println("\nMultiplica el valor5 por valor6: "); 
		System.out.println(valor5 * valor6);
		
		//El ejercicio 14 no se como resolverlo, porque no lo vimos todavía. 
		

		//Ejercicio 15.
		System.out.println("\nMuestra el resto de la división entre valor5 por valor6: "); 
		System.out.println(valor5 % valor6);
		
		//Ejercicio 16.
		System.out.println("\nMuestra si el valor5 es mayor que valor6: "); 
		if ( valor5 > valor6) {
			System.out.println("Valor5 es mayor que Valor6"); 
		}
		
		//Ejercicio 17.
		valor5 = 25;
		valor6 = 2;

		System.out.println("\nSi es par devuelve 0, sino devuelve 1"); 
		System.out.println("Muestra si el valor5 es par, es par: " + valor5 + " ?"); 
		System.out.println(valor5 % valor6);
		
		//Ejercicio 18
		String cadena1 = "Papa";
		String cadena2 = "Papá";
		if ( cadena1 != cadena2) {
			System.out.println("\nCadena1 no es igual a Cadena2"); 
		}
		
		//Ejercicio 19
		int nota = 8; 
		if ( nota >= 6 ) {
			System.out.println("\nEl estudiante aprobó y su calificación es: " + nota);		
		}
		
		//Ejercicio 20
		int valor8 = 8; 
		if ( valor8 > 1 && valor8 < 10 ) {
			System.out.println("\nEl valor8 está entre 1 y 10, su valor es: " + valor8);		
		}
		
	}

}
