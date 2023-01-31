/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author migu_
 */
public class tester {
    
    public static void main(String[] args){
        System.out.println("Hola mundo");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        for(int i=0; i<cantidad; i++) {
            int numero = sc.nextInt();
            System.out.println("Caso #" + (i+1) + ": " + numeroAvellanas(numero));
        }
    }
    public static int numeroAvellanas(int numero){
        int x = 0;
        int y = 0;
        int suma = -9999;
        int total = 0;
        for (int i = 0; i < numero; i++) {
            x = numero - i;
            y = i;
            total = devuelveCantidadBinario(x)+devuelveCantidadBinario(y);
            if(suma< total){
                suma = total;
            }
        }
        return suma;
    }
    public static int devuelveCantidadBinario(int numCantidad){
        int cantidad1 = 0;
        String numeroBinario="";
        while(numCantidad/2 != 0){
            numeroBinario += (numCantidad%2);
            numCantidad = (numCantidad/2);
        }
        numeroBinario+=numCantidad;

        for (int i = 0; i < numeroBinario.length(); i++) {
            if(String.valueOf(numeroBinario.charAt(i)).equals("1")){
                cantidad1++;
            }
        }
        return cantidad1;
    }
    
}
