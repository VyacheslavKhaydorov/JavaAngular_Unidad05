package tarea5;

public class Ejerc09App {

	public static void main(String[] args) {
		//Variables y constantes
		final int VALOR_INICIAL = 1, VALOR_FINAL = 100, DIVISOR_1 = 2, DIVISOR_2 = 3;
		int numero = VALOR_INICIAL;
		
		//Mostramos por consola los números desde VALOR_INICIAL (1) hasta VALOR_FINAL (100)
		//divisibles entre DIVISOR_1 (2) y DIVISOR_2 (3)
		do {
			if ((numero % DIVISOR_1 == 0) && (numero % DIVISOR_2 == 0))
				System.out.println(numero);
			numero++;
		} while (numero <= VALOR_FINAL);

	}

}
