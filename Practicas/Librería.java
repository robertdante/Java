import javax.swing.JOptionPane;

public class Librería {

    public static void main(String[] args) {

        int totalPeliculas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de películas que quieres almacenar "));
        String películas[] = new String[totalPeliculas];

        if (totalPeliculas <= 0) {

            JOptionPane.showMessageDialog(null, "Error.\n" + "Introduce un número superior a 0");

        }

        for (int c = 0; c < películas.length; c++) {

            películas[c] = JOptionPane.showInputDialog("Introduce título " + (c+1));

        }

        int totalActores = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de actores que quieres almacenar"));
        String actores[] = new String[totalActores];

        if (totalActores <= 0) {

            JOptionPane.showMessageDialog(null, "Error.\n" + "Introduce un número superior a 0");

        }

        for (int c = 0; c < actores.length; c++) {

            actores[c] = JOptionPane.showInputDialog("Introduce actor " + (c+1));

        }

        for (String film:películas) {

            System.out.println(film);

        }

        for (String actor:actores) {

            System.out.println(actor);

        }

    }
    
}
