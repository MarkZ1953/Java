package Condicionales;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingresa un numero : ");
      int diaSemana = scanner.nextInt();
      System.out.println("Has ingresado el numero : " + diaSemana);
      scanner.close();

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
          System.out.println("Día de la semana no válido");
          break;
      }
    }
  }