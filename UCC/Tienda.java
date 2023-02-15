package UCC;
import java.util.Scanner;
public class Tienda {

    public static void main(String[] args) {
        String[] productos = {"CocaCola", "Chocorramo", "PonyMalta", "Galletas de Chocolate", "Naranjas"};
        double[] precios = {2000, 1500, 2500, 1000, 500};
        int[] cantidades = new int[5];
        double subtotal = 0;
        double iva = 0.19;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra tienda virtual. Los productos disponibles son:");

        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1) + ". " + productos[i] + " - $" + precios[i]);
        }

        System.out.println("Por favor ingrese la cantidad de productos que desea comprar:");

        for (int i = 0; i < productos.length; i++) {
            System.out.print(productos[i] + ": ");
            int cantidad = scanner.nextInt();
            cantidades[i] = cantidad;
            subtotal += cantidad * precios[i];
        }

        double totalIva = 0;
        double total = 0;

        System.out.println("Colilla de pago:");

        for (int i = 0; i < productos.length; i++) {
            if (cantidades[i] > 0) {
                double precioProducto = precios[i] * cantidades[i];
                double ivaProducto = precioProducto * iva;
                totalIva += ivaProducto;
                total += precioProducto + ivaProducto;

                System.out.println(cantidades[i] + " x " + productos[i] + " - $" + precioProducto);
            }
        }
        scanner.close();

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total IVA (19%): $" + totalIva);
        System.out.println("Total a pagar: $" + total);
    }
}
