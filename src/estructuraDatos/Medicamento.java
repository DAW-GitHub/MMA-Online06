/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

/**
 *
 * @author Ana
 */
public final class Medicamento extends Producto {
    
    private Enumerados.TipoMedicamento medicamento;
    
    private String comoTomar;
    
    private String efectosAdversos;
    
    /**
     * Constructor de la clase Medicamento.
     * @param codigo código del producto
     * @param nombre nombre del producto
     * @param descripcion descripción del producto
     * @param precio precio del producto
     * @param unidades unidades del producto
     * @param medicamento tipo de medicamento
     * @param comoTomar como tomar el medicamento
     * @param efectosAdversos  efectos adversos.
     */
    public Medicamento(String codigo, String nombre, String descripcion, float precio, int unidades, Enumerados.TipoMedicamento medicamento, String comoTomar, String efectosAdversos){
        
        super(codigo, nombre, descripcion, precio, unidades);
        
        this.medicamento = medicamento;
        
        this.comoTomar = comoTomar;
           
        this.efectosAdversos = efectosAdversos;
        
        
    }
    
    public Medicamento(Medicamento a){
        
        super(a.getCodigo(), a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getUnidades());
        
        medicamento = a.getMedicamento();  
        comoTomar = a.getComoTomar();
        efectosAdversos = a.getEfectosAdversos();
        
    }
    
    public Enumerados.TipoMedicamento getMedicamento(){

        return this.medicamento;
    }
    
    public void setMedicamento(Enumerados.TipoMedicamento medicamento){
        
        this.medicamento = medicamento;
        
    }
    
    public String getComoTomar(){
        return "oral";
    }
    
    public void setComoTomar(String a){
        
    }
    
    public String getEfectosAdversos(){
        return"mareo";
    }
    
    public void setEfectosAdversos(String a){
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo:         " + medicamento + "\nComo tomar:     " + comoTomar + "\nEfectos adversos:" + efectosAdversos + ".";
        
    }
    
}
