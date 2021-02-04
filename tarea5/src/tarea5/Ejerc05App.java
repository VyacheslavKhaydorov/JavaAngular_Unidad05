package tarea5;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc05App {

	public static void main(String[] args) {
		//Variables
		int numero = 0;
		final int DIVISOR = 2;
		Scanner input = new Scanner(System.in);
		
		//Entrada de datos por teclado
		System.out.println("Introduce un número entero:");
		numero = input.nextInt();
		
		//Mostramos por consola si el número es divisible entre DIVISOR (2)
		if (numero % DIVISOR == 0)
			System.out.println("El número " + numero + " es divisible entre " + DIVISOR);
		else
			System.out.println("El número " + numero + " NO es divisible entre " + DIVISOR);

	}

}
