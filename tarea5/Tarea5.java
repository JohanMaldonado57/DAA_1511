/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea5;

import java.util.Arrays;

/**
 *
 * @author johan
 */
public class Tarea5 {

    public static void main(String[] args) {
        
        int[] arr= new int[] {13,12,8,7,1,4,3,2,11};
         int piv ;
        int tem ;
        int aux ;
        int min ;
        
        for (piv=0;piv<arr.length;piv++){
            min= piv;
            System.out.println(Arrays.toString(arr));
            for(aux=piv+1;aux<arr.length;aux++){
            if(arr[aux]<arr[min]){
            min=aux;
            }
            }
        tem= arr[piv];
        arr[piv]=arr[min];
        arr[min]=tem;
        }
        System.out.println("Arreglo ordenado por SELECCIÓN: " + Arrays.toString(arr) );
    
        
    }
}