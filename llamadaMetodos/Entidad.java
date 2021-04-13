package llamadaMetodos;

public class Entidad {

private Usuario usuario1, usuario2, usuario3;    

    public static void main(String[] args) {

        Entidad sucursal = new Entidad();
        sucursal.manipular();
        sucursal.fondos();

    }

    public Entidad() {

        usuario1 = new Usuario("Paco Plaza");
        usuario2 = new Usuario("Mariano Rajoy");
        usuario3 = new Usuario("Emiliano Zapata");

    }

    public void manipular() {

        usuario1.ingresar(2000);
        usuario2.ingresar(1000);
        usuario3.ingresar(500);

    } 

    public void fondos() {

        int t = usuario1.retornoCantidad() + usuario2.retornoCantidad() + usuario3.retornoCantidad();
        System.out.println("Total de efectivo ingresado " + t);
        usuario1.visualizar();
        usuario2.visualizar();
        usuario3.visualizar();

    }
    
}
