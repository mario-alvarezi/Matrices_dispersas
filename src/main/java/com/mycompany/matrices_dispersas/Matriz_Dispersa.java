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
public class Matriz_Dispersa {
    private NodoDoble mat;
    


    public Matriz_Dispersa(int n) {
        Tripleta t=new Tripleta(n,n,null);
        mat=new NodoDoble(t);
        t.asignaValor(mat);
        mat.asignaDato(t);      
         
    } 
    public NodoDoble   nodoCabeza(){
        return   mat;
    }
   public NodoDoble  primerNodo(){
        Tripleta   tp = (Tripleta)mat.retornaDato();
        NodoDoble   p = (NodoDoble)tp.retornaValor();
        return   p;
    }
    public   boolean   esVacia(){
        NodoDoble   p = primerNodo();
        return  p == mat;
    }
    public   boolean   finDeRecorrido(NodoDoble p){
        return   p == mat;
    }  
    public void   muestraMatriz(){
        int  qf, qc, qv;
        NodoDoble   p, q;
        Tripleta   tq, tp;
        p = primerNodo();
        while   (!finDeRecorrido(p)) {  
            q = p.retornaLigaIzq();
     
            while( !q.equals(p)){
                tq = (Tripleta)q.retornaDato();
                qf = tq.retornaFila();
                qc = tq.retornaColumna();
                qv = (int) tq.retornaValor();
                System.out.println( qf + qc + qv);
                q = q.retornaLigaDer();
            }
            tp = (Tripleta)p.retornaDato();
            p = (NodoDoble)tp.retornaValor();
        }
    }
    public void  construyeNodosCabeza(){
        int   mayor, i,n,m;
        NodoDoble   x, ultimo;
        Tripleta   t;
        ultimo = nodoCabeza();
        t = (Tripleta)ultimo.retornaDato();
        m = t.retornaFila();
        n = t.retornaColumna();
        mayor = m;
        if(n > m){
            mayor = n;
        }
        for   (i = 1;  i <= mayor;  i++){
            t = new   Tripleta(i, i, nodoCabeza());
            x = new  NodoDoble(t);
            x.asignaLigaDer(x);
            x.asignaLigaIzq(x);
            t = (Tripleta)ultimo.retornaDato();
            t.asignaValor(x);
            ultimo.asignaDato(t);
            ultimo = x;
        }
    }
    void conectaPorFilas(NodoDoble   x){
        NodoDoble    p, q, anterior;
        Tripleta    tp, tq, tx;
        int    i;
        tx = (Tripleta)x.retornaDato();
        p = primerNodo();
        for (i = 1; i < tx.retornaFila(); i++){  
            tp = (Tripleta)p.retornaDato();
            p = (NodoDoble)tp.retornaValor();
        }
        anterior = p;
        q = p.retornaLigaDer();
        tq = (Tripleta)q.retornaDato();
        while (!(q.equals(p))  &&  (tq.retornaColumna() <  tx.retornaColumna())){
            anterior = q;
            q = q.retornaLigaDer();
            tq = (Tripleta)q.retornaDato();
        }
        anterior.asignaLigaDer(x);
        x.asignaLigaDer(x);
    }
   void conectaPorColumnas(NodoDoble   x){
        NodoDoble    p, q, anterior;
        Tripleta    tp, tq, tx;
        int    i;
        tx = (Tripleta)x.retornaDato();
        p = primerNodo();
        for (i = 1; i < tx.retornaColumna(); i++){  
            tp = (Tripleta)p.retornaDato();
            p = (NodoDoble)tp.retornaValor();
        }
        anterior = p;
        q = p.retornaLigaIzq();
        tq = (Tripleta)q.retornaDato();
        while (!(q.equals(p))  &&  (tq.retornaFila() <  tx.retornaFila())){
            anterior = q;
            q = q.retornaLigaIzq();
            tq = (Tripleta)q.retornaDato();
        }
        anterior.asignaLigaIzq(x);
        x.asignaLigaIzq(x);
    }        
}
