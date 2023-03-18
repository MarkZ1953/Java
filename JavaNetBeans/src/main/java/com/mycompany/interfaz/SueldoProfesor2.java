/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfaz;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author castr
 */
public class SueldoProfesor2 extends javax.swing.JFrame {

    private final double SalarioMinimo = 1_300_000;
    private double AuxilioTransporte =  140_606;
    private final double vSubHijo = 150_000;
    private NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    /**
     * Creates new form SueldoProfesor
     */
    public SueldoProfesor2() {
        
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public int retornarEscolaridad() {
        
        String escolaridad = (String) cbEscolaridad.getSelectedItem();
        
        int vEscolaridad = 0;
        
        switch (escolaridad) {
            case "Profesional" ->                 {
                    vEscolaridad  = 50000;
                }
            case "Especialista" ->                 {
                    vEscolaridad  = 55000;
                }
            case "Magister" ->                 {
                    vEscolaridad  = 60000;
                }
            case "Doctor" ->                 {
                    vEscolaridad  = 90000;
                }
            default -> {
            }
        }
        return vEscolaridad;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbEscolaridad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtValorHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHorasTrabajadas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sprHijos = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        ckbProduccion = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtSueldoBruto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSueldoNeto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSubsidioProduccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSubsidioHijos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSubsidioTransporte = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDescuentoSalud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescuentoPension = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalDescuentos = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitulo.setText("CALCULAR SUELDO DEL PROFESOR");
        lbTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Profesor"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 0, 3));

        jLabel5.setText("Escolaridad");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);

        cbEscolaridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesional", "Especialista", "Magister", "Doctor" }));
        cbEscolaridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEscolaridadActionPerformed(evt);
            }
        });
        jPanel1.add(cbEscolaridad);

        jLabel1.setText("Valor Hora");
        jPanel1.add(jLabel1);

        txtValorHora.setEditable(false);
        txtValorHora.setText("$50,000.00");
        txtValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorHoraActionPerformed(evt);
            }
        });
        jPanel1.add(txtValorHora);

        jLabel6.setText("Horas Trabajadas");
        jPanel1.add(jLabel6);

        txtHorasTrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasTrabajadasActionPerformed(evt);
            }
        });
        jPanel1.add(txtHorasTrabajadas);

        jLabel9.setText("Hijos");
        jPanel1.add(jLabel9);

        sprHijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 70, 1));
        sprHijos.setToolTipText("");
        jPanel1.add(sprHijos);

        jLabel10.setText("Produccion");
        jPanel1.add(jLabel10);

        ckbProduccion.setText("No");
        ckbProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbProduccionActionPerformed(evt);
            }
        });
        jPanel1.add(ckbProduccion);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Pago"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 0, 3));

        jLabel8.setText("Sueldo Bruto");
        jPanel2.add(jLabel8);

        txtSueldoBruto.setEditable(false);
        txtSueldoBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoBrutoActionPerformed(evt);
            }
        });
        jPanel2.add(txtSueldoBruto);

        jLabel4.setText("Sueldo Neto");
        jPanel2.add(jLabel4);

        txtSueldoNeto.setEditable(false);
        jPanel2.add(txtSueldoNeto);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Aumentos"));
        jPanel3.setLayout(new java.awt.GridLayout(3, 2, 0, 3));

        jLabel13.setText("Subsidio por Produccion");
        jPanel3.add(jLabel13);

        txtSubsidioProduccion.setEditable(false);
        txtSubsidioProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubsidioProduccionActionPerformed(evt);
            }
        });
        jPanel3.add(txtSubsidioProduccion);

        jLabel12.setText("Subsidio Hijos");
        jPanel3.add(jLabel12);

        txtSubsidioHijos.setEditable(false);
        jPanel3.add(txtSubsidioHijos);

        jLabel11.setText("Subsidio de Transporte");
        jPanel3.add(jLabel11);

        txtSubsidioTransporte.setEditable(false);
        jPanel3.add(txtSubsidioTransporte);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos"));
        jPanel4.setLayout(new java.awt.GridLayout(3, 2, 0, 3));

        jLabel3.setText("Descuento de Salud");
        jPanel4.add(jLabel3);

        txtDescuentoSalud.setEditable(false);
        jPanel4.add(txtDescuentoSalud);

        jLabel2.setText("Descuento de Pension");
        jPanel4.add(jLabel2);

        txtDescuentoPension.setEditable(false);
        jPanel4.add(txtDescuentoPension);

        jLabel7.setText("Total Descuentos");
        jPanel4.add(jLabel7);

        txtTotalDescuentos.setEditable(false);
        txtTotalDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDescuentosActionPerformed(evt);
            }
        });
        jPanel4.add(txtTotalDescuentos);

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorHoraActionPerformed

    private void cbEscolaridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEscolaridadActionPerformed
        // TODO add your handling code here:
     
        txtValorHora.setText(nf.format(retornarEscolaridad()));
            
    }//GEN-LAST:event_cbEscolaridadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int spinner = (int) sprHijos.getValue(); //Se recolecta el valor que se encuentre en el Spinner.
        double vtPh = vSubHijo * spinner;  

        int vEscolaridad = retornarEscolaridad(); 
        
        double nHoras = Integer.parseInt(txtHorasTrabajadas.getText()); //Numero de horas trabajadas
        double desPension = 0.05; //Descuento de Pension : 5%
        double desSalud = 0.05; //Descuento de Salud : 5%
        
        if ((nHoras*vEscolaridad) > (SalarioMinimo*2)) {
            /*
            El auxilio de transporte se aplica cuando el numero de horas trabajadas multiplicado por la escolaridad de la persona
            es mayor a dos veces al salario minimo, por lo que si es mayor entonces no se le da subsidio o auxilio de transporte.
            */
            AuxilioTransporte = 0;
        }
       
        double produccion = 0;
        
        if (ckbProduccion.isSelected()) {
            produccion = (nHoras * vEscolaridad) * 0.03;
        }
        
        try {
            if ((nHoras*vEscolaridad) > (SalarioMinimo)) {
                
                /*
                Si el numero de horas multiplicado por el valor de la escolaridad es mayor a un salario minimo
                Se ejecuta el siguiente codigo
                */
                
                //-----------------------------------------------------------------------------------------------|
                
                String descuentos = nf.format((nHoras*vEscolaridad)*desPension);
                /*
                Descuento de Pension y Salud tienen el mismo porcentaje de descuento : 0.05 o 5%
                */
                txtDescuentoPension.setText(descuentos);
                txtDescuentoSalud.setText(descuentos);
                
                //-----------------------------------------------------------------------------------------------|
              
                txtSubsidioHijos.setText(nf.format(vSubHijo*spinner));
                
                //El valor del Auxilio de tranporte depende de la condicion de arriba.
                txtSubsidioTransporte.setText(nf.format(0));
                
                String sueldo = nf.format(((nHoras*vEscolaridad) - ((nHoras*vEscolaridad)*0.10))+(vtPh)+(produccion));
                String tDescuentos = nf.format((nHoras*vEscolaridad)*0.10);
                
                txtTotalDescuentos.setText(tDescuentos);
                
                txtSubsidioProduccion.setText(nf.format(produccion));
                
                txtSueldoBruto.setText(nf.format((nHoras*vEscolaridad)));
                txtSueldoNeto.setText(sueldo);
                
            } else {
                
                txtSubsidioProduccion.setText(nf.format(produccion));
                txtSubsidioTransporte.setText(nf.format(AuxilioTransporte));
                txtDescuentoPension.setText(nf.format(0));
                txtSubsidioHijos.setText(nf.format(vSubHijo*spinner));
                txtDescuentoSalud.setText(nf.format(0));
                String sueldoneto = (nf.format((nHoras*vEscolaridad)+(vtPh)+(AuxilioTransporte)+(produccion)));
                String sueldobruto = (nf.format((nHoras*vEscolaridad)));
                String tDescuentos = nf.format(0);
                txtTotalDescuentos.setText(tDescuentos);
                txtSueldoBruto.setText(sueldobruto);
                txtSueldoNeto.setText(sueldoneto);
                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error : " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSueldoBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoBrutoActionPerformed

    private void txtHorasTrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasTrabajadasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtHorasTrabajadasActionPerformed

    private void ckbProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbProduccionActionPerformed
        // TODO add your handling code here:
        
        if (ckbProduccion.isSelected() == true) {
            ckbProduccion.setText("Si");
        } else {
            ckbProduccion.setText("No");
        }
        
    }//GEN-LAST:event_ckbProduccionActionPerformed

    private void txtSubsidioProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubsidioProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubsidioProduccionActionPerformed

    private void txtTotalDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDescuentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDescuentosActionPerformed

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
            java.util.logging.Logger.getLogger(SueldoProfesor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SueldoProfesor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SueldoProfesor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SueldoProfesor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SueldoProfesor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEscolaridad;
    private javax.swing.JCheckBox ckbProduccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSpinner sprHijos;
    private javax.swing.JTextField txtDescuentoPension;
    private javax.swing.JTextField txtDescuentoSalud;
    private javax.swing.JTextField txtHorasTrabajadas;
    private javax.swing.JTextField txtSubsidioHijos;
    private javax.swing.JTextField txtSubsidioProduccion;
    private javax.swing.JTextField txtSubsidioTransporte;
    private javax.swing.JTextField txtSueldoBruto;
    private javax.swing.JTextField txtSueldoNeto;
    private javax.swing.JTextField txtTotalDescuentos;
    private javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}
