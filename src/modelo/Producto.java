/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Producto {
    private int adclIdProducto;
    private String adclNombre;
    private String adclMarca;
    private String adclTipo;
    private String adclColor;
    private int adclStock;
    private double adclPrecioUni;
    
    //MÉTODOS CONTRUCTORES
    public Producto() {
    }

    public Producto(int adclIdProducto, String adclNombre, String adclMarca, String adclTipo, String adclColor, int adclStock, double adclPrecioUni) {
        this.adclIdProducto = adclIdProducto;
        this.adclNombre = adclNombre;
        this.adclMarca = adclMarca;
        this.adclTipo = adclTipo;
        this.adclColor = adclColor;
        this.adclStock = adclStock;
        this.adclPrecioUni = adclPrecioUni;
    }
    
    //MÉTODOS ENCAPSULAMIENTO
    public int getAdclIdProducto() {
        return adclIdProducto;
    }

    public String getAdclNombre() {
        return adclNombre;
    }

    public String getAdclMarca() {
        return adclMarca;
    }

    public String getAdclTipo() {
        return adclTipo;
    }

    public String getAdclColor() {
        return adclColor;
    }

    public int getAdclStock() {
        return adclStock;
    }

    public double getAdclPrecioUni() {
        return adclPrecioUni;
    }

    public void setAdclIdProducto(int adclIdProducto) {
        this.adclIdProducto = adclIdProducto;
    }

    public void setAdclNombre(String adclNombre) {
        this.adclNombre = adclNombre;
    }

    public void setAdclMarca(String adclMarca) {
        this.adclMarca = adclMarca;
    }

    public void setAdclTipo(String adclTipo) {
        this.adclTipo = adclTipo;
    }

    public void setAdclColor(String adclColor) {
        this.adclColor = adclColor;
    }

    public void setAdclStock(int adclStock) {
        this.adclStock = adclStock;
    }

    public void setAdclPrecioUni(double adclPrecioUni) {
        this.adclPrecioUni = adclPrecioUni;
    }
    
    //MÉTODOS DE REGLA DE NEGOCIO
    public void imprimir(){
        System.out.println("*** DATOS DEL PRODUCTO ***\n" +
                "ID: " + getAdclIdProducto() + "\n" +
                "Nombre: " + getAdclNombre()+ "\n" +
                "Marca: " + getAdclMarca()+ "\n" +
                "Talla: " + getAdclTipo() + "\n" +
                "Color: " + getAdclColor() + "\n" +
                "Stock: " + getAdclStock() + "\n" +
                "Precio Unitario: " + getAdclPrecioUni() + "\n");
    }
    
}
