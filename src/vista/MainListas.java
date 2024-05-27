/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package vista;

//import java.util.Scanner;

/**
 *
 * @author PC19
 */
//public class MainListas {
    //public static void main(String[] args) {
       // Scanner es=new Scanner(System.in);
        //LISTA DE NÚMEROS ENTEROS Y CONOCER CUANTO SUMAN LOS NÚMEROS EN TOTAL
       // System.out.println("Ingrese el tamaño de la lista a generar");
        //int[] listaNumero=new int[es.nextInt()];
        //for (int i = 0; i < listaNumero.length; i++) {
          //  System.out.println("Ingrese un número entero:");
          //  listaNumero[i]=es.nextInt();
            
        //}
        //int acumulador=0;
        //int mayor=0;
       // int menor=0;
        //for(int a:listaNumero){
            
           // acumulador+=a;
            //if (a>mayor){
            //    mayor=a;
           // }
           // if (a < menor){
               // menor=a;
           // }
        //}
        //System.out.println("La suma de la lista es:"+acumulador);
        //System.out.println("el mayor es:"+mayor);
       // System.out.println("el menor es:"+menor);
    //}
    
//}    

package vista;

import java.util.Scanner;

/**
 *
 * @author PC19
 */
public class MainListas {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        //LISTA DE NÚMEROS ENTEROS Y CONOCER CUANTO SUMAN LOS NÚMEROS EN TOTAL
        System.out.println("Ingrese el tamaño de la lista a generar:");
        int[] listaNumero=new int[es.nextInt()];
        for (int i = 0; i < listaNumero.length; i++) {
            System.out.println("Ingrese un número entero:");
            listaNumero[i]=es.nextInt();
            
        }
        int  acumulador = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int mayor = 0;
        int menor = 0;
        for(int a : listaNumero){
            acumulador += a;
            if (a > mayor){
                mayor = a;
            }
            if (a < menor){
                menor = a;
            }
            if (a % 2 == 0) { // Si el número es par
                sumaPares += a;
            } else { // Si el número es impar
                sumaImpares += a;
            }
        }
        System.out.println("La suma de la lista es: " +  acumulador);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }
}
