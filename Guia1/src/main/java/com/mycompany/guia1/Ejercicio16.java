/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia1;

import java.util.Scanner;

/**
 *
 * @author NICOLÁS PLAZAS
 * 16. Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y
mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.
Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango
permitido, también se debe pedir el precio de la hora. Imprimir la cantidad de horas
trabajadas y el pago.
 */
public class Ejercicio16 {


    public static void main(String[] args) {

        int numHoras;
        float precioHora;
        float pagoSemana;
        float pagoMes;
        pagoMes=0;
        int array [] = new int [5];
        
    Scanner scan = new Scanner(System.in);

        
        System.out.println("Por favor introduzca # de horas trabajadas");
        for(int i=1; i<5; i++){
            System.out.println("Semana #" + i);
            numHoras = scan.nextInt();
            do {
                
            System.out.println("Por favor introducir un número válido");
            System.out.println("Horas Semana #" + i);
            numHoras = scan.nextInt();
         }while((numHoras <38) || (numHoras > 55));
            array [i] = numHoras;
            
        }
                
        System.out.println("Por favor introduzca precio por hora");
        precioHora = scan.nextFloat();
        for(int j=1; j<5; j++){
            pagoSemana = array[j] * precioHora;
        System.out.println("Su pago en la semana " + j + " es: " + pagoSemana);
        
        }
        for (int k=0; k<5; k++){
            pagoMes = pagoMes + array[k];
        }
        System.out.println("\n \n Su pago en el mes es: " + pagoMes);
    }
    
}
