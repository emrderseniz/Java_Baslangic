public class PalindramimsiSayilar {
    public static boolean palindromMu(int x) {
        int hedefSayi = 0, orjSayi = x;
        while (x != 0) {
            int sonRakam = x % 10;
            x /= 10;
            hedefSayi = hedefSayi * 10 + sonRakam;
        }
        return hedefSayi == orjSayi;
    }

    public static void main(String[] args) {
        int kontrol = 1231;
        System.out.println(palindromMu(kontrol));
    }
}
