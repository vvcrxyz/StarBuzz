/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
 *
 * @author nomar
 */
public abstract class Beverages {
    
    protected String descripcion;
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public abstract double getCosto();    
    
}
