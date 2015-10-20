package prog4.b7;

/**
 *
 * @author Javii
 */
public class Materias {
    private int patatas;
    private int pulpo;
    private final int pulpo3Clientes = 2;
    private final int patatas3Clientes = 1;
    
    public void añadirPulpo(int kilosPulpo){
        pulpo = kilosPulpo;   
    }
    public void añadirPatatas(int kilosPatata){
        patatas = kilosPatata;
    }
    public int amosarPulpo(int kilosPulpo){
        return kilosPulpo;
    }
    public int amosarPatatas(int kilosPatata){
        return kilosPatata;
    }
    public int PulpoClientes(int pulpo){
        ;
        return pulpo/3;    
    }
    public int PatatasClientes (int patatas){
        
        return patatas/3;
}
}