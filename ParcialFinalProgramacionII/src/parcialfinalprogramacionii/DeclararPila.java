/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinalprogramacionii;

import java.util.ArrayList;
import java.util.EmptyStackException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class DeclararPila {

    ArrayList<ClaseCD> pila = new ArrayList<ClaseCD>();
    ArrayList<ClaseCD> pila2 = new ArrayList<ClaseCD>();
    ArrayList<ClaseCD> pila3 = new ArrayList<ClaseCD>();

    public void Push(ClaseCD dato) {
        pila.add(dato);
    }

    public void Push2(ClaseCD dato) {
        pila2.add(dato);
    }

    public void Pop() {
        try {
            if (!pila.isEmpty()) {
                pila.remove(pila.size() - 1);
            }
        } catch (EmptyStackException e) {
            System.out.println("La pila esta vacia");
        }
    }

    public int Contador() {
        return pila.size();
    }

    public int Contador2() {
        return pila2.size();
    }
    
    public int Contador3() {
        return pila3.size();
    }

    public void VaciarFila() {
        pila.clear();
    }

    public ClaseCD Ultimo() {
        ClaseCD h = null;
        if (pila.size() > 0) {
            h = pila.get(pila.size() - 1);

        }
        return h;
    }

    public ClaseCD Primero() {
        ClaseCD v = null;
        if (pila.size() > 0) {
            v = pila.get(0);
        }
        return v;
    }

    public ClaseCD PosCD(int i) {
        //metodo para obtener dato de la pila en una poscion i
        ClaseCD h;
        h = pila.get(i);
        return h;
    }

    public ClaseCD PosCD2(int i) {
        //metodo para obtener dato de la pila en una poscion i
        ClaseCD h;
        h = pila2.get(i);
        return h;
    }

     public ClaseCD PosCD3(int i) {
        //metodo para obtener dato de la pila en una poscion i
        ClaseCD h;
        h = pila3.get(i);
        return h;
    }

    public void agregarPila3(ClaseCD obj) {
        for (int i = 0; i < Contador2(); i++) {
            ClaseCD CD2 = new ClaseCD(PosCD2(i).getNombreArtista(), PosCD2(i).getTipoMusica(), PosCD2(i).getCosto(), PosCD2(i).getNumeroCanciones());
            if (CD2.equals(obj)) {
                pila3.add(CD2);
            }
        }
    }

}
