import java.util.Scanner;

public class Persona {

    private Scanner teclado;
    private String nombre;
    private int edad;


    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();

    }
    
    public void inicializar() {

        teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Introduce tu edad");
        edad = teclado.nextInt();

    }

    public void imprimir() {

        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);

    }

    public void esMayorEdad() {

        if (edad >= 18 && edad <= 65) {

            System.out.println("Te encuentras en edad de trabajar");

        }

        else if (edad > 65) {
    
            System.out.println("Estás jubilado");

        }

        else {

            System.out.println("Eres demasiado pequeño para trabajar");

        }

    }


}
