import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (KG) : ");
        int kilo = scan.nextInt();
        System.out.print("Boyunuzu giriniz (METRE): ");
        double boy = scan.nextDouble();

        double index = kilo / (boy * boy);
        System.out.println("Indeksiniz: " + index);
        if (index < 25 && index > 18) {
            System.out.println("*******Ideal kilodasiniz**********");
        }else if (index < 18) {
            System.out.println("*******Zayif**********");
        }else
            System.out.println("************kilolu*************");
    }
}
