import java.util.Scanner;

public class Personas_Mayores {
    public static void main(String[] args) {

        Scanner npersonas = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas :");
        int personas = npersonas.nextInt();

        int mayor = 0;
        int menor = 0; 

        for (int i = 1;i <= personas;i++) {

            System.out.println("Ingrese la edad de la persona No" + (i));
            int edad = npersonas.nextInt();

            if (edad >= 18) {
                mayor++;
            } else {
                menor++;
            }
        }

        System.out.println("Personas mayores de edad : " + mayor + "\nPeronas menores de edad : " + menor);
        npersonas.close();
    }
}
