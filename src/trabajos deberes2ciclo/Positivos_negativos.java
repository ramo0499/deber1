/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivos_negativos;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Positivos_negativos {

    public static void main(String[] args) {
        {  // Abre metodo main
            Scanner entrada = new Scanner(System.in);
            int numero1;
            int numero2;
            int numero3;
            int numero4;
            int numero5;

            System.out.println("\nIntroduzca 5 enteros y le dire cuantos son positivos,cuantos son negativos y cuantos son cero.");
            System.out.println("Introduzca el primer entero:");
            numero1 = entrada.nextInt();

            System.out.println("Introduzca el segundo entero:");
            numero2 = entrada.nextInt();

            System.out.println("Introduzca el tercer entero:");
            numero3 = entrada.nextInt();

            System.out.println("Introduzca el cuarto entero:");
            numero4 = entrada.nextInt();

            System.out.println("Introduzca el quinto entero:");
            numero5 = entrada.nextInt();

//ahora se encuentran los numeros positivos, negativos, y ceros 
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            if (numero1 > 0) {
                positivos = positivos + 1;
            }

            if (numero1 < 0) {
                negativos = negativos + 1;
            }

            if (0 == numero1) {
                ceros = ceros + 1;
            }

            if (numero2 > 0) {
                positivos = positivos + 1;
            }

            if (numero2 < 0) {
                negativos = negativos + 1;
            }

            if (0 == numero2) {
                ceros = ceros + 1;
            }

            if (numero3 > 0) {
                positivos = positivos + 1;
            }

            if (numero3 < 0) {
                negativos = negativos + 1;
            }

            if (0 == numero3) {
                ceros = ceros + 1;
            }

            if (numero4 > 0) {
                positivos = positivos + 1;
            }

            if (numero4 < 0) {
                negativos = negativos + 1;
            }

            if (0 == numero4) {
                ceros = ceros + 1;
            }

            if (numero5 > 0) {
                positivos = positivos + 1;
            }

            if (numero5 < 0) {
                negativos = negativos + 1;
            }

            if (0 == numero5) {
                ceros = ceros + 1;
            }

            
             System.out.printf("\nDe los numeros introducidos, %d son positivos, %d son negativos y %d son ceros\n", positivos, negativos, ceros);
        } // Cierra metodo main
    }   

}
