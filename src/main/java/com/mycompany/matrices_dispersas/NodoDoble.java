/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrices_dispersas;

/**
 *
 * @author Mario,laura
 */
public class NodoDoble {

    private Object dato;
    private NodoDoble ligaIzquierda;
    private NodoDoble ligaDerecha;

    NodoDoble() {
    }

    NodoDoble(int dato) {
        this.dato = dato;
        ligaIzquierda = null;
        ligaDerecha = null;
    }

    public Object retornaDato() {
        return dato;
    }

    public NodoDoble retornaLigaIzq() {
        return ligaIzquierda;
    }

    public NodoDoble retornaLigaDer() {
        return ligaDerecha;
    }

    public void asignaDato(Object d) {
        dato = d;
    }

    public NodoDoble(Object dato) {
        this.dato = dato;
    }

    public void asignaLigaIzq(NodoDoble x) {
        ligaIzquierda = x;
    }

    public void asignaLigaDer(NodoDoble x) {
        ligaDerecha = x;
    }

}
