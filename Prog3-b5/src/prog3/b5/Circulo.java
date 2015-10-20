
package prog3.b5;

/**
 *
 * @author Javii
 */

public class Circulo {
    private double radio;
    private final double PI=3.14;
public Circulo(){}
public Circulo(double radio){
    this.radio=radio;
}
public void setRadio(){
    this.radio=radio;
}
public double getRadio(){
    return radio;
}
public double calcularArea(){
    return PI*Math.pow(radio,2);
}
public double calcularLongitud(){
    return PI*radio*2;
}
}

