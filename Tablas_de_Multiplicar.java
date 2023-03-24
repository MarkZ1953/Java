import java.util.Scanner;

public class Tablas_de_Multiplicar {

    public void TablaMultiplicar(int limite) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + limite + " = " + (limite * i));
        }
    }

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese la tabla que desea : ");
        int limite = n.nextInt();

        while (true) {

            if (limite > 0) {
                break;
            } else {
                System.out.println("Tienes que ingresar un numero mayor a 0");

                System.out.println("Ingrese la tabla que desea : ");
                limite = n.nextInt();
            }
        }

        Tablas_de_Multiplicar objeto = new Tablas_de_Multiplicar();

        objeto.TablaMultiplicar(limite);

        n.close();
    }
}
