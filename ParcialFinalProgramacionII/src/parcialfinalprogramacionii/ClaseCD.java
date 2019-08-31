/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialfinalprogramacionii;

/**
 *
 * @author ANDACAMES
 */
public class ClaseCD {
    String NombreArtista;
    String TipoMusica;
    float Costo;
    int NumeroCanciones;

    public ClaseCD(String NombreArtista, String TipoMusica, float Costo, int NumeroCanciones) {
        this.NombreArtista = NombreArtista;
        this.TipoMusica = TipoMusica;
        this.Costo = Costo;
        this.NumeroCanciones = NumeroCanciones;
    }
    
    public String getNombreArtista() {
        return NombreArtista;
    }

    public void setNombreArtista(String NombreArtista) {
        this.NombreArtista = NombreArtista;
    }

    public String getTipoMusica() {
        return TipoMusica;
    }

    public void setTipoMusica(String TipoMusica) {
        this.TipoMusica = TipoMusica;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    public int getNumeroCanciones() {
        return NumeroCanciones;
    }

    public void setNumeroCanciones(int NumeroCanciones) {
        this.NumeroCanciones = NumeroCanciones;
    }
    
    
}
