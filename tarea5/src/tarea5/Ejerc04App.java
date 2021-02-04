package tarea5;

import java.util.Scanner;	//Captura de datos por teclado

import java.math.*;		//Para usar el método pow (potencias)	

public class Ejerc04App {

	public static void main(String[] args) {
		//Variables y constantes
		double area = 0, radioNum = 0;
		String radioCadena;
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Cual es el radio del círculo?");
		radioCadena = input.nextLine();
		radioNum = Double.parseDouble(radioCadena);
		
		//Calculamos area
		area = PI * Math.pow(radioNum,2);
		
		//Salida de datos por consola
		System.out.println("El area del círculo es: " + area);

	}

}
