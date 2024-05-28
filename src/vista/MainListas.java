/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainListas {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        //LISTA DE NUMEROS ENTEROS Y CONOCER CUANTO SUMAN LOS NUMERO EN TOTAL
        System.out.println("Ingrese el tamaño de la lista a generar");
        int[] listaNumero=new int[es.nextInt()];
        //int[] listaNumero=new int[5];
        for (int i = 0; i < listaNumero.length-1; i++) {
            System.out.println("Ingrese un numero entero: ");
            listaNumero[i]=es.nextInt();
        System.out.println("Ingrese el tamaño de la lista B:");
        int tamañoB = es.nextInt();
        int[] listaNumeroB = new int[tamañoB];
        for (int j = 0; j < listaNumeroB.length-1; j++) {
            System.out.println("Ingrese un número entero para la lista B: ");
            listaNumeroB[j] = es.nextInt();         
        }         
        }
        int pares=0;
        int impares=0;
        for (int i = 0; i < 5; i++) {
            if(i%2==0){
                pares=listaNumero[i];
            }else{
                impares+=listaNumero[i];
        }
        int acumulador=0; //USAR VARIABLE ACUMULADORA
        int numeroMayor = listaNumero[0]; // Inicializa el número mayor con el primer elemento
        int numeroMenor = listaNumero[0];
        for(int a:listaNumero){ 
            acumulador+=a;
            if (a > numeroMayor) {
                numeroMayor = a;
            }

            // Encuentra el número menor
            if (a < numeroMenor) {
                numeroMenor = a;
            }
        }
        System.out.println("La suma de la lista es"+ acumulador);
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        
        }    
    }
}
