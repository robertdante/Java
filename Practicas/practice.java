import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingresa tu edad ");
        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre + "," + " tu edad es " + edad);
        

    }
    
}