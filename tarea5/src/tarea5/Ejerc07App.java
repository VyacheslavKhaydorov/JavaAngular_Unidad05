package tarea5;

public class Ejerc07App {

	public static void main(String[] args) {
		//Variables y constantes
		final int VALOR_INICIAL = 1, VALOR_FINAL = 100;
		int numero = VALOR_INICIAL;
		
		//Mostramos por consola los números desde VALOR_INICIAL (1) hasta VALOR_FINAL (100)
		do {
			System.out.println(numero);
			numero++;
		} while (numero <= VALOR_FINAL);

	}

}
