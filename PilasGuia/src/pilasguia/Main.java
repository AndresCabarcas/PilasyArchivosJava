/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasguia;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Main {

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== IMPLEMENTACIÓN DE PILAS - OPCIÓN DEL MENU  ===== \n" + "1. Agregar Datos a la Pila \n" + "2. Eliminar Datos de la Pila \n" + "3. Mostrar Datos de la Pila \n" + "4. Vaciar la Pila \n" + "5. Salir" + "\n \n Seleccione una opción del 1 al 5"));
        } while (opcion <= 0 || opcion > 5);
        return opcion;
    }

    public static void mostrarPila(DeclararPila pila) {
//Se crea un objeto de la clase DeclararPila (temp), para crear una pila temporal en donde
//almacenar los datos.
        DeclararPila temp = new DeclararPila();
        String verDatosPila = "";
        while (!pila.pilaVacia()) { //Mientras la pila no esté vacía se muestran sus datos.
            verDatosPila = verDatosPila + String.valueOf("---- " + pila.valorTope() + "\n");
//Se agrega a una pila temporal el valor del tope de la pila actual.
            temp.agregar(pila.valorTope());
            pila.quitar(); //Se elimina el tope de la pila actual, para pasar al siguiente elemento.
        }
        JOptionPane.showMessageDialog(null, "========= ELEMENTOS DE LA DE PILA==========" + "\n" + verDatosPila + "\n ");

//Posteriormente se copia nuevamente la pila temporal hasta la pila original.
        while (!temp.pilaVacia()) {
//Se agrega a la pila original el valor del tope de la pila temporal.
            pila.agregar(temp.valorTope());
            temp.quitar(); //Se elimina el tope de la pila temporal, para pasar al siguiente elemento.
        }
    }

    public static void main(String[] args) {
        DeclararPila pila = new DeclararPila();
        String dato;
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    dato = JOptionPane.showInputDialog(null, "Digite el dato que quiere agregar a la Pila");
       
                        pila.agregar(dato);
                        mostrarPila(pila);          
                    break;
                case 2:
                    if (!pila.pilaVacia()) {
                        pila.quitar();
                        mostrarPila(pila);
                    } else {
                        JOptionPane.showMessageDialog(null, "============ IMPLEMENTACIÓN DE PILAS============" + "\n\n"
                                + "La pila está vacía, No pueden quitar datos \n\n");
                    }
                    break;
                case 3:
                    mostrarPila(pila);
                    break;
                case 4:
                    pila.limpiarPila();
                    mostrarPila(pila);
                    JOptionPane.showMessageDialog(null, "============ IMPLEMENTACIÓN DE PILAS============" + "\n\n"
                            + "La pila está vacía, No pueden quitar datos \n\n");
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }
}
