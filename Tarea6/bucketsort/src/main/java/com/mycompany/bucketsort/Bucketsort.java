/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bucketsort;

import java.util.Arrays;

/**
 *
 * @author johan
 */
public class Bucketsort {
     public static void cubeta(int[] datos, int slots) {
        int[] cubetas = new int[slots + 1];
        for (int i = 0; i < cubetas.length; i++) {
            cubetas[i] = 0;
        }

        for (int i = 0; i < datos.length; i++) {
            cubetas[datos[i]]++;
        }

        int aux = datos.length - 1;
        for (int i = 0; i < cubetas.length; i++) {
            for (int j = 0; j < cubetas[i]; j++) {
                datos[aux--] = i;
            }
        }

    }

    public static void main(String[] args) {
       int[] datos = {70,12,11,78,40,33,4,31,57,10,41,22,89,97,13};
                    int slots = 100; 
                    System.out.println("Antes: " + Arrays.toString(datos));
                    cubeta(datos, slots);
                    System.out.println("Despues:  " + Arrays.toString(datos));

                       
                 
    }
}
