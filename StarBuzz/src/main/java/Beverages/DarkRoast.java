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
public class DarkRoast extends Beverages {
    
    public DarkRoast(){
        descripcion = "Dark Roast Coffee";
    }
    
    @Override
    public  double getCosto(){
        return 30.0;
    }
}
