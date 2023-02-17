package UCC;
import javax.swing.JOptionPane;

public class Libreria_Math_Random {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        JOptionPane.showMessageDialog(null, "El numero generado aleatoriamente entre 0 y " + numero + " es " + Math.round(Math.random()*numero), null, 3);
     
    }
}
