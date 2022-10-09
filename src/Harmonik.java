import java.text.DecimalFormat;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("Ikinci sayiyi giriniz: ");
        double b = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        double harmonic = (2 * a * b) / ( a + b );
        System.out.println("Harmonik ortalamsi: " + decimalFormat.format(harmonic));
    }
}

