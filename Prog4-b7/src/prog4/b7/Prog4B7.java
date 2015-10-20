
package prog4.b7;
import javax.swing.JOptionPane;
/**
 *
 * @author Javii
 */
public class Prog4B7 {

 
    public static void main(String[] args) {
        int pulpo;
        int patatas;
       Materias restaurante = new Materias();
       pulpo = Integer.parseInt(JOptionPane.showInputDialog("Introducir cantidad de pulpo en kg : "));
       patatas = Integer.parseInt(JOptionPane.showInputDialog("Introducir cantidad de patatas en kg : "));
       restaurante.añadirPulpo(pulpo);
       restaurante.añadirPatatas(patatas);
       JOptionPane.showMessageDialog(null,"3 clientes que pueden comer pulpo hoy = "+ restaurante.PulpoClientes());
       JOptionPane.showMessageDialog(null,"3 que pueden comer patatas hoy = "+ restaurante.PatatasClientes());
  
   
    }
    
}
