/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoypilasestacionamiento;

/**
 *
 * @author pc
 */
public class Auto {
    
    private String Marca;
    private String NroPlaca;
    private String Tipo;
    private int NMov;

    public Auto(String Marca, String NroPlaca, String Tipo) {
        this.Marca = Marca;
        this.NroPlaca = NroPlaca;
        this.Tipo = Tipo;
        this.NMov=0;
    }
    public Auto() {
        this.Marca ="";
        this.NroPlaca ="";
        this.Tipo ="";
        this.NMov=0;
    }

    public int getNMov() {
        return NMov;
    }

    public void setNMov(int NMov) {
        this.NMov = NMov;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getNroPlaca() {
        return NroPlaca;
    }

    public void setNroPlaca(String NroPlaca) {
        this.NroPlaca = NroPlaca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
