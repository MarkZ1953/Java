package Condicionales;
import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        
        int diaSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));

      switch (diaSemana) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
          JOptionPane.showMessageDialog(null, "Día de la semana no válido", "Error", 1);
          break;
      }
    }
  }