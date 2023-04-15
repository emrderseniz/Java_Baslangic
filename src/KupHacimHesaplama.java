import java.util.Scanner;

public class KupHacimHesaplama {

	public static void main(String[] args) {
		System.out.println("gensiligi giriniz: ");
		Scanner girdi=new Scanner(System.in);
		int a,b,h,hacim;
		a=girdi.nextInt();
		System.out.println("uzunlugu giriniz: ");
		b=girdi.nextInt();
		System.out.println("yuksekligi giriniz: ");
		h=girdi.nextInt();
		hacim=a*b*h;
		//hacim *= h;
		System.out.println("küpün hacim değeri: "+ hacim);
	}

}
