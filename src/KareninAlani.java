import java.util.Scanner;

public class KareninAlani {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		int a,b,x;
		System.out.println("Karenin birinci uzunluğunu griniz");
		a=girdi.nextInt();
		System.out.println("Karenin ikinci uzunluğunu griniz");
		b=girdi.nextInt();
		x=a*b;
		System.out.println("Sonuç: "+ x);
		
		girdi.close();
	}

}
