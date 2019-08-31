/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

import java.util.ArrayList;
import java.util.EmptyStackException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class TadPila {

    ArrayList<Carro> pila = new ArrayList<Carro>();
    ArrayList<Carro> Aux = new ArrayList<Carro>();
    float valor;

    public void Push(Carro dato) {      
            if (pila.size()<20) {
                 pila.add(dato);
        }else{
            JOptionPane.showMessageDialog(null, "!Lo sentimos¡:  El parqueadero esta lleno");
            }
    }

    //Desapilar
    public void Pop() {
        try{
        if (!pila.isEmpty()) {
            pila.remove(pila.size() - 1);
        }
        }catch(EmptyStackException e){
            System.out.println("La pila esta vacia");
        }
    }
   
    public String Verpila() {
        String i = "";
        for (int j = 0; j < pila.size(); j++) {
            i += "Item" + (j + 1) + "  " + pila.get(j) + "\n";
        }
        return i;
    }

    public int Contador() {
        return pila.size();
    }
    
    public int Contador2() {
        return Aux.size();
    }

    public void VaciarFila() {
        pila.clear();
    }

    public Carro Ultimo() {
        Carro h = null;
        if (pila.size() > 0) {
            h = pila.get(pila.size() - 1);

        }
        return h;
    }

    public Carro Primero() {
        Carro v = null;
        if (pila.size() > 0) {
            v = pila.get(0);
        }
        return v;
    }

    public String coco() {
        String q = "";
        if (pila.size() == 0) {
            q += "si";
        } else {
            q += "no";
        }
        return q;
    }

    public Carro qCarro(int i) {
        //metodo para obtener dato de la pila en una poscion i
        Carro h;
        h = pila.get(i);
        return h;
    }
    
     public Carro qCarro2(int i) {
         //metodo para obtener dato de la pila Aux en una poscion i
        Carro h;
        h = Aux.get(i);
        return h;
    }
    
    public void despachar(String placa){
    //para despachar por placa recorremos la pila y tomamos como condicion a comparar la placa ingresada con la placa en poscicion(i)
    //primero guardamos el elemento en una pila auxiliar para posterior mente agregarla al archivo de movimientos
   //luego de salvar el dato en la pila auxiliar borramos el elementos por indice    
    for (int i = 0; i < pila.size(); i++) {
            if (pila.get(i).getPlaca().equals(placa)) {
                String MensajeSalida="Ha salido el auto con placa:  "+qCarro(i).getPlaca()+" S ";
                Carro obj=new Carro(qCarro(i).getMarca(), placa, qCarro(i).getTipo(), 'S',MensajeSalida);
                Aux.add(obj);
                pila.remove(i);
               
            }
        }
    }
}
