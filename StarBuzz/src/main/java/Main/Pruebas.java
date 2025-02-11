/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Beverages.DarkRoast;
import Beverages.Expresso;
import ClasesAbstractas.Beverages;
import Condiment.Chocolate;
import Condiment.Milk;
import Condiment.Soy;
import Condiment.WhippedCream;

/**
 *
 * @author nomar
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un Expresso sin ingredientes
        Beverages bebida = new Expresso();
        System.out.println(bebida.getDescripcion() + " ------ $" + bebida.getCosto());

        // Agregarle Milk
        bebida = new Milk(bebida);
        System.out.println(bebida.getDescripcion() + " ------ $" + bebida.getCosto());

        // Agregarle Chocolate
        bebida = new Chocolate(bebida);
        System.out.println(bebida.getDescripcion() + " ------ $" + bebida.getCosto());

        // Agregarle WhippedCream
        bebida = new WhippedCream(bebida);
        System.out.println(bebida.getDescripcion() + " ------ $" + bebida.getCosto());

        //  DarkRoast con Soy y Chocolate
        Beverages bebida2 = new Chocolate(new Soy(new DarkRoast()));
        System.out.println(bebida2.getDescripcion() + " ------ $" + bebida2.getCosto());
    }
        
}
    
