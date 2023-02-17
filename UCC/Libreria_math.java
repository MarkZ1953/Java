package UCC;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Libreria_math {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero para calcular la Raiz : "));
        JOptionPane.showMessageDialog(null, "La raiz de " + numero + " es " + df.format(Math.sqrt(numero)), "Resultado", 1, null);
    }
}
