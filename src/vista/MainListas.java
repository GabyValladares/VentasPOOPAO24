/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class MainListas {
    public static void main(String[] args) {
        int acumulador = 0;
        int auxMax = 0;
        Scanner s = new Scanner(System.in);
        
        //LISTA DE NUMEROS ENTEROS Y CONOCER CUANTO SUMAN LOS NÚMEROS
        System.out.println("Ingrese el total de números a sumar:");
        int[] listaNumero = new int[s.nextInt()];
        for(int i = 0; i < listaNumero.length; i++){
            System.out.println("Ingrese el número entero " + (i+1) + ":");
            listaNumero[i] = s.nextInt();
        }
        
        for(int puntero : listaNumero){
            acumulador += puntero;
        }
        
        for(int puntero : listaNumero){
            if(puntero > auxMax){
                auxMax = puntero;
            }
        }
        
        int auxMin = listaNumero[0];
        for(int puntero : listaNumero){
            if(auxMin > puntero){
                auxMin = puntero;
            }
        }
        
        System.out.println("La suma de la lista es: " + acumulador);
        System.out.println("El número mayor es: " + auxMax);
        System.out.println("El número menor es: " + auxMin);
    }
}
