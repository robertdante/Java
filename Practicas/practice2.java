import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class practice2 {

    public static void main(String[] args) {

        String nombre;
        int nacimiento, edad;


        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su fecha de nacimiento"));

        edad = 2021 - nacimiento;

        JOptionPane.showMessageDialog(null, "Hola " + nombre + "," + " el año de nacimiento es: " + nacimiento + "," + " tu edad es: " + edad);

    }
    
}
