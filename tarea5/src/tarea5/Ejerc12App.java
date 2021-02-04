package tarea5;

import java.util.Scanner;

public class Ejerc12App {

	public static void main(String[] args) {
		//Variables y constantes
		final String CONTRASE�A = "holiholi";
		String contrase�aUsuario = "";
		final int INTENTOS_MAX = 3;
		int intentos = 0;
		boolean contrase�aCorrecta = false;
		
		Scanner input = new Scanner(System.in);
		
		//Captura de datos
		while (intentos < INTENTOS_MAX && contrase�aCorrecta == false) {
			System.out.println("Introduce la contrase�a: ");
			contrase�aUsuario = input.nextLine();
			if (contrase�aUsuario.equals(CONTRASE�A)) {
				contrase�aCorrecta = true;
			}
			else {
				intentos++;
				System.out.println("La contrase�a introducida no es correcta! "
						+ "Quedan " + (INTENTOS_MAX - intentos) + " intentos");
			}
		}
		
		//Salida por consola
		if (contrase�aCorrecta)
			System.out.println("Contrase�a correcta!");
		else
			System.out.println("No lo logr�! :-(");

	}

}
