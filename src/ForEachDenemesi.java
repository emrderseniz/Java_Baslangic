import java.util.Scanner;

public class ForEachDenemesi {

	public static void main(String[] args) {
		Scanner girdi=new Scanner(System.in);
		int stun,satir;
		System.out.print("Matrix için satir sayisi girin:");
		satir=girdi.nextInt();
		System.out.print("Matrix için stun sayisi girin:");
		stun=girdi.nextInt();
		int[][] liste1 =new int[satir][stun];
		
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < stun; j++) {
				System.out.print("[" + i + "][" + j + "] elemanını girin: ");
				liste1[i][j]=girdi.nextInt();
				
			}
			
		}
		// İlk foreach döngüsü, liste1 dizisindeki her bir satırın (yani alt-dizinin) elemanlarını tek tek alır
		for(int[] k : liste1) {
		    // İkinci foreach döngüsü, her bir satırdaki elemanları tek tek alır
			    for(int deger2 : k) {
		        // Her bir eleman yazdırılır ve bir virgül ve boşluk ile ayrılır
		        System.out.print(deger2 + ", ");
		    }
		    // Satırın sonuna geldiğimizde alt satıra geçilir
		    System.out.println();

	}
girdi.close();
}

}