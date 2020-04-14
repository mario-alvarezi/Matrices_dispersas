/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

/**
 *
 * @author Mario
 */
public class Practica_2{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
          int Matriz[][]=new int[4][4];
       NodoDoble p;
       Matriz[2][1]=4;
       Matriz[1][2]=8;
       Matriz[3][1]=9;
       Matriz[2][3]=10;
       Matriz[3][2]=25;
       Matriz[0][1]=7;
       MatrizDispersa mat=new MatrizDispersa(Matriz);    
       Tripleta t=new Tripleta(1,2,3);    
       p=new NodoDoble(t);       
       System.out.println(p);
       ListaLigada l=new ListaLigada(t);
       
       t=new Tripleta(1,0,4);
       p=new NodoDoble(t); 
       l.agregaPorDato(p);
       System.out.println(p);
       
       t=new Tripleta(2,0,0);
     
       p=new NodoDoble(t);
       System.out.println(p);       
       l.agregaPorDerecha(p);
       
       t=new Tripleta(2,4,0);       
       p=new NodoDoble(t);
       System.out.println(p);
       l.agregaPorIzquierda(p);
       
        
       l.mostrarLiDato();
        System.out.println(" ");
       l.mostrarLiIzq();
        System.out.println(" ");
       l.mostrarLigaDer();
       
      
    }
}
