import java.text.DecimalFormat;
import java.util.Scanner;

public class AlanCevre {
    public static void main(String[] args) {
        System.out.print("Dairenin yaricapini giriniz: ");

        Scanner scanner = new Scanner(System.in);

        int yariCap = scanner.nextInt();
        Double cevre = 2 * Math.PI * yariCap;
        Double alan = Math.PI * Math.pow(yariCap, 2);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        String a = "sdfhsdf";




        System.out.println("Dairenin cevresi: " + decimalFormat.format(cevre)+ "\n"+ "Dairenin Alani: "+ decimalFormat.format(alan));

    }
}
