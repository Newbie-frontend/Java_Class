import java.util.Scanner;

public class Sayi {
    private final int [] sayi = new int[10];
    private int bulunanIndex;
    private double toplam = 0;
    private double ortalama = 0;
    public int[] getSayi() {
        return sayi;
    }

    Scanner scan = new Scanner(System.in);

    public void sayilariAl() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ". Sayiyi giriniz(1-100): ");
            boolean control;
            do {
                sayi[i] = scan.nextInt();
                control = sayi[i] < 1 || sayi[i] > 100;
                System.out.print(control ? "Sayiyi 1 ile 100 arasi olmasi gerek. Tekrar deneyin: " : "");
            } while (control);
        }
    }
    public boolean sayiBul(int temp) {
        boolean flag = false;
        for (int i = 0; i < this.sayi.length; i++)
            if (this.sayi[i] == temp) {
                flag = true;
                this.bulunanIndex = i;
                break;
            }
        return flag;
    }
    public void varMi() {
        System.out.print("Bulmak istediginiz sayiyi giriniz: ");
        boolean bulunduMu =  this.sayiBul(scan.nextInt());
        System.out.println(bulunduMu ? "BULUNDU" : "BULUNAMADI");
    }

    public void sayilariYazdir(int [] list) {
        int i = 1;
        for (int item: list) {
            System.out.print("[#" + i++ + " sayi= " + item + "] ");
        }
        System.out.println();
    }

    public void toplamVeOrtalama() {
        for (int i = 0; i < 10; i++)
            this.toplam += (float)(this.sayi[i]);
        this.ortalama = this.toplam / this.sayi.length;
    }

    public int enBuyuk() {
        int enBuyuk = sayi[0];
        for (int item: sayi) {
            if (enBuyuk <= item) {
                enBuyuk = item;
            }
        }
        return enBuyuk;
    }

    public int enKucuk() {
        int enKucuk = sayi[0];
        for (int item: sayi) {
            if (enKucuk >= item) {
                enKucuk = item;
            }
        }
        return enKucuk;
    }

    public void ozellikYazdir() {
        this.toplamVeOrtalama();
        System.out.println("Toplam: " + this.toplam);
        System.out.println("Ortalama: " + this.ortalama);
        System.out.println("En Kucuk sayi: " + this.enKucuk());
        System.out.println("En Buyuk sayi: " + this.enBuyuk());
    }

    public int[] sayiyiSil(int[] arr)
    {
        System.out.println("Silinen Sayinin indisi: " + this.bulunanIndex);
        if (arr == null || this.bulunanIndex < 0 || this.bulunanIndex >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == this.bulunanIndex) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public void silmek() {
        System.out.print("Silmek istediginiz sayiyi giriniz: ");
        boolean varMi = this.sayiBul(scan.nextInt());
        if (varMi) {
            int[] x= this.sayiyiSil(this.getSayi());
            this.sayilariYazdir(x);
        }
        else
            System.out.println("Bulunamadi");
    }
}
