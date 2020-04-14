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
       MatrizDispersa mat=new MatrizDispersa(Matriz.length);    
       Tripleta t=new Tripleta(1,2,3);    
       mat.construye(Matriz);
       mat.mostrarMatrizDispersa();
    }
}
