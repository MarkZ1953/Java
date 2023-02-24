package UCC.Momento_1.Ejecicio_Notas;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EjercicioNotas {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.0");
        String mensaje = "Las notas deben estar comprendidas entre 1 y 5";

        double taller1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del taller 1"));

        if (taller1 >= 1 &&  taller1 <= 5) {
            JOptionPane.showMessageDialog(null, mensaje);
        }

        double taller2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del taller 2"));

        if (taller2 >= 1 &&  taller2 <= 5) {
            JOptionPane.showMessageDialog(null, mensaje);
        }

        double parcial = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del parcial"));

        if (parcial >= 1 &&  parcial <= 5) {
            JOptionPane.showMessageDialog(null, mensaje);
        }
        

        double promedio = (taller1*0.25) + (taller2 * 0.35) + (parcial * 0.40);

        if (((taller1<5) && (taller2 < 5) && (parcial < 5))) {
            if (promedio >= 3) {
                JOptionPane.showMessageDialog(null, "\nNota final : " + df.format(promedio) + "\nEl estudiante aprobo" );
            } else {
                JOptionPane.showMessageDialog(null, "\nNota final : " + df.format(promedio) + "El estudiante reprobo");
            }
        }
       
    }
}
