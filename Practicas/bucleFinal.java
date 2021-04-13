import javax.swing.JOptionPane;

public class bucleFinal {

    public static void main(String[] args) {

        int total = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de películas que quieres almacenar "));
        String películas[] = new String[total];

        if (total <= 0) {

            JOptionPane.showMessageDialog(null, "Error.\n" + "Introduce un número superior a 0");

        }

        for (int c = 0; c < películas.length; c++) {

            películas[c] = JOptionPane.showInputDialog("Introduce título " + (c+1));

        }

        for (String film:películas) {

            System.out.println(film);

        }

    }
    
}
