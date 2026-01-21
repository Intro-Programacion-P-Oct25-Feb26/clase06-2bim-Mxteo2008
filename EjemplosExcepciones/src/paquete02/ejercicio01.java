/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class ejercicio01 {

    static Scanner entrada = new Scanner(System.in);

    // valor tipo entero qe liegp llame  auna fincion que sume esos 
    // para los valores ingresados por teclado debe haber una excepcion
    //que solo valores pares´positivos puedan ser ingresados
    public static void main(String[] args) {
        int valor1 = obtenerValor1();
        int valor2 = obtenerValor1();

        int suma = obtenerSuma(valor1, valor2);
        reporte(valor1, valor2, suma);
        

    }

    public static int obtenerValor1() {
        boolean bandera = true;
        int valor1 = 0;
        while (bandera) {
            try {

                System.out.println("Ingrese el valor");
                valor1 = entrada.nextInt();
                if (valor1 < 0) {
                    throw new Exception("Número negativos");
                }
                if (valor1 % 2 != 0) {
                    throw new Exception("Número impar");
                }
                bandera = false;

            } catch (Exception e) {
                System.out.printf("Valor no permitido\nError : %s\n", e);
            }
        }

        return valor1;
    }


    public static int obtenerSuma(int a, int b) {
        int suma = a + b;
        return suma;

    }

    public static void reporte(int a, int b, int c) {
        System.out.printf("La suma de %s + %s = %s\n", a, b, c);
    }

}

