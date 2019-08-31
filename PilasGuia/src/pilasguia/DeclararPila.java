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
public class DeclararPila {

    private int totalNodos;
    private Nodo tope;

    public DeclararPila() {
        totalNodos = 0;
        tope = null;
    }

    public int getTotalNodos() {
        return totalNodos;
    }

    public Nodo getTope() {
        return tope;
    }

    public boolean pilaVacia() {
        if (getTotalNodos() == 0) {
            return true;
        } else {
            return false;
        }
    }



    public void agregar(String dato) {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(getTope());
            tope = nuevo;
            totalNodos = totalNodos + 1;
    }

    public void quitar() { //Apuntador de la clase nodo para almacenar temporalmente el nodo a eliminar (tope).  
        Nodo temp;
        if (!pilaVacia()) { //Mientras que la pila no este vacía se pueden eliminar nodos.
            temp = getTope(); //Se asigna temporalmente el tope de la pila a el apuntador temp.     
            tope = tope.getSiguiente(); //Ahora el tope será el nodo que le sigue al que estaba de tope.   
            temp = null;
            totalNodos = totalNodos - 1; //El contador de nodos se decremento en uno.  
        }
    }

    public String valorTope() {
        return tope.getDato(); //Retorna la información que tiene el nodo del tope en el campo dato.
    }
//Implementación del método que elimina todos los nodos de la pila. Mientas que la pila no este
//vacía se va quitando el elemento del tope.

    public void limpiarPila() {
        while (!pilaVacia()) {
            quitar();
        }
    }

}
