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
public class Tripleta {
    private int fila;
    private  int columna;
    private int valor ;
    
    public Tripleta(int fila, int columna, int valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public int retornaFila() {
        return fila;
    }

    public void asignaFila(int fila) {
        this.fila = fila;
    }

    public int retornaColumna() {
        return columna;
    }

    public void asignaColumna(int columna) {
        this.columna = columna;
    }

    public int retornaValor() {
        return valor;
    }

    public void asignaValor(int valor) {
        this.valor = valor;
    }
    
}
