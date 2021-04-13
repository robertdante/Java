package llamadaMetodos;
   
public class Usuario {

private String nombreCliente;
private int cantidad;
    
    public Usuario(String nom) {
    
            nombreCliente = nom;
            cantidad = 0;

    }

    public void ingresar(int m) {

        cantidad = cantidad + m;

    }

    public int retornoCantidad() {

        return cantidad;

    }

    public void visualizar() {

        System.out.println(nombreCliente + " Ingresado en cuenta " + cantidad);

    }

}    

