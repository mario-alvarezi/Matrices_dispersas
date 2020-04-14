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
public class NodoDoble {
    
    private Tripleta dato;
    private NodoDoble ligaIzquierda;
    private NodoDoble ligaDerecha;   
    private NodoDoble ligaDato;

    NodoDoble() {
    }
    
    NodoDoble(Tripleta dato) {        
        this.dato = dato;
        this.asignaLigaDer(this);
        this.asignaLigaIzq(this);
        this.asignaLigaDato(this);        
    }    
    public Tripleta retornaDatoTripleta(){
        return dato;    
    }
    
    public int retornaFilaTripleta(){        
        return dato.retornaFila();}
    
     public int retornaColumnaTripleta(){        
        return dato.retornaColumna();}
    
    public int retornaDatoEntero() {        
        return dato.retornaValor();
    }

    public NodoDoble retornaLigaIzq() {
        return ligaIzquierda;
    }

    public NodoDoble retornaLigaDer() {
        return ligaDerecha;
    }

    public void asignaDatoTripleta(Tripleta d) {
        dato = d;
    }
    
    public void asignaDatoEntero(int d){
        this.dato.asignaValor(d);
    }   
    
    public void asignaLigaIzq(NodoDoble x) {
        ligaIzquierda = x;
    }

    public void asignaLigaDer(NodoDoble x) {
        ligaDerecha = x;
    }
    
     public NodoDoble retornaLigaDato() {
        return ligaDato;
    }

    public void asignaLigaDato(NodoDoble ligaDato) {
        this.ligaDato = ligaDato;
    }
    
    public NodoDoble retornaDatoNodo(){
        
        return this;
    }
}
