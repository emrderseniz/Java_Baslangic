import java.util.Scanner;

public class Diziler {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		int n, indis = 0;
		int[] liste1 = new int[100];
		
		do {
			System.out.print("Liste için rakam giriniz (çıkış için 0): ");
			n = girdi.nextInt();
			liste1[indis++] = n;
		} while (n != 0);
		
		for (int i = 0; i < indis - 1; i++) {
			System.out.println(liste1[i]);
		}
		girdi.close();
	}
}
