package UCC.Momento_1.Evaluacion_Momento_1;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {

        NumberFormat nfc =  NumberFormat.getCurrencyInstance(Locale.US); 

        String nombre  = JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor");
        int vVive100 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Vive 100 vendidos"));

        final int pVive100 = 2_500;
        final int comision = 400;

        JOptionPane.showMessageDialog(null, "Nombre del Vendedor : " + nombre +
        "\nVive100 vendidos : " + vVive100 +
        "\nTotal ventas : " + nfc.format(pVive100 * vVive100) +
        "\nComision del Vendedor : " + nfc.format(comision * vVive100), "Total", 3);
    }
}
