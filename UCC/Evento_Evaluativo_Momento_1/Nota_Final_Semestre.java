package UCC.Evento_Evaluativo_Momento_1;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Nota_Final_Semestre {
    public static void main(String[] args) {

        System.out.println("Calculadora - Final de Semestre");
        
        List<Integer> ListaCreditos = new ArrayList<Integer>();
        List<Float> ListaNotas = new ArrayList<Float>();
        DecimalFormat df = new DecimalFormat("#0.00");

        for (int i = 0; i < 4; i++) {

            ListaCreditos.add(i, Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los creditos del Curso N" + (i+1),"Calculadora - Final de Semestre",3)));

            ListaNotas.add(i, Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la Nota final del Curso N" + (i+1),"Calculadora - Fianl de Semestre",3)));
        }
        
        int SumaCreditos = 0;
        float Resultado = 0;

        for (int i = 0; i < 4; i++) {
            Resultado += ListaCreditos.get(i) * ListaNotas.get(i);
            SumaCreditos += ListaCreditos.get(i);
        }

        double Promedio = Resultado/SumaCreditos;
        JOptionPane.showMessageDialog(null,"Promedio del Semestre : " + df.format(Promedio),"Nota Final",1);
    }
}
