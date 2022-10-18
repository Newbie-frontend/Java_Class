import java.lang.reflect.Array;
import java.util.Scanner;

public class Palindromik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Kelime giriniz: ");
        String kelime = scan.next();
        int len = kelime.length();
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (kelime.charAt(i) != kelime.charAt(len - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Kelime Palindrom");
        } else
            System.out.println("Kelime Palindrom Degil.");

        System.out.print(kelime + "   ");
        for (int i = 0; i < len; i++) {
            System.out.print(kelime.charAt(len - 1 - i));
        }
    }
}




