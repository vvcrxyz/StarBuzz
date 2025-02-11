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
public class WhippedCream extends Condiment {
    
    public WhippedCream(Beverages beverage) {
        super(beverage);
    }

    @Override
    public String getDescripcion() {
        return beverage.getDescripcion() + ",With WhippedCream";
    }

    public double getCosto() {
        return beverage.getCosto() + 10.0;
    }
    
}
