import java.util.Scanner;

public class LegalYas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner girdi =new Scanner(System.in);
		System.out.println("Yaş giriniz");
		a=girdi.nextInt();
		if(a<18) {
			System.out.println("Uygun değil!");
		}
		else {
			System.out.println("Uygun uygundur!");
		}
	}

}
