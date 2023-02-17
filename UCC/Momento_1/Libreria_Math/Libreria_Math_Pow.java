package UCC.Momento_1.Libreria_Math;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Libreria_Math_Pow {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero para saber su potencia"));
        double potencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la potencia del numero que desea"));
        JOptionPane.showMessageDialog(null, "El numero " + numero + " elevado a la " + potencia + " es : " + df.format(Math.pow(numero, potencia)) , "Resultado", 3, null);
    }
}
