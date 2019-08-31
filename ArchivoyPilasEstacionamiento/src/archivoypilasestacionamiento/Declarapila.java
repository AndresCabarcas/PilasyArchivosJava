/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoypilasestacionamiento;

import static archivoypilasestacionamiento.VentanaPrincipal.Gestor;
import static archivoypilasestacionamiento.VentanaPrincipal.jLabel11;
import static archivoypilasestacionamiento.VentanaPrincipal.jTextArea2;
import static archivoypilasestacionamiento.VentanaPrincipal.jLabel15;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Declarapila {

    private Auto PilaAutos[];
    private static final int N = 20;
    private int frente = 0;
    private int tope;

    public Declarapila() {
        this.tope = -1;
        this.PilaAutos = new Auto[N];
    }

    public void setPilaAutos(int pos, Auto Auto) {
        setTope(tope + 1);
        this.PilaAutos[pos] = Auto;
    }
    
    public void setPila(Auto PilaAuto[]) {
        this.PilaAutos = PilaAuto;
    }
    public Auto[] getPila(){
        return  PilaAutos;
    }
    
    public Auto getPilaAutos(int pos) {

        return PilaAutos[pos];
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public Auto getDatoTope() {
        return PilaAutos[getTope()];
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public boolean pilaLlena() {
//La pila estará llena si el tope alcanza la posición máxima del arreglo (N-1).
        if (getTope() == N - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaVacia() {
//La pila está vacía si el tope es -1, entonces no hay elementos en la pila.
        if (getTope() == -1) {
            return true;
        } else {
            return false;
        }
    }
//Implementación del método que agrega elementos a la pila, para esto se verificar que la pila no
//está llena, se aumenta el tope en uno y se guarda en el arreglo el dato, en la posición del tope.

    public void agregar2(Auto dato) {
        if (!pilaLlena()) { //Si la pila no está llena, entonces hay espacio para el nuevo elemento.
            tope = getTope() + 1; //Se reserva espacio para un nuevo elemento.
            PilaAutos[getTope()] = dato; //Se asigna el elemento al vector, donde está el tope.
            
        }
    }
    
    public void agregar(Auto dato) {
        if (!pilaLlena()) { //Si la pila no está llena, entonces hay espacio para el nuevo elemento.
            tope = getTope() + 1; //Se reserva espacio para un nuevo elemento.
            PilaAutos[getTope()] = dato; //Se asigna el elemento al vector, donde está el tope.
            jTextArea2.setText(jTextArea2.getText() +Gestor.crearMovimientos("L", dato.getNroPlaca()) );
            jLabel11.setText(Gestor.crearMensaje(true,dato.getNroPlaca())); 
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta llena! No se esta agregando el auto: "
                    + "\n->" + dato.getMarca()
                    + "\n->Placa: " + dato.getNroPlaca()
                    + "\n->Tipo: " + dato.getTipo()); 
            jTextArea2.setText(jTextArea2.getText() +Gestor.crearMovimientos("S", dato.getNroPlaca()) );
            jLabel11.setText(Gestor.crearMensaje(false,dato.getNroPlaca()));
        }
    }
    
    public int calcularValoraPagar(int horas,String tipo){
        int val=0;
        if(tipo.equals("auto")){
            val=horas*2300;
        }else{
            if(tipo.equals("camioneta")){
                val=horas*3500;
            }else{
                if(tipo.equals("bus")){
                   val=horas*5000;
                }else{
                    if(tipo.equals("camion")){
                        val=horas*7000;
                    }
                }
            }
        }
        return val;
    }
//Implementación del método que permite eliminar el elemento del tope, para esto se verificar que
//la pila no está vacía y se disminuye el valor de tope en uno.
    
    public boolean sacarAuto(String placa,int horas)  {
        boolean confir=false;
        Declarapila aux=new Declarapila();
        Auto auto=new Auto();
        int mov=0;
        while(!pilaVacia()){
            
            if(placa.equals(getDatoTope().getNroPlaca())){
                
                mov=getDatoTope().getNMov();
                auto=getDatoTope();
                quitar();
                confir=true;
                break;
            }else{
                getDatoTope().setNMov(getDatoTope().getNMov()+1); 
                aux.agregar2(getDatoTope());
                quitar();
            }   
        }
        
        while(!aux.pilaVacia()){        
            agregar2(aux.getDatoTope());
            aux.quitar();
        }
        
        if(confir){
            jLabel11.setText(Gestor.crearMensajeSalida(placa,mov));
            jTextArea2.setText(jTextArea2.getText() +Gestor.crearMovimientos("S", placa) );
            JOptionPane.showMessageDialog(null,"Valor a pagar: "+calcularValoraPagar(horas, auto.getTipo()) );
            jLabel15.setText("$ "+calcularValoraPagar(horas, auto.getTipo()));
        }else{
            jLabel11.setText("Auto de placa "+placa+" no encontrado");
        }
        
        
        return confir;
    }

    public void quitar() {
        if (!pilaVacia()) {
            tope = getTope() - 1;
        }
    }

    public String ListarAutos() {
        String Lista = "";
        Declarapila temp = new Declarapila();

        while (!pilaVacia()) {

            Lista +=datosAuto(getDatoTope());//Se agregan los datos del auto que esta en el tope

            temp.agregar(getDatoTope());//Se pasa el auto a un temporal y se quita de la pila original
            quitar();
        }

        while (!temp.pilaVacia()) {//Se vuelve a llenar la pila original con la temporal
            agregar(temp.getDatoTope());
            temp.quitar();
        }
        return Lista;
    }

    public String datosAuto(Auto auto) {
        String Lista = "";

        Lista +=auto.getMarca();
        Lista +=", Placa: "+auto.getNroPlaca();
        Lista +=", Tipo: "+auto.getTipo()+"\n";
        return Lista;
    }

}
