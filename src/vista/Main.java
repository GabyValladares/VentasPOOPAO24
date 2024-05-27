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
//        Cliente[] listaClientes=new Cliente[10];
//        for (int i = 0; i < 10; i++) {
//            Cliente c=new Cliente();
//            System.out.println("---INFORMACIÓN CLIENTE---");
//            System.out.println("Ingrese el código del Cliente:");
//            c.setGgvcIdCliente(es.nextInt());
//            System.out.println("Ingrese el nombre del Cliente:");
//            c.setGgvcNombres(es.next());
//            listaClientes[i]=c;
//            
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(listaClientes[i].getGgvcNombres());
//        }

           // INSTANCIAS DEL PRODUCTO
           
           Producto p=new Producto();
           p.setDpIdProducto(1);
           p.setDpNombre("Pan Centeno");
           p.setDpMarca("Bimbo");
           p.setDpTipo("Integral");
           p.setDpPrecio(2.5);
           p.setDpStock(100);
           
           //CREANDO UNA LISTA= ESTRUCTA DE DATOS
           //tipodeDato[] nombreLista=new tipoDato[10];
           
           Producto[] listaProductos=new Producto[10];
           for (int i = 0; i <= listaProductos.length-1; i++) {
               Producto p1=new Producto();
               System.out.println("-------------------------------");
               System.out.println("Ingrese el código del producto");
               p1.setDpIdProducto(es.nextInt());
               System.out.println("Ingrese el nombre del producto");
               p1.setDpNombre(es.next());
               System.out.println("Ingrese la marca del producto");
               p1.setDpMarca(es.next());
              // p1.imprimir() ;
              //INSERTAR EN LA LISTA EL OBJETO
              listaProductos[i]=p1;
              
        }
           //USANDO FOREACH O FOR REDUCIDO
           //CICLO REPETITIVO CON 2 PARAMETROS
           //FOR = 1)RECORRER 2) IMPRIMIR
           //TRABAJA CON PUNTEROS
           //for(TipoDeDatodeLista alias:nombredelaListaARecorrer){}
           
           for(Producto puntero:listaProductos){
               System.out.println("************************");
               System.out.println("Nombres de Productos Disponibles\n"+puntero.getDpNombre()+"\n"+
                       "Marca:"+puntero.getDpMarca());
           }
    }
}
