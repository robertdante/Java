import javax.swing.JOptionPane;

public class bucles {

    public static void main(String[] args) {

        int c = 1;
        double calificacionActual, mayor = 0, menor = 5;
        
        while (c <= 5) {

            calificacionActual = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificación " + c));

            if (calificacionActual > mayor) {

                mayor = calificacionActual;

            }

            else if (calificacionActual < menor) {

                menor = calificacionActual;

            }

            System.out.println("Calificación " + c + ":" + calificacionActual);
            
            c++;


        }

        System.out.println("La calificación mayor es: " + mayor);
        System.out.println("La calificación menor es: " + menor);
    }
    
}
