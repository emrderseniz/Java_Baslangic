import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        // 7 elemanlı bir notlar dizisi tanımlanıyor
        int[] notlar = new int[7];

        // Kullanıcıdan notlar alınıyor
        System.out.println("Hoşgeldiniz! Sırayla notlarınızı giriniz. Çıkmak için -1 girin.");
        Scanner girdi = new Scanner(System.in);
        int i = 0;
        int girilenNot;
        do {
            System.out.print((i+1) + ". ders notu: ");
            girilenNot = girdi.nextInt();
            
                notlar[i++] = girilenNot;
            
        } while (i < notlar.length);

        // Notların ortalaması hesaplanıyor
        double toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        double ortalama = toplam / notlar.length;

        // Ortalama ekrana yazdırılıyor
        System.out.println("Ortalama: " + ortalama);
    }
}
