/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        
//        Cliente[] listaClientes = new Cliente[10];
//        for (int i = 0; i < 10; i++) {
//            Cliente c = new Cliente();
//            System.out.println("---INFORMACIÓN CLIENTE---");
//            System.out.println("Ingrese el código del Cliente:");
//            c.setGgvcIdCliente(es.nextInt());
//            System.out.println("Ingrese el nombre del Cliente:");
//            c.setGgvcNombres(es.next());
//            listaClientes[i] = c;
//
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(listaClientes[i].getGgvcNombres());
//        }

        //INSTANCIA DEL PRODUCTO
        Producto p = new Producto();
        p.setAdclIdProducto(1);
        p.setAdclNombre("Pan");
        p.setAdclMarca("Bimbo");
        p.setAdclTipo("Integral");
        p.setAdclStock(10);
        p.setAdclPrecioUni(2.5);
        p.imprimir();
        
        //CREANDO UNA LISTA = ESTRUCTURA DE DATOS
        //tipodedato[] nombreLista = new tipodedato[n];
        Producto[] listaProductos = new Producto[3];
        for(int i = 0; i < listaProductos.length; i++){
            Producto p1 = new Producto();
            System.out.println("Ingrese el código del producto " + (i+1) + ":");
            p1.setAdclIdProducto(es.nextInt());
            System.out.println("Ingrese el nombre del producto:");
            p1.setAdclNombre(es.next());
            System.out.println("Ingrese la marca del producto:");
            p1.setAdclMarca(es.next());
            listaProductos[i] = p1;
        }
        
        //FOR EACH O FOR REDUCIDO
        //CICLO REPETITIVO CON 2 PARAMETROS
        //FOR = 1)RECORRER Y 2)IMPRIMIR
        //TRABAJA CON PUNTEROS
        //for(tipoDeDatodeLista alias : nombreLista){}
        System.out.println("------------------------------------------\n");
        for(Producto puntero : listaProductos){
            System.out.println("\n*****************************" + "\n" +
                    "ID de producto:" + puntero.getAdclIdProducto() + "\n" +
                    "Nombre: " + puntero.getAdclNombre() + "\n" +
                    "Marca: " + puntero.getAdclMarca() + "\n" +
                    "*****************************");
        }
    }
}
