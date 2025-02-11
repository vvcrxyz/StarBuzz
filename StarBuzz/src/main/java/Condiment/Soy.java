/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condiment;

import ClasesAbstractas.Beverages;
import ClasesAbstractas.Condiment;

/**
 *
 * @author nomar
 */
public class Soy extends Condiment {
    
    public Soy(Beverages beverage) {
        super(beverage);
    }

    @Override
    public String getDescripcion() {
        return beverage.getDescripcion() + ", Soy";
    }

    public double getCosto() {
        return beverage.getCosto() + 7.0;
    }
    
}
