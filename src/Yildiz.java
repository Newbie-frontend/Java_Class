import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args) {
        System.out.println("---------------Yildiz Basma Programi---------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz: ");
        int yildiz = scan.nextInt();

        for (int i = 0; i < yildiz; i++) {
            for (int j = 0; j <= yildiz-i; j++) {
                System.out.print(" ");
            }
            for (int j = -1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
