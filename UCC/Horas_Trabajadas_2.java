package UCC;
import javax.swing.JOptionPane;

public class Horas_Trabajadas_2 {
    public static void main(String[] args) {
        int nHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas trabajadas"));
        final int vHora = 50000;
        JOptionPane.showMessageDialog(null, "\nSueldo Bruto : $" + (nHoras*50000) + "\nDescuento en Salud : $" + ((nHoras * vHora) * 0.05) +  "\nDescuento en Pension : $" + ((nHoras * vHora) * 0.06) + "\nTotal Descuentos : $" + (nHoras *  vHora) * 0.11 + "\nSueldo Neto : $" + (nHoras*vHora - (nHoras *  vHora) * 0.11), "Colilla de Pago", 1);
    }
}