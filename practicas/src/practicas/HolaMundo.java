package practicas;

import javax.swing.JOptionPane;

public class HolaMundo {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de veces que quieres imprimir el saludo"));
		if (numero == 1) {
			
			System.out.println("Hola Mundo");
			}
		else if (numero == 2) {
			System.out.println("Hola Mundo");
			System.out.println("Hola Mundo");
		}
	}

}
