package UCC.Momento_1.Actividad_no_4_Condicionales.Sistema_Temperatura;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Sistema_Temperatura {
    public static void main(String[] args) {
        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);
        float vCompra = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio de su compra"));
        String fPago = JOptionPane.showInputDialog(null, "Pago de contado? (Responder si o no)");
        
        String opcion = "";
        double tPago = 0;

        if (fPago.toLowerCase().equals("si")) {
            tPago = vCompra - (vCompra * 0.07);
            opcion = "Descuento";
        } else {
            tPago = vCompra + (vCompra * 0.05);
            opcion = "Recargo";
        }
        
        JOptionPane.showMessageDialog(null, "Valor de la Compra : " + vCompra + 
        "\nPago de contado ? : " + fPago.toUpperCase() +  
        "\n" + opcion + " : " + nfc.format(tPago)) ;
    }
}
