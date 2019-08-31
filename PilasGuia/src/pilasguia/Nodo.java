/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasguia;

/**
 *
 * @author ANDACAMES
 */
public class Nodo {

    private String titulo;
    private Nodo siguiente;

    public Nodo() {
        titulo = "";
        siguiente = null;
    }

    public void setDato(String inf) {
        titulo = inf;
    }

    public void setSiguiente(Nodo sig) {
        siguiente = sig;
    }

    public String getDato() {
        return titulo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
