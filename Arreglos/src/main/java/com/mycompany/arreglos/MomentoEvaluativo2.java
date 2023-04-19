/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.arreglos;

import java.text.DecimalFormat;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FelipeCastro
 */
public class MomentoEvaluativo2 extends javax.swing.JFrame {
    
    private final DefaultTableModel modelo;
    private final DecimalFormat df = new DecimalFormat("#0.00");

    public MomentoEvaluativo2() {
        initComponents();
        this.modelo = (DefaultTableModel) tablaDetalleCurso.getModel();
        this.setLocationRelativeTo(this);
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
        btnDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCurso = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbEstMayoresEdad = new javax.swing.JLabel();
        lbPorcentajeMayoresEdad = new javax.swing.JLabel();
        lbEstMenoresEdad = new javax.swing.JLabel();
        lbPorcentajeMenoresEdad = new javax.swing.JLabel();
        lbMayorNombreEdad = new javax.swing.JLabel();
        lbMenorNombreEdad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Estudiantes");

        btnDatos.setText("Ingresar Datos");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        tablaDetalleCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No. Estudiante", "Nombre", "Edad"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalleCurso);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Detalle Curso");

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 0, 3));

        lbEstMayoresEdad.setText("No. Estudiantes Mayores de edad");
        jPanel1.add(lbEstMayoresEdad);

        lbPorcentajeMayoresEdad.setText("Porcentaje Mayores Edad");
        jPanel1.add(lbPorcentajeMayoresEdad);

        lbEstMenoresEdad.setText("No. Estudiantes Menor de edad");
        jPanel1.add(lbEstMenoresEdad);

        lbPorcentajeMenoresEdad.setText("Porcentaje Menores Edad");
        jPanel1.add(lbPorcentajeMenoresEdad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDatos)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMayorNombreEdad)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMenorNombreEdad))))
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(btnDatos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbMayorNombreEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMenorNombreEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        
        int cant_estudiantes  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        
        // Arreglos        
        String[] nombres = new String[cant_estudiantes];
        int[] edades = new int[cant_estudiantes];
        
        // Contadores
        int mayores_edad = 0;
        int menores_edad = 0;
        int mayores115 = 0;
        int mayores1620 = 0;
        int mayores2130 = 0;
        int mayores30mas = 0;
        int contador = 0;
        modelo.setRowCount(0);
        
        for (int i = 0; i < cant_estudiantes; i++) {
            
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante No." + (i+1));
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante No." + (i+1)));
            
            Object[] fila = {i+1, nombres[i], edades[i]};
            modelo.insertRow((contador),fila);
            contador++;
            
            if (edades[i] >= 1 && edades[i] <= 15) {
                mayores115++;
            } else if (edades[i] >= 16 && edades[i] <= 20) {
                mayores1620++;
            } else if (edades[i] >= 21 && edades[i] <= 30) {
                mayores2130++;
            } else if (edades[i] > 30) {
                mayores30mas++;
            }
            
            if (edades[i] >= 18) {
                mayores_edad++;
            } else if (edades[i] > 0 && edades[i] < 18) {
                menores_edad++;
            }
            
        }
        
        int mayor = edades[0];
        int menor = edades[0];
        int id_mayor = 0;
        int id_menor = 0;
        
        for (int i = 0; i < cant_estudiantes; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
                id_mayor = i;
            }
            
            if (edades[i] < menor) {
                menor = edades[i];
                id_menor = i;
            }
        }
        
        lbEstMayoresEdad.setText("No. Estudiantes Mayores de edad: " + Integer.toString(mayores_edad));
        lbEstMenoresEdad.setText("No. Estudiantes Menores de edad: " + Integer.toString(menores_edad));
        
        lbPorcentajeMayoresEdad.setText("Porcentaje Mayores Edad: " + df.format(mayores_edad*100/cant_estudiantes) + "%");
        lbPorcentajeMenoresEdad.setText("Porcentaje Menores Edad: " + df.format(menores_edad*100/cant_estudiantes) + "%");
        
        lbMayorNombreEdad.setText("El/La estudiante " + nombres[id_mayor] + " es el/la mayor de todos con una edad de: " + mayor);
        lbMenorNombreEdad.setText("El/La estudiante " + nombres[id_menor] + " es el/la menor de todos con una edad de: " + menor);
 
    }//GEN-LAST:event_btnDatosActionPerformed

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
            java.util.logging.Logger.getLogger(MomentoEvaluativo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MomentoEvaluativo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MomentoEvaluativo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MomentoEvaluativo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MomentoEvaluativo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEstMayoresEdad;
    private javax.swing.JLabel lbEstMenoresEdad;
    private javax.swing.JLabel lbMayorNombreEdad;
    private javax.swing.JLabel lbMenorNombreEdad;
    private javax.swing.JLabel lbPorcentajeMayoresEdad;
    private javax.swing.JLabel lbPorcentajeMenoresEdad;
    private javax.swing.JTable tablaDetalleCurso;
    // End of variables declaration//GEN-END:variables
}
