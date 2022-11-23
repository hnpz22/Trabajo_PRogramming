/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia1;

import java.util.Scanner;

/**
 * @author NICOLÁS PLAZAS
 * 
 *  Realizar un algoritmo que calcule el salario a pagar de un empleado según los siguientes
parámetros:
• Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y
más Aux. de transporte= +11%.
• Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-
6% y más Aux. de transporte= +9%.
• Si gana más 1.000.000 y menos 1.800.00, descuento por pensión es -6%, descuento de
seguro de vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
• Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%,
descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte=
+8%.
• Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida
6%, descuento de salud =-10% y más Aux. de transporte= +9%.
 */
public class Ejercicio18 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    float salario;
    
        System.out.println("Por favor introduzca el salario a calcular");
     salario = scan.nextFloat();
    
        if (salario < 700000){
            salario = salario - (0.02f*salario) - (0.04f*salario) + (0.11f*salario);
            System.out.println("Su salario final es: " + salario);
        }
        if (salario >= 741000 && salario <=999999){
            salario = salario - (0.04f*salario) - (0.06f*salario) + (0.09f*salario);
            System.out.println("Su salario final es: " + salario);
        }
        if (salario > 1000000 && salario < 1800000){
            salario = salario - (0.06f*salario) - (0.05f*salario) - (0.06f*salario) + (0.09f*salario);
            System.out.println("Su salario final es: " + salario);
        }
        if (salario > 1800000 && salario <2500000){
            salario = salario - (0.06f*salario) - (0.05f*salario) - (0.08f*salario) + (0.08f*salario);
            System.out.println("Su salario final es: " + salario);
        }
        if (salario > 2500000){
            salario = salario - (0.08f*salario) - (0.06f*salario) - (0.10f*salario) + (0.09f*salario);
            System.out.println("Su salario final es: " + salario);
        }
        
    }
    
}
