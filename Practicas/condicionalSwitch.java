import javax.swing.JOptionPane;

public class condicionalSwitch {

    public static void main(String[] args) {

        int dato, figura;
        double base, altura, lado, area, perimetro;

        dato = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas calcular?\n" 
                + "1.Area\n2.Perimetro\n(Escribe solo el número)"));

        if (dato == 1) {

            figura = Integer.parseInt(JOptionPane.showInputDialog("¿De qué figura deseas calcular el área?\n" +
            "1.Triángulo\n2.Cuadrado\n3.Rectángulo\n(Escribe solo el número)"));

            switch(figura) {

                case 1:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
                    area = (base * altura)/2;
                    JOptionPane.showMessageDialog(null, "El área del triángulo es " + area);
                    break;

                case 2:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado"));
                    area = lado*4;
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es " + area);
                    break;
                    
                case 3:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
                    area = base * altura;
                    JOptionPane.showMessageDialog(null, "El área del rectángulo es " + area);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "La opción escogida no es válida");
                    break;    
                 
            }

        }   
        
        else if (dato == 2) {

            figura = Integer.parseInt(JOptionPane.showInputDialog("¿De qué figura deseas calcular el perímetro?\n" +
            "1.Triángulo\n2.Cuadrado\n3.Rectángulo\n(Escribe solo el número)"));

            switch(figura) {

                case 1:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado"));
                    perimetro = lado*3;
                    JOptionPane.showMessageDialog(null, "El perímetro del triángulo es " + perimetro);
                    break;

                case 2:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado"));
                    perimetro = lado*4;
                    JOptionPane.showMessageDialog(null, "El perímetro del cuadrado es " + perimetro);
                    break;
                    
                case 3:
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la base"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
                    perimetro = base*2 + altura*2;
                    JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es " + perimetro);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "La opción escogida no es válida");
                    break;    
                 
            }

        }

        else {

            JOptionPane.showMessageDialog(null, "La opción introducida no es válida");
        }
  
    }
    
}
