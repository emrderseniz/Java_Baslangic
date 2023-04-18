import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {

    public static void main(String[] args) {
        int tahmin, can = 0, sayi;
        int[] tahminTut = new int[5];
        Scanner girdi = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Sayı tahmin oyununa hoş geldiniz!\nToplam 5 tahmin hakkınız bulunmaktadır.\n1-100 arasında bir tam sayı tahmin ediniz.");
        sayi = rastgele.nextInt(100) + 1;

        while (can < 5) {
            tahmin = girdi.nextInt();
            tahminTut[can] = tahmin;
            if (tahmin == sayi) {
                System.out.println("Tebrikler, doğru sayıyı buldunuz! Sayı: " + sayi + ", kalan can sayınız: " + (5 - can - 1));
                break;
            } else if (can < 4) {
                System.out.println("Tahmininiz yanlış, lütfen tekrar deneyin. Kalan can sayınız: " + (5 - can - 1));
            } else {
                System.out.println("Maalesef hakkınız bitti! Doğru sayı: " + sayi);
                break;
            }
            can++;
        }
        // Tahminlerin tutulduğu dizinin elemanları ekrana yazdırılıyor
        System.out.print("Tahminler:");
        for (int tahminler : tahminTut) {
            System.out.print("[" + tahminler + "]");
        }
        girdi.close();
    }
}
