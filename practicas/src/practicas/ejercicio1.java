package practicas;

import javax.swing.JOptionPane;

public class ejercicio1 {
	public static void main(String[] args) {
		int segundos = Integer.parseInt(JOptionPane.showInputDialog("Teclea una cantidad en segundos"));
		
		int minutos = segundos/60;
		
		int horas = minutos/60;
		
		
		System.out.println("Minutos introducidos " + minutos);
		System.out.println("Horas introducidas " + horas);
	}

}
