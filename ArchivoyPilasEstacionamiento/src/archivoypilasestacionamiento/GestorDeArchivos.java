/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoypilasestacionamiento;

import static archivoypilasestacionamiento.VentanaPrincipal.jTextArea1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class GestorDeArchivos {

    BufferedWriter Moviemientos;
    BufferedWriter Mensajes;

    public GestorDeArchivos(String ArchivoMensajes, String ArchivoMovimientos) {
        try {
            inicializarMensajes(ArchivoMensajes);
            inicializarMovimiento(ArchivoMovimientos);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear los archivo");
        }
    }

    public String crearMensaje(boolean agg,String placa) {
        String linea;
        if(agg){
            linea = (">>" +"El auto con placa "+placa+" ha Ingresado satisfactoriamente");
            escribirMensajes(linea);
        }else{
            linea = (">>" +"El auto con placa "+placa+"  se ha ido sin Ingresar");
            escribirMensajes(linea);
        }
        
        return linea;
    }
    
    public String crearMensajeSalida(String placa, int mov) {
        String linea;
        
        linea = (">>" +"El auto con placa "+placa+" ha salido | Tuvo "+mov+" movimiento(s)");
        escribirMensajes(linea);
        
        return linea;
    }
    
    public String crearMovimientos(String m, String placa) {
        String linea = (">>" + m + " -Placa-> " + placa + "\n");

        try {
            escribirMovimientos(linea);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar la linea: "+e.getLocalizedMessage());
        }

        return linea;
    }

    public void inicializarMovimiento(String nombreArchivo) throws IOException {

        Moviemientos = new BufferedWriter(new FileWriter(nombreArchivo));
    }

    public void inicializarMensajes(String nombreArchivo) throws IOException {

        Mensajes = new BufferedWriter(new FileWriter(nombreArchivo));
    }

    public void EscribirNuevoArchivo(String NombreArchivo, Declarapila Pila) {
        String pausa = ",";
        try {
            BufferedWriter salida = new BufferedWriter(new FileWriter(NombreArchivo));
            for (int i = 0; i <= Pila.getTope(); i++) {
                salida.write(Pila.getPilaAutos(i).getMarca());
                salida.write(pausa);
                salida.write(Pila.getPilaAutos(i).getNroPlaca());
                salida.write(pausa);
                salida.write(Pila.getPilaAutos(i).getTipo());
                salida.newLine();
            }
            salida.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema.");
        }
    }

    public void escribirMensajes(String linea) {
        try {
            Mensajes.write(linea);// escribirmos la linea
            Mensajes.newLine();// creamos un salto de linea
            Mensajes.flush();// guardamos cambios
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en escribir mensajes");
        }
    }

    public void escribirMovimientos(String linea) throws IOException {
        try {
            Moviemientos.write(linea);// escribirmos la linea
            Moviemientos.newLine();// creamos un salto de linea
            Moviemientos.flush();// guardamos cambios
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en escribir movimientos");
        }
    }

    public void LeerArchivoyCargaraPila(String NombreArchivo, Declarapila Pila) {

        String Marca, NroPlaca, Tipo;
        String pausa = ",";
        
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(NombreArchivo));//filenotfoundexception
            String line;
            while ((line = entrada.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, pausa);
                Marca = token.nextToken();
                NroPlaca = token.nextToken();
                Tipo = token.nextToken();

                Auto NuevoAuto = new Auto(Marca, NroPlaca, Tipo);
                
                Pila.agregar(NuevoAuto);

            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encontró el archivo.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema.");
        }

    }

    public void ListarEstacionamiento(Declarapila Pila) {
        jTextArea1.setText(""); 
        for (int i = 0; i <= Pila.getTope(); i++) {    
            jTextArea1.setText(jTextArea1.getText() + (i + 1) + "->> " + Pila.datosAuto(Pila.getPilaAutos(i)));//para mostrar en el estacionamiento la pila original 
        }
    }

}
