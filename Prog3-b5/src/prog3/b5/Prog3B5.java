
package prog3.b5;
import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Prog3B5 {

  
    public static void main(String[] args) {
         double radio;
        String resultado =JOptionPane.showInputDialog("Introducir radio");
        radio=Double.parseDouble(resultado);
        Circulo circulo1 =new Circulo(radio);
        JOptionPane.showMessageDialog(null,"El area del circulo es: "+circulo1.calcularArea());
        JOptionPane.showMessageDialog(null,"La longuitud es: "+circulo1.calcularLongitud()); 
    }  
}
