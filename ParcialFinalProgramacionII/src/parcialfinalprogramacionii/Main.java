/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinalprogramacionii;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Main {

    public static int Menu() {

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "============ Menu de aplicacion ============" + "\n"
                    + "0. Cargar CD1 a pila 1       \n"
                    + "1. Cargar CD2 a pila 2    \n"
                    + "2. Mostrar Pila1     \n"
                    + "3. Mostrar Pila2 \n"
                    + "4. Cargar datos a pila 3\n"
                    + "5. Mostrar pila 3\n"
                    + "6. Guardar datos en CDs4.txt\n"
                    + "7. Leer archivo CDs4.txt\n"
                    + "8. Leer Archivo CDs2.txt\n"
                    + "9. Leer Archivo CDs1.txt"
                    + "10. Salir \n"));

        } while (opcion != 10 && opcion < 0);
        return opcion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DeclararPila m = new DeclararPila();
        Archivo arc = new Archivo();
        int opc;

        do {
            opc = Menu();
            switch (opc) {
                case 0:
                    try {
                        arc.CargarArchivo("CDs1.txt", m);
                    } catch (FileNotFoundException ex) {
                        System.out.println("El archivo no se ha encontrado" + ex);;
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 1:
                    try {
                        arc.CargarArchivo2("CDs2.txt", m);
                    } catch (FileNotFoundException ex) {
                        System.out.println("El archivo no se ha encontrado" + ex);;
                    } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
                    break;
                case 2:
                         for (int i = 0; i < m.Contador(); i++) {
                        JOptionPane.showMessageDialog(null, "Nombre Artista: " + m.PosCD(i).getNombreArtista() + " Placa : " + m.PosCD(i).getTipoMusica() + " Costo:  " + m.PosCD(i).getCosto() + " N°Canciones: " + m.PosCD(i).getNumeroCanciones() + "\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < m.Contador2(); i++) {
                        JOptionPane.showMessageDialog(null, "Nombre Artista: " + m.PosCD2(i).getNombreArtista() + " Placa : " + m.PosCD2(i).getTipoMusica() + " Costo:  " + m.PosCD2(i).getCosto() + " N°Canciones: " + m.PosCD2(i).getNumeroCanciones() + "\n");
                    }
                    break;
                case 4:
                    for (int i = 0; i < m.Contador(); i++) {
                        ClaseCD CD1=new ClaseCD(m.PosCD(i).getNombreArtista(),m.PosCD(i).getTipoMusica(),m.PosCD(i).getCosto(),m.PosCD(i).getNumeroCanciones());
                         m.agregarPila3(CD1);
                    }
                    break;
                case 5:
                     for (int i = 0; i < m.Contador3(); i++) {
                        JOptionPane.showMessageDialog(null, "Nombre Artista: " + m.PosCD3(i).getNombreArtista() + " Placa : " + m.PosCD3(i).getTipoMusica() + " Costo:  " + m.PosCD3(i).getCosto() + " N°Canciones: " + m.PosCD3(i).getNumeroCanciones() + "\n");
                    }
                    break;
                case 6:
            {
                try {
                    arc.guardarArchivo(m);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 7:
            {
                try {
                    JOptionPane.showMessageDialog(null, "====== TEXTO DEL ARCHIVO ======" + "\n" + arc.leerArchivo("CDs4.txt"));
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 8:
                     {
                try {
                    JOptionPane.showMessageDialog(null, "====== TEXTO DEL ARCHIVO ======" + "\n" + arc.leerArchivo("CDs2.txt"));
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 9:
                     {
                try {
                    JOptionPane.showMessageDialog(null, "====== TEXTO DEL ARCHIVO ======" + "\n" + arc.leerArchivo("CDs1.txt"));
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case 10:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR: digite una de las opciones del menú");

            }
        } while (opc != 10);

    }

}
