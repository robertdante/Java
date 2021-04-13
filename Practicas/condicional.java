import javax.swing.JOptionPane;
public class condicional {

    public static void main(String[] args) {

        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));

        if (edad <= 30) {

            JOptionPane.showMessageDialog(null, "Enhorabuena, eres joven");

        }

            else if (edad > 30 && edad <= 40) {

                JOptionPane.showMessageDialog(null, "Te estás haciendo mayor");
            }

            else {

                JOptionPane.showMessageDialog(null, "Lo siento, eres un viejo");
            }
        

    }
    
}
