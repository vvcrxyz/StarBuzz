/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beverages;

import ClasesAbstractas.Beverages;

/**
 *
 * @author nomar
 */
public class HouseBlend extends Beverages {
    
    public HouseBlend() {
        descripcion = "House Blend Coffee";
    }

    @Override
    public double getCosto() {
        return 30.0;
    }
    
}
