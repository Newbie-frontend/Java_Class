import java.sql.SQLOutput;
import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String devam;
        int i = 1;
        double toplam = 0;
        int toplamKredi = 0;
        String h = "h";
        String H = "H";
        do {
            System.out.print(i + ". Dersin kerdisini giriniz: ");
            int kredi = scan.nextInt();
            System.out.print(i + ". Dersin Herf notunu giriniz: ");
            String harf = scan.next();
            System.out.println("Devam etmek istiyor musunuz? ");
            devam = scan.next();
            if (kredi > 6 || kredi < 1) {
                System.out.println("1");
                continue;
            }
            if (!(harf.equals("AA") || harf.equals("BA") || harf.equals("BB") || harf.equals("CB") ||
                    harf.equals("CC")  || harf.equals("DC")  || harf.equals("FD")  || harf.equals("FF")) ){
                System.out.println("2");
                continue;
            }

            double harfNotKarsi = 0;
            switch (harf) {
                case "AA":
                    harfNotKarsi = 4;
                    break;
                case "BA":
                    harfNotKarsi = 3.5;
                    break;
                case "BB":
                    harfNotKarsi = 3.0;
                    break;
                case "CB":
                    harfNotKarsi = 2.5;
                    break;
                case "CC":
                    harfNotKarsi = 2.0;
                    break;
                case "DC":
                    harfNotKarsi = 1.5;
                    break;
                case "DD":
                    harfNotKarsi = 1.0;
                    break;
                case "FD":
                    harfNotKarsi = 0.5;
                    break;
                case "FF":
                    harfNotKarsi = 0.0;
                    break;
            }
            toplam += harfNotKarsi * kredi;
            toplamKredi += kredi;

            i++;

        } while (devam.equalsIgnoreCase(h) != true);
        double agno = toplam / toplamKredi;
        System.out.println( "AGNO: " + agno);
        if ( agno >= 3.5 ) {
            System.out.println("yuksek onur belgesi aldiniz.");
        }else if ( agno >= 3.0) {
            System.out.println("Onur belgesi aldiniz");
        }
        System.out.println("Toplam ders sayisi: " + (i - 1));
    }
}
