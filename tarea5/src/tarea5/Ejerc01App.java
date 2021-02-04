package tarea5;

public class Ejerc01App {

	public static void main(String[] args) {
		//Variables
		int a = 2, b = 4;
		
		//Mostramos cual es la variable numérica mayor
		if (a > b) {
			System.out.println("La variable a(" + a + ") es mayor a la variable b(" + b + ").");
		}
		else if (b > a) {
			System.out.println("La variable b(" + b + ") es mayor a la variable a(" + a + ").");
		}
		else
			System.out.println("Ambas variables numéricas son equivalentes ("
					+ a + "=" + b + ").");

	}

}
