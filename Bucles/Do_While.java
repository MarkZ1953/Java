package Bucles;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a imprimir : ");
        int num = entrada.nextInt();

        do {
            System.out.println(i);
            i++;
        } while(i<=num); 

        entrada.close();
    }
}
