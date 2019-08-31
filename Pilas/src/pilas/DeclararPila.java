/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author ANDACAMES
 */
public class DeclararPila {
//Constante para determinar el número de elementos de la estructura auxilia (el vector).

    static final int N = 5;
//Entre los atributos privados para implementar el ejercicio se encuentra el Tope y un arreglo para
//guardar los datos. Se define el atributo tope para determinar la posición del elemento del tope
//(arriba de la pila). El tope es el índice o posición de la cima dentro de la pila. Este atributo es de
//solo lectura (sin método set).
    private int tope;
//Se define el atributo o vector datosPila, este es de solo lectura (sin método set). datosPila es el
//arreglo para guardar los datos de la pila. Para efectos del ejemplo se declara de tipo char, pero
//puede ser de otro tipo dependiendo el ejercicio planteado, el vector datosPila será la estructura
//auxiliar para alojar los datos de la pila.
    private char[] datosPila = new char[N];
//Declaración del método constructor de la clase DeclararPila

    public DeclararPila() {
        iniciar(); //También puede ser: tope = -1;
    }
//Para vaciar la pila basta con poner el tope en -1, pues los datos activos de la pila van de 0 hasta
//el Tope.

    public void iniciar() {
        tope = -1;
    }
//Declaración del método que retorna la posición del tope, a qué posición del vector apunta el tope.

    public int getTope() {
        return tope;
    }
//Métodos para determinar el estado de la pila (pila llena o pila vacía). Para esto se declaran dos
//funciones de tipo booleano. Si la pila está Llena se retorna el valor de true, en caso contrario se
//retorna el valor false. Lo mismo si la pila está vacía se retorna el valor de true, en caso contrario
//se retorna el valor false.

    public boolean pilaLlena() {
//La pila estará llena si el tope alcanza la posición máxima del arreglo (N-1).
        if (getTope() == N - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaVacia() {
//La pila está vacía si el tope es -1, entonces no hay elementos en la pila.
        if (getTope() == -1) {
            return true;
        } else {
            return false;
        }
    }
//Implementación del método que agrega elementos a la pila, para esto se verificar que la pila no
//está llena, se aumenta el tope en uno y se guarda en el arreglo el dato, en la posición del tope.

    public void agregar(char dato) {
        if (!pilaLlena()) { //Si la pila no está llena, entonces hay espacio para el nuevo elemento.
            tope = getTope() + 1; //Se reserva espacio para un nuevo elemento.
            datosPila[getTope()] = dato; //Se asigna el elemento al vector, donde está el tope.
        }
    }
//Implementación del método que permite eliminar el elemento del tope, para esto se verificar que
//la pila no está vacía y se disminuye el valor de tope en uno.

    public void quitar() {
        if (!pilaVacia()) {
            tope = getTope() - 1;
        }
    }
//Implementación del método que permite obtener el valor del dato almacenado en el tope.

    public char valorTope() {
        return datosPila[getTope()]; //Se obtiene el valor almacenado en la cima de la pila.
    }
}
