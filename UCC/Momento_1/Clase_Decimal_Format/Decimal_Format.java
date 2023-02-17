package UCC.Momento_1.Clase_Decimal_Format;
import java.text.DecimalFormat;

public class Decimal_Format {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        /*
        * df = DecimalFormat, el nombre de la variable es indiferente. Puede ser cualquier otro nombre.
        */
        double numero = 33422.12441251512;

        System.out.println("Numero con Formato(DecimalFormat) : " + df.format(numero));
    }
}
