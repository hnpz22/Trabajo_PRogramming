/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia1;

import java.util.Scanner;

/**
 *
 * @author NICOLÁS PLAZAS
 * 15. Realizar un programa que calcule el valor a pagar por algunos galones de gasolina si
sabemos que cada litro de gasolina vale 9.500. Imprimir la cantidad de galones, precio por
galón, cantidad de litros y precio a pagar.
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        float cantGalones;
        float cantLitros;
        float precioGalones;
        float precioLitros;
        
  
       Scanner scan = new Scanner(System.in);

        System.out.println("Por favor introduzca # de galones a calcular.");
        cantGalones = scan.nextFloat();
        precioGalones =(9800 * 3.78f);
        cantLitros = cantGalones* 3.78f;
        precioLitros= cantLitros * 9800;
        
        System.out.println("Cantidad de Galones:" + cantGalones);
        System.out.println("Precio por galón:" + precioGalones);
        System.out.println("Cantidad de Litros " + cantLitros);
        System.out.println("Precio de " + cantLitros + "  es:" + precioLitros);
    }
}