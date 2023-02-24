package UCC.Momento_1.Ejercicio;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Producto_Descuentos {
    public static void main(String[] args) {

        float vProducto = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el valor del producto"));
        String tPago = JOptionPane.showInputDialog(null, "Ingrese el tipo de pago :\nEfectivo\nDebito\nCredito");

        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);
        
        double desc = 0;
        String metodo = "";

        switch (tPago.toLowerCase()) {
            case "efectivo":
            metodo = "Efectivo";
            desc = 0.07;
            break;
            case "debito":
            metodo = "Debito";
            desc = 0.05;
            break;
            case "credito":
            metodo = "Credito";
            desc = 0.02;
            break;
        }
        
        JOptionPane.showMessageDialog(null,"Precio Producto : " + nfc.format(vProducto) +
        "\nMetodo de Pago : " + metodo +
        "\nDescuento : " + nfc.format(desc * vProducto) + 
        "\n Total a Pagar : " + nfc.format(vProducto - (vProducto * desc)), "Colilla de Pago", 3);
    }
}
