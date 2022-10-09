import java.util.Scanner;

public class MerhabaAd {
    public static void main(String[] args) {
        System.out.println("Adinizi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String ad = scanner.nextLine();
        System.out.println("Merhaba " + ad + "!");
    }
}
