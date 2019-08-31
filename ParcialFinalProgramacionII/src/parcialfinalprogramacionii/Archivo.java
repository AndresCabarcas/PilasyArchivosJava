/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinalprogramacionii;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author ANDACAMES
 */
public class Archivo {
    
    File archivo;
    
     public void CargarArchivo(String rutaArchivo, DeclararPila obj) throws FileNotFoundException, IOException {
        String linea;
        String Artista,Tipo;
        float costo;
        int numero;
        int cont=0;
        String Salto = "***";  
       
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        
        while ((linea = leer.readLine()) != null) {
           StringTokenizer token=new StringTokenizer(linea,Salto);
            Artista=token.nextToken();
            Tipo=token.nextToken();
            costo=Float.parseFloat(token.nextToken());
            numero=Integer.parseInt(token.nextToken());
            ClaseCD nuevo=new ClaseCD(Artista,Tipo,costo,numero);
            obj.Push(nuevo);
        }
           
        leer.close();
        
    }
     
     public void CargarArchivo2(String rutaArchivo, DeclararPila obj) throws FileNotFoundException, IOException {
        String linea;
        String Artista,Tipo;
        float costo;
        int numero;
        int cont=0;
        String Salto = "***";  
       
        FileReader fichero = new FileReader(rutaArchivo);
        BufferedReader leer = new BufferedReader(fichero);
        
        while ((linea = leer.readLine()) != null) {
           StringTokenizer token=new StringTokenizer(linea,Salto);
            Artista=token.nextToken();
            Tipo=token.nextToken();
            costo=Float.parseFloat(token.nextToken());
            numero=Integer.parseInt(token.nextToken());
            ClaseCD nuevo=new ClaseCD(Artista,Tipo,costo,numero);
            obj.Push2(nuevo);
        }
           
        leer.close();
        
    }
     
     public void guardarArchivo(DeclararPila obj) throws IOException {

        BufferedWriter escribir;

        archivo = new File("CDs4.txt");
        try {
            escribir = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < obj.Contador(); i++) {
                escribir.write(obj.PosCD(i).getNombreArtista()+ "***" + obj.PosCD(i).getTipoMusica() + "***" + obj.PosCD(i).getCosto()+"***"+obj.PosCD(i).getNumeroCanciones());
                escribir.newLine();
            }
            for (int i = 0; i < obj.Contador2(); i++) {
                escribir.write(obj.PosCD2(i).getNombreArtista()+ "***" + obj.PosCD2(i).getTipoMusica() + "***" + obj.PosCD2(i).getCosto()+"***"+obj.PosCD2(i).getNumeroCanciones());
                escribir.newLine();
            }
            for (int i = 0; i < obj.Contador3(); i++) {
                escribir.write(obj.PosCD3(i).getNombreArtista()+ "***" + obj.PosCD3(i).getTipoMusica() + "***" + obj.PosCD3(i).getCosto()+"***"+obj.PosCD3(i).getNumeroCanciones());
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
     
}
