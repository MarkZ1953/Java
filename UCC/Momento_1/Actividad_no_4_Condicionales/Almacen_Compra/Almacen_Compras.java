package UCC.Momento_1.Actividad_no_4_Condicionales.Almacen_Compra;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Almacen_Compras {
    public static void main(String[] args) {
        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);
        float vCompra = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio de su compra"));
        String fPago = JOptionPane.showInputDialog(null, "Pago de contado? (Responder si o no)");
        
        String opcion = "";
        double desc = 0;
        double tPago = 0;

        if (fPago.toLowerCase().equals("si")) {
            desc = 0.07;
            tPago = vCompra - (vCompra * desc);
            opcion = "Descuento";
        } else {
            desc = 0.05;
            tPago = vCompra + (vCompra * desc);
            opcion = "Recargo";
        }
        
        JOptionPane.showMessageDialog(null, "Valor de la Compra : " + nfc.format(vCompra) + 
        "\nPago de contado ? : " + fPago.toUpperCase() +  
        "\n" + opcion + " : " + nfc.format(desc * vCompra) +
        "\nTotal a pagar : " + nfc.format(tPago)) ;
    }
}
