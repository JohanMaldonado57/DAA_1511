/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.palindromos;


/**
 *
 * @author johan
 */
public class Palindromos {
public static void main(String[] args) {
        
        String cadenaA ="";
        String cadena ;
        for (int i=0; i<24;i++){
            for (int j=0; j<60;j++){
                
              if(j>=60){
              j=0;
              }
              
        if(i<10){
            if(j<10){String hora= "0"+ i + ":" +"0"+ j  ;
            char arreglo[]= hora.toCharArray();
                cadena =String.valueOf(arreglo)+"";
                       for (int e = 0 ; e < cadena.length();e++){
                            cadenaA= cadena.charAt(e)+ cadenaA;
                            }
                            if (cadena.equals(cadenaA)){
                            System.out.print("palindromo: " + cadena );
                            
                            }
            System.out.println(cadena);
            }
            else{String hora= "0"+ i + ":" + j ;
            char arreglo[]= hora.toCharArray();
             cadena = String.valueOf(arreglo); 
             for (int e = 0 ; e < cadena.length();e++){
                            cadenaA= cadena.charAt(e)+ cadenaA;
                            }
                            if (cadena.equals(cadenaA)){
                            System.out.print("palindromo: " + cadena );
                            
                            }
            System.out.println(cadena);
            
            }
       
        }
        else if (i>10){
        if(j<10){String hora=  i + ":" +"0"+ j ;
        char arreglo[]= hora.toCharArray();
        cadena = String.valueOf(arreglo); 
        for (int e = 0 ; e < cadena.length();e++){
                            cadenaA= cadena.charAt(e)+ cadenaA;
                            }
                            if (cadena.equals(cadenaA)){
                            System.out.print("palindromo: " + cadena );
                            
                            }
        System.out.println(cadena);
        
             }   
            else{String hora=  i + ":" + j ;
            char arreglo[]= hora.toCharArray();
             cadena = String.valueOf(arreglo);
                        for (int e = 0 ; e < cadena.length();e++){
                            cadenaA= cadena.charAt(e)+ cadenaA;
                            }
                            if (cadena.equals(cadenaA)){
                            System.out.print("palindromo: " + cadena );
                            
                            }
            System.out.println(cadena);
                }
        
            }    
           }  
            
        }
 
    }
    
}