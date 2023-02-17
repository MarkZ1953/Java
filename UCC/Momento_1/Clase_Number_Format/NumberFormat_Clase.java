package UCC.Momento_1.Clase_Number_Format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_Clase {
  public static void main(String[] args) {
    int numero = 1234567;

    //NumberFormat nf = NumberFormat.getInstance(Locale.US);
    NumberFormat nfc = NumberFormat.getCurrencyInstance(Locale.US);
    //nf.setGroupingUsed(true);

    System.out.println(nfc.format(numero));
  }
}