/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrices_dispersas;

/**
    *
    * @author Mario
    */
public class MatrizDispersa {
  
    
    private NodoDoble mat;
    private int dimension;
    public MatrizDispersa(int n) {     
        //crear el nodo cabez de los nodo cabez 
        Tripleta t=new Tripleta(0,0,0);
        mat=new NodoDoble(t);
        this.dimension=n;        
    }
    public void CrearNodosCabeza(){
        //enlazar los nodos cabeza  con la li 
        Tripleta t;
        NodoDoble p,anterior;
        anterior=mat;         
        for(int i=this.dimension;i>=1;i--){            
            t=new Tripleta(i,i,0);
            p=new NodoDoble(t);    
            p.asignaLigaDer(p);
            p.asignaLigaIzq(p);
            p.asignaLigaDato(anterior);
            anterior=p;
            if (i==1){
              mat.asignaLigaDato(p);
            } 
        }         
    }
    public void mostrar(){
        NodoDoble nodo=new NodoDoble();
        nodo=mat;    
    do{    
        System.out.println(nodo.retornaDatoTripleta());
        nodo=nodo.retornaLigaDato();
    }while(nodo!=mat);
    }
   
    public void agregarNodopoFila(Tripleta t){
        NodoDoble p=new NodoDoble(t);
        
        
        
    
    
    }
   

}
