import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Conversor_Divisa_DoWhile {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int menu = 0;
        double cantidad = 0;
        int opcion = 0;
        NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);

        do {
            if (opcion == 0) {

                System.out.println("Ingrese la cantidad de pesos (COP) : ");
                cantidad = in.nextDouble();
            
                System.out.println("----------Menu----------");
                System.out.println("1. COP a USD");
                System.out.println("2. COP a EUR");
                System.out.println("3. COP a MXN");
                System.out.println("4. Salir");
                
                System.out.println("Ingrese la operacione a realizar : ");
                menu = in.nextInt();
    
                if (menu == 1) {
                    System.out.println("COP a USD : " + nfc.format(cantidad/4750));
                } else if (menu == 2) {
                    System.out.println("COP a EUR : " + nfc.format(cantidad/5010));
                } else if (menu == 3) {
                    System.out.println("COP a MXN : " + nfc.format(cantidad/265));
                } else if (menu == 4) {
                    System.out.println("Saliendo del programa...");
                }
            } else {
                System.out.println("Desea hacer otra conversion (Si = 0/No = 1) ? : ");
                opcion = in.nextInt();
                menu = 4;
            }
            
            opcion = 1;

        } while(menu!=4); 

        in.close();
    }
}
