/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import estructuraDatos.Enumerados.Categoria;

/**
 *
 * @author Ana
 */
public class ParaFarmacia extends Producto{
    
    private Enumerados.Categoria categoria;
    private int dosisUnidades;
    private float descuento;
    
   
    /**
     * Constructor de la clase ParaFarmacia
     * @param codigo codigo del producto
     * @param nombre nombre del producto
     * @param descripcion descripción del producto
     * @param precio precio del producto
     * @param unidades unidades del producto
     * @param categoria categoria del producto
     * @param dosisUnidad dosis por unidad del producto
     * @param descuento  descuento aplicado
     */
    public ParaFarmacia(String codigo, String nombre, String descripcion, float precio,int unidades, Enumerados.Categoria categoria, int dosisUnidad, float descuento){
        
        super(codigo, nombre, descripcion, precio, unidades);
        
        this.descuento = descuento;
        
        this.dosisUnidades = dosisUnidades;
        
        this.categoria = categoria;
        
    }
    
    public ParaFarmacia(ParaFarmacia a){
        
        super(a.getCodigo(), a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getUnidades());
        
        this.descuento = a.getDescuento();
        
        this.dosisUnidades = a.getDosisUnidades();
        
        this.categoria = a.getCategoria();
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;   
    }
    
    public int getDosisUnidades(){
  
        return dosisUnidades;
    }
    
    public void setDosisUnidades(int dosisUnidades){
        this.dosisUnidades = dosisUnidades;
    }
    
    public float getDescuento(){
        return descuento;
    }
    
    public void setDescuento(float descuento){
        this.descuento = descuento;
    }
    
    @Override
    public String toString(){
    
        return super.toString() + "\nCategoría: " + categoria + "\nDosis por unidad:        " + dosisUnidades + "\nDescuento:  " + descuento + ".";
        
    }
    
}
