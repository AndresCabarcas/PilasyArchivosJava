/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoypilasestacionamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Declarapila Pila = new Declarapila();

    String Cargar = "autos.txt";
    String ArchivoMovimientos = "movimientos.txt";
    String ArchivoMensajes = "mensajes.txt";

    public static GestorDeArchivos Gestor;

    public VentanaPrincipal() {
        initComponents();
        Gestor = new GestorDeArchivos(ArchivoMensajes, ArchivoMovimientos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1057, 646));
        setMinimumSize(new java.awt.Dimension(1057, 646));
        setPreferredSize(new java.awt.Dimension(1057, 646));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Estacionamiento Petita MOI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 460, 60);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(570, 80, 450, 460);

        jButton1.setText("Cargar Autos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 50, 270, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 110, 100, 20);

        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 110, 40, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(310, 130, 150, 10);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(70, 140, 100, 20);

        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Nro placa");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 140, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Entrada / Salida");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(740, 550, 100, 20);

        jButton2.setText("Agregar Auto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 120, 120, 60);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(70, 250, 100, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Historial movimientos");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 110, 150, 20);

        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("Horas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 280, 60, 20);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(560, 40, 20, 530);

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(920, 570, 100, 23);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 240, 90, 10);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(320, 140, 220, 250);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Ingresar Auto");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 80, 120, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Sacar Auto");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 220, 80, 20);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 390, 250, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(560, 70, 170, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(20, 100, 110, 10);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Mensajes de Confirmación:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 360, 230, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("#Estado#");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 420, 480, 60);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(20, 200, 290, 20);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(310, 110, 20, 240);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Estacionamiento");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(570, 50, 150, 20);

        jButton4.setText("Sacar Auto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(180, 260, 100, 30);

        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Tipo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 170, 50, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(70, 280, 100, 20);

        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("Nro placa");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 250, 60, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 0));
        jLabel15.setText("Valor ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(140, 500, 310, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "auto", "camioneta", "bus", "camion" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(70, 170, 100, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 0));
        jLabel16.setText("Valor a pagar: ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 500, 110, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jTextArea1.setText("");

        Gestor.LeerArchivoyCargaraPila(Cargar, Pila);//Este metodo ademas de leer el achivo cargarlo en la pila original, devuelve los ultimos agregados a la pila los que leyo

        Gestor.ListarEstacionamiento(Pila);

        Gestor.EscribirNuevoArchivo("Estacionamiento_Actual.txt", Pila);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String Marca = jTextField1.getText().trim();
        String NroPlaca = jTextField2.getText().trim();
        String Tipo = jComboBox1.getSelectedItem().toString();

        if (!Marca.equals("") && !NroPlaca.equals("") && !Tipo.equals("")) {
            Auto NuevoAuto = new Auto(Marca, NroPlaca, Tipo);

            if (!Pila.pilaLlena()) {

                JOptionPane.showMessageDialog(null, "Auto agregado..!!");
            }
            Pila.agregar(NuevoAuto);
            Gestor.ListarEstacionamiento(Pila);

            jTextField1.setText("");
            jTextField2.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Hay campos vacios...");
            JOptionPane.showMessageDialog(null, "No se agrego nada");
        }
        Gestor.EscribirNuevoArchivo("Estacionamiento_Actual.txt", Pila);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String placa = jTextField4.getText();
        
        if (!placa.equals("") && !jTextField5.getText().equals("")) {
            int horas = Integer.parseInt(jTextField5.getText() + "");
            if (Pila.sacarAuto(placa, horas)) {
                JOptionPane.showMessageDialog(null, "El auto salio satisfacoriamente");
                jTextField4.setText("");
                jTextField5.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el auto");
            }
            Gestor.ListarEstacionamiento(Pila);
            Gestor.EscribirNuevoArchivo("Estacionamiento_Actual.txt", Pila);
        }else{
            JOptionPane.showMessageDialog(null, "Hay campos vacios...");
            JOptionPane.showMessageDialog(null, "No se saco nada");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}