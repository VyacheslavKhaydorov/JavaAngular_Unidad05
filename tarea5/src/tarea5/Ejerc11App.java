package tarea5;

import java.util.Scanner;

public class Ejerc11App {

	public static void main(String[] args) {
		//Variables
		String diaSemana = "";
		boolean diaLaboral = true, error = false;
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por pantalla
		System.out.println("Escribe un día de la semana:");
		diaSemana = input.nextLine();
		diaSemana= diaSemana.toLowerCase();	//Para evitar errores con mayúsculas
		
		//Comprobamos si es un día laborable
		switch (diaSemana) {
			case "lunes":
				diaLaboral = true;
				break;
			case "martes":
				diaLaboral = true;
				break;
			case "miercoles":
				diaLaboral = true;
				break;
			case "jueves":
				diaLaboral = true;
				break;
			case "viernes":
				diaLaboral = true;
				break;
			case "sabado":
				diaLaboral = false;
				break;
			case "domingo":
				diaLaboral = false;
				break;
			default:
				error = true;
		}
		
		//Salida por consola
		if (error)
			System.out.println("Lo que has escrito no es un día de la semana :S");
		else {
			if (diaLaboral)
				System.out.println("Es un día laboral.");
			else
				System.out.println("Es festivo! :D");
		}

	}

}
