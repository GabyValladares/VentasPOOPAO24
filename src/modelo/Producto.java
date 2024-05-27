/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Producto {
    private int cntrIdProducto;
    private String cntrNombre;
    private String cntrMarca;
    private String cntrTipo;
    private String cntrStock;
    private double cntrPrecio;

    public Producto() {
        // Constructor vacío
    }

    public Producto(int idProducto, String nombre, String marca, String tipo, String stock, double precio) {
        this.cntrIdProducto = idProducto;
        this.cntrNombre = nombre;
        this.cntrMarca = marca;
        this.cntrTipo = tipo;
        this.cntrStock = stock;
        this.cntrPrecio = precio;
   }

    public int getCntrIdProducto() {
        return cntrIdProducto;
    }

    public void setCntrIdProducto(int cntrIdProducto) {
        this.cntrIdProducto = cntrIdProducto;
    }

    public String getCntrNombre() {
        return cntrNombre;
    }

    public void setCntrNombre(String cntrNombre) {
        this.cntrNombre = cntrNombre;
    }

    public String getCntrMarca() {
        return cntrMarca;
    }

    public void setCntrMarca(String cntrMarca) {
        this.cntrMarca = cntrMarca;
    }

    public String getCntrTipo() {
        return cntrTipo;
    }

    public void setCntrTipo(String cntrTipo) {
        this.cntrTipo = cntrTipo;
    }

    public String getCntrStock() {
        return cntrStock;
    }

    public void setCntrStock(String cntrStock) {
        this.cntrStock = cntrStock;
    }

    public double getCntrPrecio() {
        return cntrPrecio;
    }

    public void setCntrPrecio(double cntrPrecio) {
        this.cntrPrecio = cntrPrecio;
    }
        public void imprimir() {
        System.out.println("ID: " + cntrIdProducto);
        System.out.println("Nombre: " + cntrNombre);
        System.out.println("Marca: " + cntrMarca);
        System.out.println("Tipo: " + cntrTipo);
        System.out.println("Stock: " + cntrStock);
        System.out.println("Precio: " + cntrPrecio);
}}




















        
        








