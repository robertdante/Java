package Encapsulacion;


public class Trabajador extends Persona {


    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador();

        trabajador1.ayuda();
        
        trabajador1.setNombre("Paco");
        System.out.println("El trabajador se llama " + trabajador1.getNombre());


    }
    
}
