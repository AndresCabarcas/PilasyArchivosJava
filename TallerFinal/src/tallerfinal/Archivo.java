/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ANDACAMES
 */
public class Archivo {

    File archivo;


    public void guardarArchivo(TadPila obj) throws IOException {

        BufferedWriter escribir;

        archivo = new File("Aautos.txt");
        try {
            escribir = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < obj.Contador(); i++) {
                escribir.write(obj.qCarro(i).getMarca() + "," + obj.qCarro(i).getPlaca() + "," + obj.qCarro(i).getTipo());
                escribir.newLine();
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: archivo no existe");

        }

    }

    public String leerArchivo(String rutaArchivo) throws FileNotFoundException, IOException {
        String linea;

        String verDatosArchivo = "";
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);

        while ((linea = leer.readLine()) != null) {
            verDatosArchivo = verDatosArchivo + String.valueOf(linea + "\n");
        }

        leer.close();
        return verDatosArchivo;
    }
    
    public void GuardarMensajes(TadPila obj) throws IOException{

    BufferedWriter escribir;
        archivo = new File("Mensajes.txt");
        try {
            escribir = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < obj.Contador(); i++) {
                escribir.write(obj.qCarro(i).getLogIn());
                escribir.newLine();
            }
            for (int i = 0; i < obj.Contador2(); i++) {
                escribir.write(obj.qCarro2(i).getLogIn());
                escribir.newLine();
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: archivo no existe");

        }
    }
    
     public void guardarArchivo2(TadPila obj) throws IOException {

        BufferedWriter escribir;

        archivo = new File("Movimientos.txt");
        try {
            escribir = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < obj.Contador(); i++) {
                escribir.write(obj.qCarro(i).getPlaca() + "," + obj.qCarro(i).getEntrada());
                escribir.newLine();
            }
            for (int i = 0; i < obj.Contador2(); i++) {
                escribir.write(obj.qCarro2(i).getPlaca() + "," + obj.qCarro(i).getSalida());
                escribir.newLine();
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: archivo no existe");

        }

    }

    
    public void CargarArchivo(String rutaArchivo, TadPila obj) throws FileNotFoundException, IOException {
        String linea;
        String Marca,Placa,Tipo;
        int cont=0;
        char entrada='L';
        String Salto = ",";  
       
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        
        while ((linea = leer.readLine()) != null) {
           StringTokenizer token=new StringTokenizer(linea,Salto);
            Marca=token.nextToken();
            Placa=token.nextToken();
            Tipo=token.nextToken();
             String Mensaje="Ha llegado el Carro con placa: "+Placa+"  L  ";
            Carro nuevo=new Carro(Marca,Placa,Tipo,entrada,Mensaje);
            obj.Push(nuevo);
        }
           
        leer.close();
        
    }

}
