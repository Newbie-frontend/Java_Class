import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaArrList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tire = "--------------------------------------";

        List<Araba> cars = new ArrayList<>();
        cars.add(new Araba("Volvo", "Recharge", "beyaz", 2020, "SUV", "06 AB 110", 20000));
        cars.add(new Araba("Fiat", "Egea", "siyah", 2011, "Sedan", "06 AB 111", 20000));
        cars.add(new Araba("Ford", "Mustang", "kirmizi", 2013, "SUV", "06 AB 112", 20000));
        cars.add(new Araba("Hyundai", "Accent", "mavi", 2010, "Sedan", "06 AB 113", 20000));
        cars.add(new Araba("Hon`da", "Civic", "gri", 2015, "Sedan", "06 AB 114", 20000));
        cars.add(new Araba("Peugeot", "207i", "sari", 2012, "Compact-Car", "06 AB 115", 20000));
        cars.add(new Araba("Togg", "C-Mpv", "kahverengi", 2020, "Minivan", "06 AB 116", 20000));

        for (int i = 0; i < 7; i++) {
            cars.get(i).bilgiYazdir();
            System.out.println(tire);
        }
        Araba newCar = new Araba("Opel", "insignia", "Beyaz", 2021, "Sedan", "06 AB 123", 20000);
        cars.set(2, newCar);

        System.out.print("Aramak istediginiz ozelligi giriniz(Marka - Sinif - Renk): ");
        String ozellik = scan.next();

        System.out.print("Aramak istediginiz ozelligin degerini giriniz: ");
        String searched = scan.next();
        System.out.println(tire);

        if (ozellik.equalsIgnoreCase("marka")) {
            cars.forEach((n) -> {
                if (searched.equalsIgnoreCase(n.getMarka())) {
                    n.bilgiYazdir();
                    System.out.println(tire);
                }
            });
        } else if (ozellik.equalsIgnoreCase("model")) {
            cars.forEach((n) -> {
                if (searched.equalsIgnoreCase(n.getModel())) {
                    n.bilgiYazdir();
                    System.out.println(tire);
                }
            });
        } else if (ozellik.equalsIgnoreCase("renk")) {
            cars.forEach((n) -> {
                if (searched.equalsIgnoreCase(n.getRenk())) {
                    n.bilgiYazdir();
                    System.out.println(tire);
                }
            });
        }
    }

}
