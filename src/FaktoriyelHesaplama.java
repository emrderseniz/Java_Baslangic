import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        // Kullanıcıdan pozitif tamsayı değeri girmesini isteyin
        System.out.print("Faktöriyeli hesaplanacak pozitif tamsayı değerini girin: ");
        int sayi = girdi.nextInt();

        // Hata kontrolü: Girilen değerin pozitif tamsayı olması gerekiyor
        while (sayi < 0) {
            System.out.print("Lütfen pozitif bir tamsayı girin: ");
            sayi = girdi.nextInt();
        }

        // Faktöriyel hesaplaması
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        // Sonucu ekrana yazdırma
        System.out.println(sayi + "! = " + faktoriyel);

        girdi.close();
    }
}
