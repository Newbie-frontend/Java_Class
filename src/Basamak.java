import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("4 Basamakli bir sayi giriniz: ");
        int a;
        do {
            a = scanner.nextInt();
            if (a > 10000 || a < 999) {
                System.out.println("Sayi 4 basamakli degil! Tekrar deneyin: ");
            }
        } while (a > 10000 || a < 999);

        int basamakToplami = a % 10 + (a / 10 % 10) + (a/100%10) + (a/1000%10);

        System.out.println(basamakToplami);
    }
}
