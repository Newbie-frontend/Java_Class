import java.text.DecimalFormat;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutari giriniz: ");
        double tutar = scanner.nextDouble();
        System.out.print("KDV oranini giriniz: ");
        double kdv = scanner.nextDouble();

        double netTutar = tutar * ( 100 - kdv) / 100;
        double kdvTutar = tutar * kdv / 100;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(2);

        System.out.println("KDV Haric Net Tutar: " + decimalFormat.format(netTutar) + " tl" +
                "\nKDV Tutari: " + decimalFormat.format(kdvTutar) + " tl");

    }
}
