package Encapsulacion;


public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    
    
    public Persona() {

      nombre = "Rober";
      apellido = "Gil";
      edad = 32;

    }

    public void ayuda() {

        System.out.println("¿En qué puedo ayudarte?");
        
    }

    public String getApellido() {

        return apellido;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre; 

    }

    public int getEdad() {

        return edad;

    }

    
}
