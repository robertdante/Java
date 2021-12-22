package practicas;

import javax.swing.JOptionPane;

public class numerosImpares {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		int impar = num%2;
		if (impar == 0) {
			System.out.println("El número introducido es par");
		}
		else {
			System.out.println("El número es impar");
		
		while (num > 0) {
			num--;
			int numero = num%2;
			if (numero != 0) {
		System.out.println(num);
		}
		
		}
		
	}

}
}
