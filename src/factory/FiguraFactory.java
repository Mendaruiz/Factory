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
public class FiguraFactory {
    public final static int CIRCULO = 0;

        public static Figura getFigura(int tipo, double lado) {
         switch (tipo) {
          case CIRCULO:
           return new Circulo(lado);
         }  
         return null;
        }
}
