import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);
        int userNum;
        do {
            System.out.println("Bir Sayi Giriniz : ");
            userNum = scan.nextInt();
            if ( userNum == randomNum) {
                System.out.println("Tebrikler sayiyi buldunuz.");
                System.out.println("Sizin sayiniz : " + userNum);
                System.out.println("Istenilen sayi : " + randomNum);
            }
            else if ( userNum < randomNum) {
                System.out.println(">>>>>>>>>>>>>> Yukari");
            }
            else
                System.out.println("<<<<<<<<<<<< Asaga");
        }while ( userNum != randomNum);
    }
}
