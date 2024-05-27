/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author david
 */
public class Producto {
    //ATRIBUTOS
    private int dpIdProducto;
    private String dpNombre;
    private String dpMarca;
    private String dpTipo;
    private int dpStock;
    private double dpPrecio;
    //CONSTRUCTORES
    public Producto() {
    }

    public Producto(int dpIdProducto, String dpNombre, String dpMarca, String dpTipo, int dpStock, double dpPrecio) {
        this.dpIdProducto = dpIdProducto;
        this.dpNombre = dpNombre;
        this.dpMarca = dpMarca;
        this.dpTipo = dpTipo;
        this.dpStock = dpStock;
        this.dpPrecio = dpPrecio;
    }

   //ENCAPSULAMIENTO

    public int getDpIdProducto() {
        return dpIdProducto;
    }

    public void setDpIdProducto(int dpIdProducto) {
        this.dpIdProducto = dpIdProducto;
    }

    public String getDpNombre() {
        return dpNombre;
    }

    public void setDpNombre(String dpNombre) {
        this.dpNombre = dpNombre;
    }

    public String getDpMarca() {
        return dpMarca;
    }

    public void setDpMarca(String dpMarca) {
        this.dpMarca = dpMarca;
    }

    public String getDpTipo() {
        return dpTipo;
    }

    public void setDpTipo(String dpTipo) {
        this.dpTipo = dpTipo;
    }

    public int getDpStock() {
        return dpStock;
    }

    public void setDpStock(int dpStock) {
        this.dpStock = dpStock;
    }

    public double getDpPrecio() {
        return dpPrecio;
    }

    public void setDpPrecio(double dpPrecio) {
        this.dpPrecio = dpPrecio;
    }
    //MÉTODOS
    public void imprimir(){
        System.out.println("DATOS DEL PRODUCTO\n"+
                "Id:"+getDpIdProducto()+"\n"+
                "Nombre:"+getDpNombre()+"\n"+
                "Marca:"+getDpMarca()+"\n"+
                "Tipo:"+getDpTipo()+"\n"+
                "Stock:"+getDpStock()+"\n"+
                "Precio:"+getDpPrecio());
    }
    
    
    
}
