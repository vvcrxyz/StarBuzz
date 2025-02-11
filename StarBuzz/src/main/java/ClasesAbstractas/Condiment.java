/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
 *
 * @author nomar
 */
public abstract class Condiment extends Beverages {
    
    protected Beverages beverage; // Agregación con Beverage

    public Condiment(Beverages beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescripcion(); // Debe ser implementado por los condimentos
    
}
    

