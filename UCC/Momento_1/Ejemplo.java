package UCC.Momento_1;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Ejemplo {
    public static void main(String[] args) {
        
        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);

        String eEscolaridad = JOptionPane.showInputDialog(null, "Ingrese su Escolaridad :\n- Profesional\n- Especialista\n- Magister\n- Doctor", "Escolaridad", 3);
        
        int vHora = 0;

        switch (eEscolaridad.toLowerCase()) {
            case "profesional":
                vHora = 50_000;
                break;
            case "especialista":
                vHora = 55_000;
                break;
            case "magister":
                vHora = 60_000;
                break;
            case "doctor":
                vHora = 70_000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Debes ingresar una escolaridad valida", "Error", 2);
        }

        if (vHora != 0) {

            int nHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas","Horas Trabajadas",3));

            JOptionPane.showMessageDialog(null,  "\nSueldo Neto : " + nfc.format( (vHora*nHoras)  ) , "Colilla de Pago", 3);

        }
    }
}


