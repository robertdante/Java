package practicas;

import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dayOfWeek = scanner.nextInt();
		
		switch (dayOfWeek) {
			case 1:
				System.out.println("Es lunes de comedia");
				break;
			case 2:
				System.out.println("Martes de drama");
				break;
			case 3:
				System.out.println("Miercoles de acción");
				break;
			case 4:
				System.out.println("Jueves de animación");
				break;
			case 5:
				System.out.println("Viernes de terror");
				break;
			default:
				System.out.println("¿En qué día vives?");
			
		}
		
}
}
