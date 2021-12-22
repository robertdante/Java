package practicas;

import javax.swing.JOptionPane;

public class mayorMenor {
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
			
			else {
				
			System.out.println(num1 + " es menor que " + num2);
			}
		
	}

}
