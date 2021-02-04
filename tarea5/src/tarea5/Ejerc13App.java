package tarea5;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.math.*;

public class Ejerc13App {

	public static void main(String[] args) {
		//Variables
		int valor1 = 0, valor2 = 0, resultadoSinDecimales = 0;
		double resultadoConDecimales = 0;
		String signoAritmetico = "";
		boolean error = false;
		
		Scanner input = new Scanner(System.in);
		
		//Captura de datos por consola
		System.out.println("Introduce el primer valor de la operación:");
		valor1 = input.nextInt();
		System.out.println("Introduce el segundo valor de la operación:");
		valor2 = input.nextInt();
		input.nextLine();	//Para consumir el salto de línea
		System.out.println("Introduce el signo aritmético de la operación\n"
				+ "(+ para sumar, - para restar, * para multiplicar, / para dividir,\n"
				+ " ^ para elevar el primer valor a la potencia del segundo, y % para el"
				+ " módulo de la división):");
		signoAritmetico = input.nextLine();
		
		//Operamos con los datos
		switch (signoAritmetico) {
			case "+":
				resultadoSinDecimales = suma(valor1, valor2);
				break;
			case "-":
				resultadoSinDecimales = resta(valor1, valor2);
				break;
			case "*":
				resultadoSinDecimales = multiplicacion(valor1, valor2);
				break;
			case "/":
				resultadoConDecimales = division(valor1, valor2);
				break;
			case "^":
				resultadoSinDecimales = potencia(valor1, valor2);
				break;
			case "%":
				resultadoSinDecimales = modulo(valor1, valor2);
				break;
			default:
				error = true;
		}
		
		//Mostramos resultado con ventana emergente
		if (error)
			JOptionPane.showMessageDialog(null, "El signo aritmético introducido para"
					+ " realizar la operación no se reconoce :-(");
		else if (signoAritmetico.equals("/"))
			JOptionPane.showMessageDialog(null, valor1 + " " + signoAritmetico + " "
					+ valor2 + " = " + resultadoConDecimales);
		else
			JOptionPane.showMessageDialog(null, valor1 + " " + signoAritmetico + " "
					+ valor2 + " = " + resultadoSinDecimales);
			
	}
	
	//Métodos para las operaciones aritméticas
	public static int suma (int a, int b) {
		return (a + b);
	}
	
	public static int resta (int a, int b) {
		return (a - b);
	}
	
	public static int multiplicacion (int a, int b) {
		return (a * b);
	}
	
	public static double division (int a, int b) {
		if (b == 0) {
			JOptionPane.showMessageDialog(null, "No se puede dividir entre 0!");
			System.exit(0);
		}	
		return ((double)a / (double)b);
	}
	
	public static int potencia (int a, int b) {
		return ((int)Math.pow(a, b));
	}
	
	public static int modulo (int a, int b) {
		return (a % b);
	}
	
}
