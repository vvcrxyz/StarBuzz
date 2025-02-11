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
public class Milk extends Condiment {
    
    public Milk(Beverages beverage) {
        super(beverage);
    }

    @Override
    public String getDescripcion() {
        return beverage.getDescripcion() + ",With Milk";
    }

    public double getCosto() {
        return beverage.getCosto() + 5.0;
    }
}
