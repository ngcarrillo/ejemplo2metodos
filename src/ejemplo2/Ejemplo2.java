/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base, altura;
        String baseIntrodu = JOptionPane.showInputDialog("Introduce la base");
        base = Float.parseFloat(baseIntrodu);
        String alturaIntrodu = JOptionPane.showInputDialog("Introduce la altura");
        altura = Float.parseFloat(alturaIntrodu);
        Rectangulo rec1 = new Rectangulo(base, altura); 
        //System.out.println("A base e " +rec1.getBase() +"\nA altura e " +rec1.getAltura());
        //System.out.println("A area do rectangulo es "+rec1.calcularArea(base, altura));
        //System.out.println ("é o perimetro é "+rec1.calcularPerimetro());
        JOptionPane.showMessageDialog(null,"A base e " +rec1.getBase() +"\nA altura e " +rec1.getAltura());
        JOptionPane.showMessageDialog(null,+rec1.calcularArea(base,altura),"EL AREA ES ",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,+rec1.calcularPerimetro(),"EL PERIMETRO ES ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
