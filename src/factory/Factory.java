/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author David
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipo = 0;
        double lado = 5;  

        Figura figura = FiguraFactory.getFigura(tipo, lado);
        System.out.println(figura.getArea());
    
    }
    
}
