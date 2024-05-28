/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Producto {
    private int mjcnIdProducto;
    private String mjcnNombre;
    private String mjcnMarca;
    private String mjcnTipo;
    private int mjcnStock;
    private double mjcnPrecio;
    //CONSTRUCTORES
    public Producto() {
    }

    public Producto(int mjcnIdProducto, String mjcnNombre, String mjcnMarca, String mjcnTipo, int mjcnStock, double mjcnPrecio) {
        this.mjcnIdProducto = mjcnIdProducto;
        this.mjcnNombre = mjcnNombre;
        this.mjcnMarca = mjcnMarca;
        this.mjcnTipo = mjcnTipo;
        this.mjcnStock = mjcnStock;
        this.mjcnPrecio = mjcnPrecio;
    }
    //ENCAPSULAMIENTO
    public int getMjcnIdProducto() {
        return mjcnIdProducto;
    }

    public void setMjcnIdProducto(int mjcnIdProducto) {
        this.mjcnIdProducto = mjcnIdProducto;
    }

    public String getMjcnNombre() {
        return mjcnNombre;
    }

    public void setMjcnNombre(String mjcnNombre) {
        this.mjcnNombre = mjcnNombre;
    }

    public String getMjcnMarca() {
        return mjcnMarca;
    }

    public void setMjcnMarca(String mjcnMarca) {
        this.mjcnMarca = mjcnMarca;
    }

    public String getMjcnTipo() {
        return mjcnTipo;
    }

    public void setMjcnTipo(String mjcnTipo) {
        this.mjcnTipo = mjcnTipo;
    }

    public int getMjcnStock() {
        return mjcnStock;
    }

    public void setMjcnStock(int mjcnStock) {
        this.mjcnStock = mjcnStock;
    }

    public double getMjcnPrecio() {
        return mjcnPrecio;
    }

    public void setMjcnPrecio(double mjcnPrecio) {
        this.mjcnPrecio = mjcnPrecio;
    }
    //MÉTODOS
    public void imprimir(){
        System.out.println("DATOS DEL PRODUCTO\n"+ "Id: "+ getMjcnIdProducto()+"\n");
    }
}
