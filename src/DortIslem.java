import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {
		System.out.println("2 sayı ile istenilen 4 işlemden birini yapma sistemi");
		float a,b,sonuc;
		char islem;
		Scanner girdi=new Scanner(System.in);
		System.out.println("Yapmak istediğin işlemin sembolunu giriniz\n çarpma için '*' \n bölme için '/' \n toplama için '+' \n çıkarma için '-'");
		islem=girdi.next().charAt(0);
		switch (islem) {
		case '+':
			System.out.println("Birinci rakamı girin: ");
			a=girdi.nextFloat();
			System.out.println("İkinci rakamı girin: ");
			b=girdi.nextFloat();
			sonuc=a+b;
			System.out.println("Toplama sonuc: "+ sonuc);
			break;
		case '-':
			System.out.println("Çıkarılcak rakamı girin: ");
			a=girdi.nextFloat();
			System.out.println("Çıkacak rakamı girin: ");
			b=girdi.nextFloat();
			sonuc=a-b;
			System.out.println("Sonuç: "+ sonuc);
			break;
		case '/':
			System.out.println("Bölünecek rakamı girin: ");
			a=girdi.nextFloat();
			System.out.println("Bölecek rakamı girin: ");
			b=girdi.nextFloat();
			float kalan;
			sonuc=a/b;
			kalan=a%b;
			System.out.println("Sonuç: "+ sonuc);
			System.out.println("Bölümden Kalan: "+ kalan);
			break;
		case '*':
			System.out.println("Birinci rakamı girin: ");
			a=girdi.nextFloat();
			System.out.println("İkinci rakamı girin: ");
			b=girdi.nextFloat();
			sonuc=a*b;
			System.out.println("Sonuç: "+ sonuc);
			break;

		default:
			System.out.println("Hatalı İşlem");
			break;
		}

	}

}
