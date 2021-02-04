package tarea5;

import javax.swing.JOptionPane;	//Para la ventana emergente

public class Ejerc03App {

	public static void main(String[] args) {
		//Variables
		String nombre = "";
		
		//Consulta del nombre del usuario con ventana emergente
		nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		//Salida por pantalla por ventana emergente
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

	}

}
