package tarea5;

import java.util.Scanner;

public class Ejerc12App {

	public static void main(String[] args) {
		//Variables y constantes
		final String CONTRASEÑA = "holiholi";
		String contraseñaUsuario = "";
		final int INTENTOS_MAX = 3;
		int intentos = 0;
		boolean contraseñaCorrecta = false;
		
		Scanner input = new Scanner(System.in);
		
		//Captura de datos
		while (intentos < INTENTOS_MAX && contraseñaCorrecta == false) {
			System.out.println("Introduce la contraseña: ");
			contraseñaUsuario = input.nextLine();
			if (contraseñaUsuario.equals(CONTRASEÑA)) {
				contraseñaCorrecta = true;
			}
			else {
				intentos++;
				System.out.println("La contraseña introducida no es correcta! "
						+ "Quedan " + (INTENTOS_MAX - intentos) + " intentos");
			}
		}
		
		//Salida por consola
		if (contraseñaCorrecta)
			System.out.println("Contraseña correcta!");
		else
			System.out.println("No lo logró! :-(");

	}

}
