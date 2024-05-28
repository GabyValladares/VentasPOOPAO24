/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        //Cliente[] listaClientes=new Cliente[10];
        //for (int i = 0; i < 10; i++) {
       //     Cliente c=new Cliente();
        //    System.out.println("---INFORMACIÓN CLIENTE---");
       //     System.out.println("Ingrese el código del Cliente:");
       //     c.setGgvcIdCliente(es.nextInt());
      //      System.out.println("Ingrese el nombre del Cliente:");
      //      c.setGgvcNombres(es.next());
       //     listaClientes[i]=c;
            
       // }
      //  for (int i = 0; i < 10; i++) {
       //     System.out.println(listaClientes[i].getGgvcNombres());
     //   }
        //INSTANCIAS DEL PRODUCTO
        Producto p=new Producto();
        p.setMjcnIdProducto(1);
        p.setMjcnMarca("Pan Centeno");
        p.setMjcnTipo("Integral");
        
        //CREANDO UNA LISTA = ESTRUCTURA DE DATOS
        //TIPODEdATO[] NOMBRELISTA=NEW TipoDato[10]
        Producto[] listaProductos=new Producto[3];
        for (int i = 0; i <= listaProductos.length-1; i++) {//Length se aumenta una posicion y por eso se le resta -1
            Producto p1=new Producto();// NOMBRE DEL OBJETO    CONSTRUCTOR(Producto())
            System.out.println("*---------------------------------------*");
            System.out.println("Ingrese el código del producto: "); //
            p1.setMjcnIdProducto(es.nextInt()); //Utilizamos scanner
            System.out.println("Ingrese el nombre del producto: ");
            p1.setMjcnNombre(es.next());
            System.out.println("Ingrese la marca del producto: ");
            p1.setMjcnMarca(es.next());
            //p1.imprimir();
            //INSERTAR EN LA LISTA EL OBJETO
            listaProductos[i]=p1;
        }
            //USANDO FOREACH O FOR REDUCIDO
            //CICLO REPETITIVO CON 2 PARÁMETROS
            //FOR = 1)RECORRER 2)IMPRIMIR
            //TRABAJA CON PUNTEROS
            //for(TipoDeDatoLista alias:nombredelaListaARecorrer){}
            for(Producto puntero:listaProductos){ //For each
                //puntero.imprimir();
                System.out.println("******************************************");
                System.out.println("Nombres de productos disponibles: "+ puntero.getMjcnNombre()+"\n" +
                "Marca: "+ puntero.getMjcnMarca());
            }
    }
}
