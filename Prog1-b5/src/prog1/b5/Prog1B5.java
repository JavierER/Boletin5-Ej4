
package prog1.b5;
import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Prog1B5 {

   
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        JOptionPane.showMessageDialog(null," Velocidad actual = " + coche1.getVelocidad() + " km/h");
        String respuesta = JOptionPane.showInputDialog("Velocidad a aumentar : ");
        coche1.acelerar(Integer.parseInt(respuesta));
        JOptionPane.showMessageDialog(null, "Velocidad aumentada = " + coche1.getVelocidad() + " km/h");
        String respuesta2 = JOptionPane.showInputDialog("Velocidad a reducir : ");
        coche1.frenar(Integer.parseInt(respuesta2));
        JOptionPane.showMessageDialog(null, "Velocidad tras frenar = " + coche1.getVelocidad() + " km/h");
    }
    
}
