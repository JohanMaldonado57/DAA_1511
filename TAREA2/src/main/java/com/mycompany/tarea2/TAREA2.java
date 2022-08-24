/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2;

/**
 *
 * @author johan
 */
import java.util.Scanner;

public class TAREA2{
 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
           int matriz[][],sumaHabitantes;
           int pisos = 6, puertas = 4;
           int piso = 0 , puerta=0;
           
            matriz = new int[pisos][puertas];

            
            for (int i = 0; i < pisos; i++) {
                for (int j = 0; j < puertas; j++) {

                            puerta++;
                           
                                if (puerta > puertas){
                                        
                                    puerta=1;
                                    if(piso < pisos){
                                    piso++;
                                    
                                    }
                                }
                    System.out.println("PISO #"+ (piso + 1)  + "Puerta # " + (puerta) +": ");
                        matriz [i][j] = entrada.nextInt();
                }
            }
            
            System.out.println("prueba: ");
            for (int i= 0; i <pisos;i++){
                for(int j= 0; j< puertas; j++){
                 //   piso =0;
                   // piso++;
                   //ystem.out.println("Edif. No. #: " + (piso+1) );
            System.out.println(matriz[i][j]+ "");
            }
                
                System.out.println("");
            }
        
        int EMayor= matriz [0][0];    
        int Lpiso=0, Lpuerta=0;
        
           for (int i = 0; i < Lpiso;i++ ){
             for (int j = 0; j < Lpuerta; j++){
                 if (matriz[i][j]> EMayor){
                 EMayor = matriz[i][j];
                 Lpiso= i;
                 Lpuerta = j;
                 }
             }
            
        }
           
     System.out.println("");
     System.out.println("\n El elemento mayor es: "  + EMayor ); 
     System.out.println(" \n El piso donde se ubica es: " + Lpiso  ); 
     System.out.println("\n puerta en el que se ubica: " + Lpuerta ); 
 


        }

    }
 
 