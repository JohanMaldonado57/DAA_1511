/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cifradocesar;

/**
 *
 * @author johan
 */
public class CifradoCesar {
 
public static void main(String[] args) {
        
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String mensaje = "Si Cupdmzaplil Uikpwuis Icbwuwti lm Tmfpkw oi lmamtxmvilw cu xixms xzwbiñwupkw \n" + 
                         "mu si opabwzpi g mu sinwztikpwu lm ucmabzw xipa. Sia bizmia acabiubpdia lm mabi\n" +
                         "puabpbckpwu xcjspki, icbwuwti g sipki awu si lwkmukpi, si pudmabpñikpwu g si \n" +
                         "lpncapwu lm si kcsbczi.\n" +
                         "Mu ms tculw ikilmtpkw ma zmkwuwkpli kwtw cui cupdmzaplil lm mfkmsmukpi. \n" +
                         "Si CUIT zmaxwulm is xzmamubm g tpzi ms ncbczw kwtw ms xzwgmkbw kcsbczis\n" +
                         "tia ptxwzbiubm lm Tmfpkw. \n"+
                         "Si CUIT ma cu maxikpw lm spjmzbilma.Mu mssi am xzikbpki kwbplpiuitmubm \n" +
                         "ms zmaxmbw, si bwsmziukpi g ms lpiswñw. Si xsczisplil lm plmia g lm xmuaitpmubw\n" + 
                         "ma ixzmkpili kwtw apñuw lm ac zpycmhi g ucuki kwtw nikbwz lm lmjpsplil.\n\f\r";
 
        String texto = descodificar(alfabeto, mensaje);
        System.out.println("Texto descodificado: " + texto  );
        
    }
    
    public static String descodificar(String alfabeto, String mensaje){
        String textoDescodificado = "";
        
        mensaje = mensaje.toUpperCase();
        
        char caracter;
       
        for(int j=0;j<=27;j++){
            int cont=j;
        
        
        int dez =cont;
        for (int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.charAt(i);
            
            int pos = alfabeto.indexOf(caracter);
           
            if(pos == -1){
                textoDescodificado += caracter;
            }else{
                if(pos - dez < 0){
                    textoDescodificado += alfabeto.charAt( alfabeto.length() + (pos - dez) );
                }else{
                    textoDescodificado += alfabeto.charAt( (pos - dez) % alfabeto.length() );
                }
            }
            
        }
        }
        return textoDescodificado;
    }
    
}
