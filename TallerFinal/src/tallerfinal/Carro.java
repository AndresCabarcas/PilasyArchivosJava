/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerfinal;

/**
 *
 * @author ANDACAMES
 */
public class Carro {

    private String marca;
    private String placa;
    private String tipo;
    private int horas;
    private int valor;
    private char entrada;
    private char salida='S';
    private String LogIn;
    private String LogOut;

    public String getLogIn() {
        return LogIn;
    }

    public void setLogIn(String LogIn) {
        this.LogIn = LogIn;
    }

    public String getLogOut() {
        return LogOut;
    }

    public void setLogOut(String LogOut) {
        this.LogOut = LogOut;
    }

    
    public int getHoras() {
        return horas;
    }

    public char getEntrada() {
        return entrada;
    }

    public char getSalida() {
        return salida;
    }
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {

        this.valor = valor;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Carro(String marca, String placa, String tipo,char entrada,String Log) {
        this.marca = marca;
        this.placa = placa;
        this.tipo = tipo;
        this.entrada=entrada;
        this.LogIn=Log;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void CalcularValor() {

    }

}
