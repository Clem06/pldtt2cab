/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.vistas;

import com.ipn.mx.conexion.Conexion;
import com.ipn.mx.conexion.InmobiliariaDAo;
import com.mx.ipn.clases.EntidadFederativa;
import com.mx.ipn.clases.Validaciones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class VistaIngresaInmobiliaria extends javax.swing.JFrame {

    Conexion con=new Conexion();
    Connection reg=con.conectar();
    
    /**
     * Creates new form VistaIngresaInmobiliaria
     */
    public VistaIngresaInmobiliaria() {
        initComponents();
        cargarEntidades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        recibenombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        recibeclave = new javax.swing.JTextField();
        recibenumero = new javax.swing.JTextField();
        recibeCP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboEntidad = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        recibecalle = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta Inmobiliaria");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inmobiliaria"));

        jLabel1.setText("Inmobiliaria");

        jLabel2.setText("Clave");

        jLabel3.setText("Numero");

        jLabel4.setText("Codigo postal");

        recibeclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibeclaveActionPerformed(evt);
            }
        });

        recibenumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibenumeroActionPerformed(evt);
            }
        });

        jLabel5.setText("Entidad Federativa");

        comboEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        comboEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEntidadActionPerformed(evt);
            }
        });

        jLabel6.setText("Calle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recibeCP)
                    .addComponent(recibenombre)
                    .addComponent(recibeclave)
                    .addComponent(recibenumero)
                    .addComponent(comboEntidad, 0, 225, Short.MAX_VALUE)
                    .addComponent(recibecalle))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(recibenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(recibeclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(recibecalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(recibenumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(recibeCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recibeclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibeclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recibeclaveActionPerformed

    private void recibenumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibenumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recibenumeroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean ca;
        boolean cop;
        boolean num; 
        Validaciones v=new Validaciones();
        ca=v.sololetras(recibecalle.getText());
        cop=v.codigopostal(recibeCP.getText());
        num=v.numerocalle(recibenumero.getText());
        
        int i=comboEntidad.getSelectedIndex();
        if( recibenombre.getText().equals("") || recibeclave.getText().equals("")||i==0 || recibecalle.getText().equals("") ||recibenumero.getText().equals("") || recibeCP.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "Los campos son obligatorios"); 
        }
        else{
          if( ca && cop && num){
          EntidadFederativa e=new EntidadFederativa();
          e= (EntidadFederativa) comboEntidad.getSelectedItem();
          InmobiliariaDAo in= new InmobiliariaDAo();
          in.RegistaraInmobiliaria(recibenombre.getText(), recibeclave.getText(),e.getIdEntidadFederativa(), recibecalle.getText(), recibenumero.getText(), recibeCP.getText());
          }
          else {JOptionPane.showMessageDialog(null, "Cadenas no validas para la seccion de direcciones"); }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEntidadActionPerformed

    public void cargarEntidades(){
    Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs=st.executeQuery("Select * from entidad_federativa where id_pais=1");
            while(rs.next()){
                EntidadFederativa e=new EntidadFederativa();
                e.setIdEntidadFederativa(rs.getInt(1));
                e.setNombre(rs.getString(2));
                e.setIdPais(rs.getInt(3));
            comboEntidad.addItem(e);
     }
        } catch (SQLException ex) {
            Logger.getLogger(VistaRegistroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(VistaIngresaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaIngresaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaIngresaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaIngresaInmobiliaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaIngresaInmobiliaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboEntidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField recibeCP;
    private javax.swing.JTextField recibecalle;
    private javax.swing.JTextField recibeclave;
    private javax.swing.JTextField recibenombre;
    private javax.swing.JTextField recibenumero;
    // End of variables declaration//GEN-END:variables
}
