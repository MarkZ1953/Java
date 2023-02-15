import java.util.Scanner;

public class Valores {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un número: ");
    int numero = scanner.nextInt();
    System.out.println("Has ingresado el número " + numero);
    scanner.close();
  }
}
