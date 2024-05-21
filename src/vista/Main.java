/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        Cliente[] listaClientes=new Cliente[10];
        for (int i = 0; i < 10; i++) {
            Cliente c=new Cliente();
            System.out.println("---INFORMACIÓN CLIENTE---");
            System.out.println("Ingrese el código del Cliente:");
            c.setGgvcIdCliente(es.nextInt());
            System.out.println("Ingrese el nombre del Cliente:");
            c.setGgvcNombres(es.next());
            listaClientes[i]=c;
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(listaClientes[i].getGgvcNombres());
        }
    }
}
