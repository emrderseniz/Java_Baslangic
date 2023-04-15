public class MetotDenemeMinimal {
    public static int topla(int x, int y) { // İki sayıyı toplayan metot
        return x + y;
    }

    public static boolean ciftMi(int x) { // Bir sayının çift olup olmadığını kontrol eden metot
        return x % 2 == 0;
    }

    public static int fiboHesap(int x) { // Fibonacci sayısını hesaplayan metot
        int a = 0, b = 1, toplam = 0;
        for (int i = 1; i <= x; i++) {
            toplam = a + b;
            a = b;
            b = toplam;
            System.out.println(toplam);
        }
        return toplam;
    }

    public static void main(String[] args) {
    	int x;  
        System.out.println(x = topla(54, 4));   // İki sayının toplamını hesaplar ve sonucu x değişkenine atar
        System.out.println(ciftMi(x) ? "sayı çift" : "sayı tek"); // x değişkeninin çift olup olmadığını kontrol eder ve sonucu ekrana yazdırır
        System.out.println(fiboHesap(10));// 5. Fibonacci sayısını hesaplayarak sonucu ekrana yazdırır
    }
}
