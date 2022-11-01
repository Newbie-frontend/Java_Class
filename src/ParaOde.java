import java.util.Scanner;

public class ParaOde {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplam tutari giriniz: ");
        Para kullanci = new Para();
        double tutar = scan.nextDouble();
        kullanci.setToplamTutar(tutar);
        System.out.println("Toplam odenen parayi giriniz: ");
        double odenen = scan.nextDouble();
        kullanci.setOdenenTutar(odenen);
        kullanci.yazdir();
    }
}
