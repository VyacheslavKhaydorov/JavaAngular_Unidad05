package tarea5;

import java.util.Scanner;	//Captura de datos por teclado

public class Ejerc06App {

	public static void main(String[] args) {
		//Variables y constantes
		final int IVA = 21;
		double precio = 0;
		Scanner input = new Scanner(System.in);
		
		//Entrada de datos por teclado
		System.out.println("Introduce el precio del producto:");
		precio = input.nextDouble();
		
		//Salida por consola
		System.out.println("El precio final del producto es: " + (precio + (precio / 100 * IVA)));

	}

}
