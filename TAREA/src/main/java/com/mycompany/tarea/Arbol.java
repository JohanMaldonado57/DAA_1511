package com.mycompany.tarea;

 public class Arbol{
 NODO Ini;
 public Arbol(){
 Ini = null;    
 }        
 
  public void insert(int i, Object valor){
 NODO A=new NODO(i);
 A.KEY2=valor;
    if (Ini==null){
     Ini = A;
    } else {
    NODO Aux = Ini;
        while(Aux != null){
        A.HEAD=Aux;
            if(A.KEY>=Aux.KEY){
             Aux= Aux.L;
            }else{
            Aux=Aux.R;
            }
        }
    if(A.KEY<A.HEAD.KEY){
    A.HEAD.R=A;
    }else{
    A.HEAD.L=A;
    }
    }
  }
  
  public void mov(NODO A){
 if(A != null){
 mov (A.L);
 System.out.println ("Lugar" + A.KEY);
 mov(A.R);
 }
 }
  
public class NODO{

 public NODO HEAD;
 public NODO R;
 public NODO L;
 public int KEY;
 public Object KEY2;
 
 
 
 public NODO (int posicion){
 
     KEY= posicion;
     HEAD = null;
     L = null; 
     R = null;
     KEY2 = null;
     KEY2= null;
 }
 

 

 }
}
       

