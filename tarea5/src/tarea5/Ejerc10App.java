package tarea5;

import java.util.Scanner;

public class Ejerc10App {

	public static void main(String[] args) {
		//Variables
		int numeroVentas = 0;
		double valorVenta = 0, valorTotalVentas = 0;
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por pantalla
		System.out.println("Cuántas ventas has realizado?");
		numeroVentas = input.nextInt();
		
		//Calculamos el total de las ventas
		for (int i = 0; i < numeroVentas; i++) {
			System.out.println("Introduce el valor de la venta " + (i+1) + ":");
			valorVenta = input.nextDouble();
			valorTotalVentas += valorVenta;
		}
		
		//Salida por consola
		System.out.println("El valor total de las ventas es de " + valorTotalVentas);

	}

}
