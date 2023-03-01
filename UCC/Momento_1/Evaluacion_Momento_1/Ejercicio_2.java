package UCC.Momento_1.Evaluacion_Momento_1;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Ejercicio_2 {
    public static void main(String[] args) {

        final int salariomin = 1_300_000;
        double descSalud = 0;
        double descPension = 0;

        double tSalario = 0;

        NumberFormat nfc =  NumberFormat.getCurrencyInstance(Locale.US); 
        int nVentas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de ventas" ));

        double porcentaje = 0;

        if ((nVentas > 0) && (nVentas <= 50_000)) {
            porcentaje = 0.06;
        } else if ((nVentas > 50_001) && (nVentas <= 90_000)) {
            porcentaje = 0.09;
        } else if ((nVentas > 90_001) && (nVentas <= 120_000)) {
            porcentaje = 0.12;
        } else if ((nVentas > 120_001) && (nVentas <= 250_000)) {
            porcentaje = 0.15;
        } else if (nVentas > 250_001) {
            porcentaje = 0.20;
        }

        if ((porcentaje * nVentas) > salariomin * 0.8) {
            descSalud = 0.05;
            descPension = 0.05;
            tSalario = (porcentaje * nVentas) - ((porcentaje * nVentas) * descSalud) - ((porcentaje * nVentas) * descPension);
        } else {
            tSalario = (porcentaje * nVentas);
        }
        
        JOptionPane.showMessageDialog(null, "Ventas realizadas : " + nfc.format(nVentas) +
        "\nComision : " + nfc.format(porcentaje) +
        "\nDescuento Salud : " + descSalud + "%" +
        "\nDescuento Pension : " + descPension + "%" +
        "\nTotal : " + nfc.format(tSalario), "Total", 3);

    }
}
