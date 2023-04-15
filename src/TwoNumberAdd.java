import java.util.Scanner;

public class TwoNumberAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner girdi = new Scanner(System.in);
		int a,b,x;
		System.out.println("birinci sayı: ");
		a=girdi.nextInt();
		System.out.println("ikinci sayı: ");
		b=girdi.nextInt();
		x=a+b;
		System.out.println("sonuc: "+x);
	}

}
