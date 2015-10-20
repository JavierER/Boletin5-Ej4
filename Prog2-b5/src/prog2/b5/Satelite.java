/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.b5;

/**
 *
 * @author Javii
 */
public class Satelite {
    private double meridiano;
    private double paralelo ;
    private double distanciaATierra;

public Satelite (){}
public Satelite (double merd, double prl,double dT){
    meridiano = merd;
    paralelo = prl;
    distanciaATierra = dT;
}
public void verPosicion ( ) {

System.out.println("Satelite en el paralelo" +paralelo + "meridiano " + meridiano+ " a una distancia de la tierra "+ distanciaATierra);
}

}
