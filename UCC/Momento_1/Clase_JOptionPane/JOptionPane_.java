package UCC.Momento_1.Clase_JOptionPane;
import javax.swing.JOptionPane;

public class JOptionPane_ {
    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        
        JOptionPane.showMessageDialog(null, "Su nombre es :" + nombre + "\nSu edad es :" + edad , "Nombre y Edad", 1, null);

        /*
         * MessageType :
         * 1 : Mensaje de Informacion
         * 2 : Mensaje de Advertencia
         * 3 : Mensaje de Pregunta
         */
    }
}
