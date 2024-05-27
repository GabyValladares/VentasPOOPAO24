/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
/**
 *
 * @author PC19
 */
public class MainListas {
    public static void main(String[] args) {
        Scanner es=new Scanner(System.in);
        //LISTA DE NÚMEROS ENTEROS Y CONOCER CUANTO SUMAN LOS NÚMEROS EN TOTAL
        System.out.println("Ingrese el tamaño de la lista a generar");
        int[] listaNumero=new int[es.nextInt()];
        for (int i = 0; i < listaNumero.length; i++) {
            System.out.println("Ingrese un número entero:");
            listaNumero[i]=es.nextInt();
            
        }
        int acumulador=0;
        for(int a:listaNumero){
            
            acumulador+=a;
        }
        System.out.println("La suma de la lista es:"+acumulador);
    }
    
}    

