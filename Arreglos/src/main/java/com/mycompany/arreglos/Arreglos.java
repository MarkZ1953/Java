
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FelipeCastro
 */
public class Arreglos {
    

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        List<String> lista = new ArrayList<>();
        
        int cantidad_estudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        
        double[] notas = new double[cantidad_estudiantes];
        int estudiantes_perdidos = 0;
        int estudiantes_aprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + (i+1)));
            
            if (notas[i] < 0 || notas[i] > 5) {
                i = i - 1;
                JOptionPane.showMessageDialog(null, "El sistema de notas esta comprendido entre 0 y 5, vuelve a ingresar la nota del estudiante)" + (i+1));
            } else {
                if (notas[i] >= 3) {
                    estudiantes_aprobados++;
                } else {
                    estudiantes_perdidos++;
                }
            }
        }
        
        double suma_notas = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma_notas += notas[i];
            System.out.println("La nota del estudiante " + (i+1) +  " es " + notas[i]);
        }
        
        JOptionPane.showMessageDialog(null, "El promedio del curso es : " + (df.format(suma_notas/notas.length)));
        JOptionPane.showMessageDialog(null, "Estudiantes aprobados : " + estudiantes_aprobados + 
                "\nEstudiantes reprobados : " + estudiantes_perdidos);
        
    }
}
