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
public class Decaf extends Beverages {
    
    public Decaf() {
        descripcion = "Expresso Coffee";
    }

    @Override
    public double getCosto() {
        return 35.0;
    }
    
}
