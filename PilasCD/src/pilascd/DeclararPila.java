/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascd;

/**
 *
 * @author ANDACAMES
 */
public class DeclararPila {

    private int totalNodos;
    private NodoCD tope;


    public DeclararPila() {
        totalNodos = 0;
        tope = null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public NodoCD getTope() {
        return tope;
    }

    public boolean pilaVacia() {
        if (getTotalNodos() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void quitar() { //Apuntador de la clase nodo para almacenar temporalmente el nodo a eliminar (tope).  
        NodoCD temp;
        if (!pilaVacia()) { //Mientras que la pila no este vacía se pueden eliminar nodos.
            temp = getTope(); //Se asigna temporalmente el tope de la pila a el apuntador temp.     
            tope = tope.getSiguiente(); //Ahora el tope será el nodo que le sigue al que estaba de tope.   
            temp = null;
            totalNodos = totalNodos - 1; //El contador de nodos se decremento en uno.  
        }
    }

    public void limpiarPila() {
        while (!pilaVacia()) {
            quitar();
        }
    }

}
