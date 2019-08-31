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
public class NodoCD {
    
    private int canciones;
    private String titulo;
     private float precio;
       NodoCD siguiente;
       
       public NodoCD(){
       canciones=0;
       titulo="";
       precio=0;
       siguiente=null;   
       }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public NodoCD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCD siguiente) {
        this.siguiente = siguiente;
    }
    
}
