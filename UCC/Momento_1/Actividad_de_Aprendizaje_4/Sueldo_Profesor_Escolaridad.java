package UCC.Momento_1.Actividad_de_Aprendizaje_4;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Sueldo_Profesor_Escolaridad {
    public static void main(String[] args) {
        
        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);

        String eEscolaridad = JOptionPane.showInputDialog(null, "Ingrese su Escolaridad :\n- Profesional\n- Especialista\n- Magister\n- Doctor", "Escolaridad", 3);
        
        int vHora = 0;

        switch (eEscolaridad.toLowerCase()) {
            case "profesional":
                vHora = 33_000;
                break;
            case "especialista":
                vHora = 43_000;
                break;
            case "magister":
                vHora = 50_000;
                break;
            case "doctor":
                vHora = 70_000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Debes ingresar una escolaridad valida", "Error", 2);
        }

        if (vHora != 0) {

            int nHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas","Horas Trabajadas",3));

            JOptionPane.showMessageDialog(null, 
                "Sueldo Bruto : " + nfc.format(nHoras*vHora) +
                "\nDescuento Salud (5%) : " + nfc.format( (nHoras*vHora) * 0.05 ) + 
                "\nDescuento Pension (4%) : " + nfc.format( (nHoras*vHora) * 0.04 ) + 
                "\nTotal Descuentos : " + nfc.format( ((nHoras*vHora) * 0.05) + ((nHoras*vHora) * 0.04) ) +  
                "\nSueldo Neto : " + nfc.format( (vHora*nHoras) - (( (nHoras*vHora) * 0.05 ) + ( (nHoras*vHora) * 0.04)) ) , "Colilla de Pago", 3);
            }
    }
}
