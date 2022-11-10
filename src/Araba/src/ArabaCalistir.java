import java.util.Scanner;

public class ArabaCalistir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tire = "--------------------------------------";

        Araba[] cars = new Araba[7];
        // for (int i = 1; i < 3; i++) {
        // System.out.println(i + " .Arabanin bilgilerini giriniz: ");
        // System.out.print("Marka: ");
        // String marka = scan.next();
        // System.out.print("Model: ");
        // String model = scan.next();
        // System.out.print("Renk: ");
        // String renk = scan.next();
        // System.out.print("Yil: ");
        // int yil = scan.nextInt();
        // System.out.print("Sinif: ");
        // String sinif = scan.next();
        // System.out.print("Plaka: ");
        // String plaka = scan.next();
        // System.out.print("Kilometre: ");
        // int kilometre = scan.nextInt();
        // cars[i-1] = new Araba(marka, model, renk, yil, sinif, plaka, kilometre);
        // }
        cars[0] = new Araba("Volvo", "Recharge", "beyaz", 2020, "SUV", "06 AB 110", 20000);
        cars[1] = new Araba("Fiat", "Egea", "siyah", 2011, "Sedan", "06 AB 111", 20000);
        cars[2] = new Araba("Ford", "Mustang", "kirmizi", 2013, "SUV", "06 AB 112", 20000);
        cars[3] = new Araba("Hyundai", "Accent", "mavi", 2010, "Sedan", "06 AB 113", 20000);
        cars[4] = new Araba("Honda", "Civic", "gri", 2015, "Sedan", "06 AB 114", 20000);
        cars[5] = new Araba("Peugeot", "207i", "sari", 2012, "Compact-Car", "06 AB 115", 20000);
        cars[6] = new Araba("Togg", "C-Mpv", "kahverengi", 2020, "Minivan", "06 AB 116", 20000);

        for (Araba car : cars) {
            car.bilgiYazdir();
            System.out.println(tire);
        }

        cars[3].setMarka("Opel");
        cars[3].setModel("insignia");
        cars[3].setRenk("Beyaz");
        cars[3].setYil(2021);
        cars[3].setSinif("Sedan");
        cars[3].setPlaka("06 AB 123");

        System.out.print("Aramak istediginiz ozelligi giriniz(Marka - Sinif - Renk): ");
        String ozellik = scan.next();

        System.out.print("Aramak istediginiz ozelligin degerini giriniz: ");
        String searched = scan.next();

        System.out.println(tire);
        int count = 0;
        if (ozellik.equalsIgnoreCase("marka")) {
            System.out.println("girdi");
            for (Araba car : cars) {
                if (searched.equalsIgnoreCase(car.getMarka())) {
                    count++;
                    car.bilgiYazdir();
                    System.out.println(tire);
                }
            }
            System.out.println(ozellik + "'si " + searched + " olan araba/arabalarin sayisi: " + count);
        } else if (ozellik.equalsIgnoreCase("model")) {
            for (Araba car : cars) {
                if (searched.equalsIgnoreCase(car.getSinif())) {
                    count++;
                    car.bilgiYazdir();
                    System.out.println(tire);
                }
            }
            System.out.println(ozellik + "'i " + searched + " olan araba/arabalarin sayisi: " + count);
        } else if (ozellik.equalsIgnoreCase("renk")) {
            for (Araba car : cars) {
                if (searched.equalsIgnoreCase(car.getRenk())) {
                    count++;
                    car.bilgiYazdir();
                    System.out.println(tire);
                }
            }
            ozellik = "reng";
            System.out.println(ozellik + "'i " + searched + " olan araba/arabalarin sayisi: " + count);
        }

        scan.close();
    }
}
