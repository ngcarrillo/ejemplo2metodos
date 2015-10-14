/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author ngarciacarrillo
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(3,5);
        System.out.println("A base e " +rec1.getBase() +"\nA altura e " +rec1.getAltura());
        System.out.println("A area do rectangulo base 3 e altura 5 es "+rec1.calcularArea(3,5));
        System.out.println ("é o perimetro é "+rec1.calcularPerimetro());
    }
    
}
