import java.util.Scanner;

public class DortIslemRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sayi1;
        double sayi2;
        String islem;
        String devam;
        do {
            System.out.print("Birinici sayiyi giriniz: ");
            sayi1 = scan.nextDouble();
            System.out.print("Ikinci sayiyi giriniz: ");
            sayi2 = scan.nextDouble();
            DortIslem sample = new DortIslem(sayi1, sayi2);
            System.out.print("islemi giriniz(+, -, *, /): ");
            islem = scan.next();
            if (islem.equals("+")) {
                System.out.println("Toplama sonucu: " + sample.topla());
            }
            if (islem.equals("-")) {
                System.out.println("Cikarma sonucu: " + sample.cikar());
            }
            if (islem.equals("*")) {
                System.out.println("Carpma sonucu: " + sample.carp());
            }
            if (islem.equals("/")) {
                System.out.println("Bolme sonucu: " + sample.bol());
            }
            System.out.print("Devam etmek istiyor musunuZ?");
            devam = scan.next();

        }while(!(devam.equals("H") || devam.equals("h")));
    }
}
